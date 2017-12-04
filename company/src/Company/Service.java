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
			System.out.println("1.추가 2.검색 3.수정 4.삭제 5.전체룰력 6.종료");
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
      System.out.println("새 제품 추가");
      System.out.print("name : ");
      String name = sc.next();
      System.out.print("price : ");
      int price = sc.nextInt();
      System.out.print("num : ");
      int num = sc.nextInt();
      dao.add(new Product(name, price, num));
   }
   
   public Product getProduct() {
      System.out.println("제품 검색");
      System.out.print("sno : ");
      int sno = sc.nextInt();

      Product p = dao.get(sno);
	  if(p != null) {
		  System.out.println("제품번호: " + p.getSno() + " 이름: " +
	        		p.getName() + " 가격: " + p.getPrice() + " 갯수: " + p.getNum());  
		  return p;
	  }
      else {
         System.out.println("없는 제품");
         return null;
      }
   }
   
// Product p2 = new Product();
// p2.setSno(sno);
// Product p = dao.get(p2);

   
   public void printAll() {
      System.out.println("전체 출력");
      ArrayList<Product> d = dao.getAll();   
      Iterator<Product> it = d.iterator();  
      Product p = null;
      while(it.hasNext()) {               
    	 p = it.next();
    	 System.out.println("제품번호: " + p.getSno() + " 이름: " +
	        		p.getName() + " 가격: " + p.getPrice() + " 갯수: " + p.getNum());  
      }
   }
   
   public void editProduct() {
      System.out.println("제품 수정");
      System.out.print("sno : ");
      int sno = sc.nextInt();
      System.out.print("new price : ");
      int price = sc.nextInt();
      System.out.print("new num : ");
      int num = sc.nextInt();
      if(dao.edit(new Product(sno, "", price, num))) {
         System.out.println("수정이 정상처리 되었음");
      }
   }
   
   public void delProduct() {
      System.out.println("제품 삭제");
      System.out.print("sno : ");
      int sno = sc.nextInt();
      if(dao.delete(new Product(sno, "", 0, 0))) {
         System.out.println("삭제가 정상처리 되었음");
      }
   }
}