package board;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import member.Controller;

public class BoardController {
	private Service serviceB;
	private SimpleDateFormat format;
	private Date date;
	private String dateStr;

	public BoardController() {
		serviceB = new ServiceImpl();
		format = new SimpleDateFormat("yyyyMMddHHmmss");
		date = new Date();
		dateStr = format.format(date);
	}

	public boolean loginCheck() {
		return Controller.loginNum.equals("");
	}

	public void write(Scanner sc) {
		if (loginCheck()) {
			System.out.println("로그인하세요");
			return;
		}
		System.out.println("글작성");
		Board b = new Board();
		String stu_num = Controller.loginNum;
		b.setStu_num(stu_num);
		System.out.println("제목:");
		sc.nextLine();
		b.setTitle(sc.nextLine());
		System.out.println("내용:");
		b.setContent(sc.nextLine());
		
		fileWrite(sc);
//		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
//		Date date = new Date();
//		String dateStr = format.format(date);
		b.setW_file("첨부파일_"+dateStr);
		
		System.out.println("등록하시겠습니까?\n1.예 2.아니오");
		int result = sc.nextInt();
		if (result == 1) {
			System.out.println("글비밀번호:");
			b.setW_pwd(sc.next());
			serviceB.addArticle(b);
			System.out.println("새글이 등록되었습니다");
		} else {
			System.out.println("취소되었습니다");
		}
		
//		System.out.println(b);
	}
	
//	private static String TERMINATE = "."; // 종료문자
	public void fileWrite(Scanner sc) {
		String TERMINATE = "."; // 종료문자
		
//		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
//		Date date = new Date();
//		String dateStr = format.format(date);
		
		System.out.println("첨부파일 내용:");
		System.out.println(">>내용 입력 후 마지막줄에 마침표(.)를 입력하세요");
		
		int lines = 0; // 팁: 한줄도 입력되지 않은 경우 삭제하기.
		Path path = Paths.get("C:\\TEMP\\첨부파일_"+dateStr+".txt");

		try(FileWriter fw = new FileWriter(path.toFile())){

			while(sc.hasNext()) {
				String line = sc.nextLine();
				if( TERMINATE.equals(line) ) { // 현재 글자가 마침표이면.
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

	
	public void fileRead(int num) {
		
//		System.out.println("fileRead");
		
//		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
//		Date date = new Date();
//		String dateStr = format.format(date);
//		Path path = Paths.get("C:\\TEMP\\첨부파일_"+dateStr+".txt");
		
		Board b = serviceB.getArticle(num);
		System.out.println(b);
		String filename = b.getW_file();
		System.out.println(filename);
		Path path = Paths.get("C:\\TEMP\\"+filename+".txt");
		
		FileReader fr = null;
		
		int i = 0;
		try{
			// sample.txt 파일을 읽을 FileReader 객체를 생성한다.
//			fr = new FileReader(file);
			if(path.toFile().exists()) {
			fr = new FileReader(path.toFile());

			// sample.txt 파일의 끝까지 읽으면서 콘솔에 출력한다.
				while((i=fr.read())!=-1){
					System.out.print((char)i);
				}
			} else {
				System.out.println("파일이 없습니다");
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(fr != null) try{fr.close();}catch(IOException e){}
		}
	}
	
	public void fileDelete(int num) {
		
		Board b = serviceB.getArticle(num);
		System.out.println(b);
		String filename = b.getW_file();
		System.out.println(filename);
		File file = new File("C:\\TEMP\\"+filename+".txt");
		if(file.exists()) {
			if(file.delete()) {
			System.out.println("파일삭제 성공");
			} else {
			System.out.println("파일삭제 실패");
			}
		} else {
				System.out.println("파일이 존재하지 않습니다");
		}
		
		
	}
	
	public void getDetail(Scanner sc) {
		System.out.println("글상세내용");
		System.out.println("글번호 선택:");
		int num = sc.nextInt();
		Board b = serviceB.getArticle(num);
		if (b == null) {
			System.out.println("선택한 글이 없습니다");
		} else {
			System.out.println(b.getInfo());
			fileRead(num);
		}
	}

	public void getByNum(Scanner sc) {
		System.out.println("글 번호로 검색");
		System.out.print("글 번호:");
		int num = sc.nextInt();
		Board b = serviceB.getArticle(num);
		if (b == null) {
			System.out.println("검색한 글이 없습니다");
		} else {
			System.out.println(b);
		}
	}

	public void printAll(ArrayList<Board> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public void getByWriter(Scanner sc) {
		System.out.println("글 작성자로 검색");
		System.out.print("작성자 번호:");
		String stu_num = sc.next();
		ArrayList<Board> list = serviceB.getArticleByWriter(stu_num);
		if (list.size() == 0) {
			System.out.println(stu_num + "가 작성한 글이 없습니다");
		} else {
			printAll(list);
		}
	}

	public void getByTitle(Scanner sc) {
		System.out.println("글 제목으로 검색");
		System.out.print("제목:");
		String title = sc.next();
		ArrayList<Board> list = serviceB.getArticleByTitle(title);
		if (list.size() == 0) {
			System.out.println("검색된 글이 없습니다");
		} else {
			printAll(list);
		}
	}

	public void getAll() {
		System.out.println("글 전체 검색");
		printAll(serviceB.getAll());
	}

	public void editArticle(Scanner sc) {
		if (loginCheck()) {
			System.out.println("로그인하세요");
			return;
		}
		System.out.println("글 수정");
		System.out.print("수정할 글번호:");
		int num = sc.nextInt();
		String pwd = "";
		Board b = serviceB.getArticle(num);
		if (b == null) {
			System.out.println("검색된 글이 없습니다");
			return;
		} else {
			System.out.println("수정전 내용");
//			System.out.println(b);
			System.out.println(b.getInfo());
			fileRead(num);
		}
		if (b.getStu_num().equals(Controller.loginNum)) {
			System.out.print("글 비밀번호:");
			pwd = sc.next();
			if (pwd.equals(b.getW_pwd())) {
				System.out.print("new 제목:");
				b.setTitle(sc.next());
				System.out.print("new 내용:");
				b.setContent(sc.next());
				System.out.print("new 첨부파일:");
				fileWrite(sc);
				serviceB.editArticle(b);
				System.out.println("수정되었습니다");
			} else {
				System.out.println("글 비밀번호가 맞지 않습니다");
			}
		} else {
			System.out.println("본인이 작성한 글만 수정할 수 있습니다");
		}
	}

	public void delArticle(Scanner sc) {
		if (loginCheck()) {
			System.out.println("로그인하세요");
			return;
		}
		System.out.println("글 삭제");
		System.out.print("삭제할 글번호:");
		int num = sc.nextInt();
		String pwd = "";
		Board b = serviceB.getArticle(num);
		if (b == null) {
			System.out.println("검색된 글이 없습니다");
			return;
		}
		if (b.getStu_num().equals(Controller.loginNum)) {
			System.out.print("글 비밀번호:");
			pwd = sc.next();
			if (pwd.equals(b.getW_pwd())) {
				fileDelete(num);
				serviceB.delArticle(num);
				System.out.println("삭제되었습니다");
			} else {
				System.out.println("글 비밀번호가 맞지 않습니다");
			}
		} else {
			System.out.println("본인이 작성한 글만 삭제할 수 있습니다");
		}
	}
}
