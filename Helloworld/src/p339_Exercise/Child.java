package p339_Exercise;

public class Child extends Parent {
/*
	private int studentNo;
	
	public Child(String name, int studentNo) {
//		this.name = name;
		super(name);
		this.studentNo = studentNo;
	}

	//p339 question5.
	//�θ�Ŭ������ �⺻ �����ڰ� ����, �Ű� ������ �ִ� �����ڸ� �ִٸ� 
	//�ڽ� �����ڿ��� �ݵ�� �θ� ������ ȣ���� ����  super(�Ű���)�� ��������� ȣ���ؾ� �Ѵ�.
	//super(�Ű���)�� �ݵ�� �ڽ� ������ ù �ٿ� ��ġ�ؾ� �Ѵ�.
	
*/
	
	private String name;
	
	public Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
	
}
