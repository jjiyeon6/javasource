package subject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;




public class Sub_Controller {

	private Service serviceJ;
	private member.Controller Controller;

	public Sub_Controller() {
		serviceJ = new ServiceImpl();
		Controller= new member.Controller();
	}

	public void printAll(ArrayList<Subject_Dto> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public void m_file(String www) {
		 Scanner sc = new Scanner(System.in);
	      String TERMINATE = ";"; // ���Ṯ��
	      
	     
	      System.out.println(">>���� �Է� �� �������ٿ� �ݷ�(;)�� �Է��ϼ���");
	      
	      int lines = 0; // ��: ���ٵ� �Էµ��� ���� ��� �����ϱ�.
	      Path path = Paths.get(www);

	      try(FileWriter fw = new FileWriter(path.toFile())){
	    	 
	         while(sc.hasNext()) {
	            String line = sc.nextLine();
	            if( TERMINATE.equals(line) ) { // ���� ���ڰ� ;�̸�.
	               fw.flush();
	               break;
	            }
	            lines++;
	            fw.write(line);  // scanner�� line�� ������, ���� �ٹٲ� ���ڰ� ���ŵ�.
	            fw.write(System. lineSeparator()); // �ٹٲ�. Java7 ���ʹ� �ٱ����ڴ� System.lineSeparator() �� ����ϸ� �˴ϴ�.            
	         }
	      } catch(IOException e) {
	         System.out.println("����� ����");
	      }
	      if(lines == 0) { // ��: ���ٵ� �Է����� ���� ���, ��� ó����.
	         try {
	            Files.delete(path);
	         } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         } // ���� ����. java.nio.file.Files�� import �ؾ���.
	         System.out.println(">>��ҵǾ����ϴ�.");
	      } else {
	         System.out.println(">>������ ����Ǿ����ϴ�.");
	      }
	}
	
	public void r_syllabus(String www) {

		try {
			FileReader fis = new FileReader(www);

			int readCharNo;
			char[] d = new char[100];
			while ((readCharNo = fis.read(d)) != -1) {
				String data = new String(d, 0, readCharNo);
				System.out.println(data);
			}
			fis.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void addorder(Scanner sc) {
	
		System.out.println(member.Controller.loginNum+" "+Controller.getname());
		
		System.out.println("������ �߰��մϴ�");
		System.out.print("�����ȣ:");
		Subject_Dto sd = new Subject_Dto();
		sd.setSub_num(sc.nextInt());
		System.out.print("�����:");
		sd.setSub_name(sc.next());
		sd.setPro_name(Controller.getname());
		System.out.print("���ǽ�:");
		sd.setSpe_name(sc.next());
		System.out.println("���ǽð��� �Է����ּ���");
		System.out.println("�ð�:1.9-10 2.10-11 3.11-12 4.12-1 5.1-2 6.2-3 7.3-4");
		System.out.print("�ð�:");
		sd.setTime(sc.next());
		System.out.println("���� ������ �Է����ּ���");
		System.out.println("����:1.�� 2.�� 3.ȭ 4.�� 5.�� 6.�� 7.��");
		System.out.print("����:");
		sd.setDay(sc.next());
		System.out.print("���ǰ�ȹ���� ���� ���:");
		sd.setWww(sc.next());
		System.out.println("���ǰ�ȹ���� �ۼ����ּ���:");
		m_file(sd.getWww());
		serviceJ.addSubject(sd);
		
	}

	public void selectAllsub() {
		System.out.println(member.Controller.loginNum+" "+Controller.getname());
		System.out.println("���� ��ü �˻�");
		printAll(serviceJ.searchallsubject());

	}

	public Subject_Dto selectnum_sub(Scanner sc) {
		System.out.println(member.Controller.loginNum+" "+Controller.getname());
		System.out.println("����˻�");
		System.out.println("����ѹ��� �Է��ϼ���");
		int sub_num = sc.nextInt();
		Subject_Dto sd = serviceJ.searchnumsubject(sub_num);
		if (sd == null) {
			System.out.println("ã�� ������ �����ϴ�");
		} else {
			System.out.println(sd);

		}
		return sd;
	}
	
	public Subject_Dto selectnum_sub(int sub_num) {
		return serviceJ.searchnumsubject(sub_num);
	}

	public void editsubject(Scanner sc) {

			System.out.println(member.Controller.loginNum+" "+Controller.getname());
			System.out.println("�������");
			System.out.print("������ �����ȣ�� Ȯ���ϰڽ��ϴ�:");

			int sub_num = sc.nextInt();
			Subject_Dto sd = serviceJ.searchnumsubject(sub_num);

			if (sd == null) {
				System.out.println("���� �����Դϴ� ");
				return;
			} else {
				System.out.println("������ ������ �ѹ� �� Ȯ���ϼ���");
				System.out.println(sd);

			}


			if (sd.getPro_name().equals(Controller.getname())) {
				System.out.println("�����Ͻ� ��ȣ�� �����ϼ���");
				System.out.print(":");
				sub_num = sc.nextInt();
				if (sub_num == sd.getSub_num()) {
					System.out.println("������ �����մϴ�");
					System.out.print("�����ȣ:");			
					sd.setSub_num(sc.nextInt());
					System.out.print("�����:");
					sd.setSub_name(sc.next());
					System.out.print("������:");
					sd.setPro_name(sc.next());
					System.out.print("���ǽ�:");
					sd.setSpe_name(sc.next());
					System.out.print("�ð�:");
					sd.setTime(sc.next());
					System.out.print("����:");
					sd.setDay(sc.next());
					serviceJ.editSubject(sd);
					
				} else {
					System.out.println("�����ȣ�� �ٸ��ϴ�");
				}
			} else {
				System.out.println("���� ������ ������ �� �����ϴ�");
			}
		}
	

		
			



	public void delsubject(Scanner sc) {
		System.out.println(member.Controller.loginNum+" "+Controller.getname());
		System.out.println("�������");
		System.out.print("������ �����ȣ�� Ȯ���ϰڽ��ϴ�:");

		int sub_num = sc.nextInt();
		Subject_Dto sd = serviceJ.searchnumsubject(sub_num);

		if (sd == null) {
			System.out.println("���� �����Դϴ� ");
			return;
		} else {
			System.out.println("������ ������ �ѹ� �� Ȯ���ϼ���");
			System.out.println(sd);

		}


		if (sd.getPro_name().equals(Controller.getname())) {
			System.out.println("�����Ͻ� ��ȣ�� �����ϼ���");
			System.out.print(":");
			sub_num = sc.nextInt();
			if (sub_num == sd.getSub_num()) {
				System.out.println("������ ����ѹ��� �Է��ϼ���");
			sub_num = sc.nextInt();
			serviceJ.delSubject(sub_num);
			System.out.println("������ �����Ǿ����ϴ�");
		
			} else {
				System.out.println("�����ȣ�� �ٸ��ϴ�");
			}
		} else {
			System.out.println("���� ������ ������ �� �����ϴ�");
		}
	}


	

	public Subject_Dto select_Syl(Scanner sc) {
		System.out.println(member.Controller.loginNum+" "+Controller.getname());
		System.out.println("����˻�");
		System.out.println("����ѹ��� �Է��ϼ���");
		int sub_num = sc.nextInt();
		Subject_Dto sd = serviceJ.searchnumsubject(sub_num);
		if (sd == null) {
			System.out.println("ã�� ������ �����ϴ�");
		} else {
			System.out.println(sd);
			r_syllabus(sd.getWww());
			
		}
		return sd;
	}
		
	}





