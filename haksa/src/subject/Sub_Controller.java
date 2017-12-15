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
	      String TERMINATE = ";"; // 종료문자
	      
	     
	      System.out.println(">>내용 입력 후 마지막줄에 콜론(;)을 입력하세요");
	      
	      int lines = 0; // 팁: 한줄도 입력되지 않은 경우 삭제하기.
	      Path path = Paths.get(www);

	      try(FileWriter fw = new FileWriter(path.toFile())){
	    	 
	         while(sc.hasNext()) {
	            String line = sc.nextLine();
	            if( TERMINATE.equals(line) ) { // 현재 글자가 ;이면.
	               fw.flush();
	               break;
	            }
	            lines++;
	            fw.write(line);  // scanner로 line을 읽으면, 끝의 줄바꿈 문자가 제거됨.
	            fw.write(System. lineSeparator()); // 줄바꿈. Java7 부터는 줄구분자는 System.lineSeparator() 을 사용하면 됩니다.            
	         }
	      } catch(IOException e) {
	         System.out.println("입출력 오류");
	      }
	      if(lines == 0) { // 팁: 한줄도 입력하지 않은 경우, 취소 처리함.
	         try {
	            Files.delete(path);
	         } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         } // 파일 삭제. java.nio.file.Files를 import 해야함.
	         System.out.println(">>취소되었습니다.");
	      } else {
	         System.out.println(">>파일이 저장되었습니다.");
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
		
		System.out.println("과목을 추가합니다");
		System.out.print("과목번호:");
		Subject_Dto sd = new Subject_Dto();
		sd.setSub_num(sc.nextInt());
		System.out.print("과목명:");
		sd.setSub_name(sc.next());
		sd.setPro_name(Controller.getname());
		System.out.print("강의실:");
		sd.setSpe_name(sc.next());
		System.out.println("강의시간을 입력해주세요");
		System.out.println("시간:1.9-10 2.10-11 3.11-12 4.12-1 5.1-2 6.2-3 7.3-4");
		System.out.print("시간:");
		sd.setTime(sc.next());
		System.out.println("강의 요일을 입력해주세요");
		System.out.println("요일:1.일 2.월 3.화 4.수 5.목 6.금 7.토");
		System.out.print("요일:");
		sd.setDay(sc.next());
		System.out.print("강의계획서를 위한 경로:");
		sd.setWww(sc.next());
		System.out.println("강의계획서를 작성해주세요:");
		m_file(sd.getWww());
		serviceJ.addSubject(sd);
		
	}

	public void selectAllsub() {
		System.out.println(member.Controller.loginNum+" "+Controller.getname());
		System.out.println("과목 전체 검색");
		printAll(serviceJ.searchallsubject());

	}

	public Subject_Dto selectnum_sub(Scanner sc) {
		System.out.println(member.Controller.loginNum+" "+Controller.getname());
		System.out.println("과목검색");
		System.out.println("과목넘버를 입력하세요");
		int sub_num = sc.nextInt();
		Subject_Dto sd = serviceJ.searchnumsubject(sub_num);
		if (sd == null) {
			System.out.println("찾는 과목이 없습니다");
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
			System.out.println("과목수정");
			System.out.print("수정할 과목번호를 확인하겠습니다:");

			int sub_num = sc.nextInt();
			Subject_Dto sd = serviceJ.searchnumsubject(sub_num);

			if (sd == null) {
				System.out.println("없는 과목입니다 ");
				return;
			} else {
				System.out.println("수정전 내용을 한번 더 확인하세요");
				System.out.println(sd);

			}


			if (sd.getPro_name().equals(Controller.getname())) {
				System.out.println("수정하실 번호를 선택하세요");
				System.out.print(":");
				sub_num = sc.nextInt();
				if (sub_num == sd.getSub_num()) {
					System.out.println("과목을 수정합니다");
					System.out.print("과목번호:");			
					sd.setSub_num(sc.nextInt());
					System.out.print("과목명:");
					sd.setSub_name(sc.next());
					System.out.print("교수명:");
					sd.setPro_name(sc.next());
					System.out.print("강의실:");
					sd.setSpe_name(sc.next());
					System.out.print("시간:");
					sd.setTime(sc.next());
					System.out.print("요일:");
					sd.setDay(sc.next());
					serviceJ.editSubject(sd);
					
				} else {
					System.out.println("과목번호가 다릅니다");
				}
			} else {
				System.out.println("남의 과목은 수정할 수 없습니다");
			}
		}
	

		
			



	public void delsubject(Scanner sc) {
		System.out.println(member.Controller.loginNum+" "+Controller.getname());
		System.out.println("과목삭제");
		System.out.print("삭제할 과목번호를 확인하겠습니다:");

		int sub_num = sc.nextInt();
		Subject_Dto sd = serviceJ.searchnumsubject(sub_num);

		if (sd == null) {
			System.out.println("없는 과목입니다 ");
			return;
		} else {
			System.out.println("삭제전 내용을 한번 더 확인하세요");
			System.out.println(sd);

		}


		if (sd.getPro_name().equals(Controller.getname())) {
			System.out.println("삭제하실 번호를 선택하세요");
			System.out.print(":");
			sub_num = sc.nextInt();
			if (sub_num == sd.getSub_num()) {
				System.out.println("삭제할 과목넘버를 입력하세요");
			sub_num = sc.nextInt();
			serviceJ.delSubject(sub_num);
			System.out.println("과목이 삭제되었습니다");
		
			} else {
				System.out.println("과목번호가 다릅니다");
			}
		} else {
			System.out.println("남의 과목은 삭제할 수 없습니다");
		}
	}


	

	public Subject_Dto select_Syl(Scanner sc) {
		System.out.println(member.Controller.loginNum+" "+Controller.getname());
		System.out.println("과목검색");
		System.out.println("과목넘버를 입력하세요");
		int sub_num = sc.nextInt();
		Subject_Dto sd = serviceJ.searchnumsubject(sub_num);
		if (sd == null) {
			System.out.println("찾는 과목이 없습니다");
		} else {
			System.out.println(sd);
			r_syllabus(sd.getWww());
			
		}
		return sd;
	}
		
	}





