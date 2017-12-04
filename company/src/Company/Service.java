package Company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Service {
   private Dao dao;
   private Scanner sc;
   public Service(Scanner sc) {
      dao = new Dao();
      this.sc = sc;
   }
   
   public void run() {
	   boolean flag = true;
	   int menu = 0;
	   while(flag) {
			System.out.println("1.�߰� 2.�˻� 3.���� 4.���� 5.��ü��� 6.����");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				addProduct();
				break;
			case 2:
				getProduct();
				break;
			case 3:
				editProduct();
				break;
			case 4:
				delProduct();
				break;
			case 5:
				printAll();
				break;
			case 6:
				flag = false;
				break;
			}
		}
   }
   
   public Dao getDao() {
	   return dao;
   }
   
   public void addProduct() {
      System.out.println("�� ��ǰ �߰�");
      System.out.print("name : ");
      String name = sc.next();
      System.out.print("price : ");
      int price = sc.nextInt();
      System.out.print("num : ");
      int num = sc.nextInt();
      dao.add(new Product(name, price, num));
   }
   
   public Product getProduct() {
      System.out.println("��ǰ �˻�");
      System.out.print("sno : ");
      int sno = sc.nextInt();

      Product p = dao.get(sno);
	  if(p != null) {
		  System.out.println("��ǰ��ȣ: " + p.getSno() + " �̸�: " +
	        		p.getName() + " ����: " + p.getPrice() + " ����: " + p.getNum());  
		  return p;
	  }
      else {
         System.out.println("���� ��ǰ");
         return null;
      }
   }
   
// Product p2 = new Product();
// p2.setSno(sno);
// Product p = dao.get(p2);

   
   public void printAll() {
      System.out.println("��ü ���");
      ArrayList<Product> d = dao.getAll();   
      Iterator<Product> it = d.iterator();  
      Product p = null;
      while(it.hasNext()) {               
    	 p = it.next();
    	 System.out.println("��ǰ��ȣ: " + p.getSno() + " �̸�: " +
	        		p.getName() + " ����: " + p.getPrice() + " ����: " + p.getNum());  
      }
   }
   
   public void editProduct() {
      System.out.println("��ǰ ����");
      System.out.print("sno : ");
      int sno = sc.nextInt();
      System.out.print("new price : ");
      int price = sc.nextInt();
      System.out.print("new num : ");
      int num = sc.nextInt();
      if(dao.edit(new Product(sno, "", price, num))) {
         System.out.println("������ ����ó�� �Ǿ���");
      }
   }
   
   public void delProduct() {
      System.out.println("��ǰ ����");
      System.out.print("sno : ");
      int sno = sc.nextInt();
      if(dao.delete(new Product(sno, "", 0, 0))) {
         System.out.println("������ ����ó�� �Ǿ���");
      }
   }
}