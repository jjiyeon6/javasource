package dbtest1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
/*		
		// TODO Auto-generated method stub
//		Dao dao = new DaoImpl();
//		dao.insert(new Product(0,"�����",1200,20));
//		System.out.println(dao.select(4));
		
//		dao.insert(new Product(0,"�����", 2200, 10));
//		for(int i=1; i<6; i++) {
//			System.out.println(dao.select(i));
//		}
		
//		System.out.println(dao.selectAll());
		
//		dao.update(new Product(4,"", 3000, 20));
		
//		dao.delete(5);
//		for(int i=1; i<6; i++) {
//		System.out.println(dao.select(i));
//		}
 * 
 */
		Process p = new Process();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int menu;
		while(flag) {
			System.out.println("1.���� 2.������ 3.����");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				p.menuP(sc);
				break;
			case 2:
				p.menuO(sc);
				break;	
			case 3:
				flag = false;
			}
		}
		sc.close();
	}

}
