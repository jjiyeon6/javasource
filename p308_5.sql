create or replace procedure p308_5
is  
    v_t_seq     trade.t_seq%type;
    v_t_qty     trade.t_qty%type;
    v_t_cost    trade.t_cost%type;
    v_t_tax     trade.t_tax%type;
    v_t_dc      trade.t_dc%type;
    v_cnt       number;

    cursor t_cursor is
    select t_seq, t_qty, t_cost, t_tax, p307_4(t_qty,t_cost) as t_dc 
    from trade;

begin

--t_dc(¿Â∑¡±›) update
    open t_cursor;
    loop
    fetch t_cursor into v_t_seq, v_t_qty, v_t_cost, v_t_tax, v_t_dc;
    exit when t_cursor%notfound;
    dbms_output.put_line(v_t_seq ||', '|| v_t_qty ||', '|| v_t_cost ||', '|| v_t_tax ||', '|| v_t_dc);

    select count(*)
    into v_cnt
    from trade
    where t_seq = v_t_seq
    and t_dc is null;
    
    if v_cnt = 1 then
        update trade
        set t_dc = v_t_dc
        where t_seq = v_t_seq;       
    else    
        null;
    end if;    
    end loop;    
   
    close t_cursor;

--t_tax update    
--t_tax = ((t_qty*t_cost)-t_dc)*0.1 
    open t_cursor;
    loop
    fetch t_cursor into v_t_seq, v_t_qty, v_t_cost, v_t_tax, v_t_dc;
    exit when t_cursor%notfound;
    dbms_output.put_line(v_t_seq ||', '|| v_t_qty ||', '|| v_t_cost ||', '|| v_t_tax ||', '|| v_t_dc);

    select count(*)
    into v_cnt
    from trade
    where t_seq = v_t_seq
    and t_dc = v_t_dc;
    
    if v_cnt = 1 then
        update trade
        set t_tax = ((v_t_qty*v_t_cost)-v_t_dc)*0.1  
        where t_seq = v_t_seq
        and t_dc = v_t_dc;       
    else    
        null;
    end if;    
    end loop;    
   
    close t_cursor;
end p308_5;