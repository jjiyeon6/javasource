package day4;

import java.util.ArrayList;

class Test{
	private int x;
	private int y;
	private ArrayList<String> str;
	
	//�Ķ���;��� ����Ʈ �����ڴ� �ڵ�����������
	//�Ķ���� �ִ� �����ڸ� �ϳ��� ���������� ����Ʈ �����ڵ� ���� ��������� �Ѵ�.
	public Test() {
		str = new ArrayList<String>();
		str.add("aaa");
		str.add("bbb");
		str.add("ccc");
	}
	
	public Test(Test t) {//�Ķ���͸� ��ü�� �޴� ������
		this();//�ٸ� �����ڸ� ȣ�� cf.)super();����Ŭ������ ������ȣ��
				//ù°�ٿ� ��ߵ�
		x = t.x;
		y = t.y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	//�Ķ���ͷ� ũ�Ⱑ 2�� �迭�� �޾� �迭���� ������ x,y�� �ʱ�ȭ�ϴ� �޼ҵ�
	public void method1(int[] arr) {
		x = arr[0];
		y = arr[1];
	}
	
	public int getStr(String s) {
		return str.indexOf(s);
//		if(str.contains(s)) {
//			return str.indexOf(s);
//		}
//		return -1;
	}
	
	// �� ���� ��ü�� ������ ���� equals() �������ؼ� ���

	public String allStr() {
//		return str.toString();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.size(); i++) {
//			if(i!=0) {
//				sb.append(",");
//			}
			sb.append(str.get(i));
		}
		return sb.toString();
	}
	
	public ArrayList<String> getStr() {
		return str;
	}

	public void setStr(ArrayList<String> str) {
		this.str = str;
	}
	
	//���� ��ü�� ��ȯ�ϴ� �Լ�
	public Test getTest() {
		return this;
	}

	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}
}

public class TestMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 20};
		Test t = new Test();
		t.method1(a);
		System.out.println("t:"+t);
		
//		���� ����� �ܼ��� �ʵ尪�� �����ؼ� ��ü�� ����. �ʵ尡 ����Ÿ���� ��� ��ü�� ������ �����
//		���� ��ü�� �ʵ�� ����� ��ü�� �ʵ�� ���� ��ü�� ������
//		�׷��� ����� ��ü���� ���� ��ü�� �����ϸ� ���� ��ü�� ����� ��ü�� ������ ��		
//		Test t2 = t;	//���� ����(���� �޸� ���. t�޸�)
		
//		System.out.println("t2:"+t2);
//		t2.setX(100);
//		t2.setY(200);
//		System.out.println("t:"+t);
		
		Test t2 = new Test(t);//
		t2.setX(100);
		t2.setY(200);
		System.out.println("t:"+t);
		System.out.println("t2:"+t2);
		
//		System.out.println(t.getStr("ccc"));
//		System.out.println(t.allStr());
		
		Test t3 = t.getTest();
		System.out.println("t3:"+t3);
		
	}

}
