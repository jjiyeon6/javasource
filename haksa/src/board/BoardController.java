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
			System.out.println("�α����ϼ���");
			return;
		}
		System.out.println("���ۼ�");
		Board b = new Board();
		String stu_num = Controller.loginNum;
		b.setStu_num(stu_num);
		System.out.println("����:");
		sc.nextLine();
		b.setTitle(sc.nextLine());
		System.out.println("����:");
		b.setContent(sc.nextLine());
		
		fileWrite(sc);
//		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
//		Date date = new Date();
//		String dateStr = format.format(date);
		b.setW_file("÷������_"+dateStr);
		
		System.out.println("����Ͻðڽ��ϱ�?\n1.�� 2.�ƴϿ�");
		int result = sc.nextInt();
		if (result == 1) {
			System.out.println("�ۺ�й�ȣ:");
			b.setW_pwd(sc.next());
			serviceB.addArticle(b);
			System.out.println("������ ��ϵǾ����ϴ�");
		} else {
			System.out.println("��ҵǾ����ϴ�");
		}
		
//		System.out.println(b);
	}
	
//	private static String TERMINATE = "."; // ���Ṯ��
	public void fileWrite(Scanner sc) {
		String TERMINATE = "."; // ���Ṯ��
		
//		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
//		Date date = new Date();
//		String dateStr = format.format(date);
		
		System.out.println("÷������ ����:");
		System.out.println(">>���� �Է� �� �������ٿ� ��ħǥ(.)�� �Է��ϼ���");
		
		int lines = 0; // ��: ���ٵ� �Էµ��� ���� ��� �����ϱ�.
		Path path = Paths.get("C:\\TEMP\\÷������_"+dateStr+".txt");

		try(FileWriter fw = new FileWriter(path.toFile())){

			while(sc.hasNext()) {
				String line = sc.nextLine();
				if( TERMINATE.equals(line) ) { // ���� ���ڰ� ��ħǥ�̸�.
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

	
	public void fileRead(int num) {
		
//		System.out.println("fileRead");
		
//		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
//		Date date = new Date();
//		String dateStr = format.format(date);
//		Path path = Paths.get("C:\\TEMP\\÷������_"+dateStr+".txt");
		
		Board b = serviceB.getArticle(num);
		System.out.println(b);
		String filename = b.getW_file();
		System.out.println(filename);
		Path path = Paths.get("C:\\TEMP\\"+filename+".txt");
		
		FileReader fr = null;
		
		int i = 0;
		try{
			// sample.txt ������ ���� FileReader ��ü�� �����Ѵ�.
//			fr = new FileReader(file);
			if(path.toFile().exists()) {
			fr = new FileReader(path.toFile());

			// sample.txt ������ ������ �����鼭 �ֿܼ� ����Ѵ�.
				while((i=fr.read())!=-1){
					System.out.print((char)i);
				}
			} else {
				System.out.println("������ �����ϴ�");
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
			System.out.println("���ϻ��� ����");
			} else {
			System.out.println("���ϻ��� ����");
			}
		} else {
				System.out.println("������ �������� �ʽ��ϴ�");
		}
		
		
	}
	
	public void getDetail(Scanner sc) {
		System.out.println("�ۻ󼼳���");
		System.out.println("�۹�ȣ ����:");
		int num = sc.nextInt();
		Board b = serviceB.getArticle(num);
		if (b == null) {
			System.out.println("������ ���� �����ϴ�");
		} else {
			System.out.println(b.getInfo());
			fileRead(num);
		}
	}

	public void getByNum(Scanner sc) {
		System.out.println("�� ��ȣ�� �˻�");
		System.out.print("�� ��ȣ:");
		int num = sc.nextInt();
		Board b = serviceB.getArticle(num);
		if (b == null) {
			System.out.println("�˻��� ���� �����ϴ�");
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
		System.out.println("�� �ۼ��ڷ� �˻�");
		System.out.print("�ۼ��� ��ȣ:");
		String stu_num = sc.next();
		ArrayList<Board> list = serviceB.getArticleByWriter(stu_num);
		if (list.size() == 0) {
			System.out.println(stu_num + "�� �ۼ��� ���� �����ϴ�");
		} else {
			printAll(list);
		}
	}

	public void getByTitle(Scanner sc) {
		System.out.println("�� �������� �˻�");
		System.out.print("����:");
		String title = sc.next();
		ArrayList<Board> list = serviceB.getArticleByTitle(title);
		if (list.size() == 0) {
			System.out.println("�˻��� ���� �����ϴ�");
		} else {
			printAll(list);
		}
	}

	public void getAll() {
		System.out.println("�� ��ü �˻�");
		printAll(serviceB.getAll());
	}

	public void editArticle(Scanner sc) {
		if (loginCheck()) {
			System.out.println("�α����ϼ���");
			return;
		}
		System.out.println("�� ����");
		System.out.print("������ �۹�ȣ:");
		int num = sc.nextInt();
		String pwd = "";
		Board b = serviceB.getArticle(num);
		if (b == null) {
			System.out.println("�˻��� ���� �����ϴ�");
			return;
		} else {
			System.out.println("������ ����");
//			System.out.println(b);
			System.out.println(b.getInfo());
			fileRead(num);
		}
		if (b.getStu_num().equals(Controller.loginNum)) {
			System.out.print("�� ��й�ȣ:");
			pwd = sc.next();
			if (pwd.equals(b.getW_pwd())) {
				System.out.print("new ����:");
				b.setTitle(sc.next());
				System.out.print("new ����:");
				b.setContent(sc.next());
				System.out.print("new ÷������:");
				fileWrite(sc);
				serviceB.editArticle(b);
				System.out.println("�����Ǿ����ϴ�");
			} else {
				System.out.println("�� ��й�ȣ�� ���� �ʽ��ϴ�");
			}
		} else {
			System.out.println("������ �ۼ��� �۸� ������ �� �ֽ��ϴ�");
		}
	}

	public void delArticle(Scanner sc) {
		if (loginCheck()) {
			System.out.println("�α����ϼ���");
			return;
		}
		System.out.println("�� ����");
		System.out.print("������ �۹�ȣ:");
		int num = sc.nextInt();
		String pwd = "";
		Board b = serviceB.getArticle(num);
		if (b == null) {
			System.out.println("�˻��� ���� �����ϴ�");
			return;
		}
		if (b.getStu_num().equals(Controller.loginNum)) {
			System.out.print("�� ��й�ȣ:");
			pwd = sc.next();
			if (pwd.equals(b.getW_pwd())) {
				fileDelete(num);
				serviceB.delArticle(num);
				System.out.println("�����Ǿ����ϴ�");
			} else {
				System.out.println("�� ��й�ȣ�� ���� �ʽ��ϴ�");
			}
		} else {
			System.out.println("������ �ۼ��� �۸� ������ �� �ֽ��ϴ�");
		}
	}
}
