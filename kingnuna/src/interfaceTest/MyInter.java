package interfaceTest;

public interface MyInter {
	//���
	int MAX = 10;//���(final static ����). �����԰� ���ÿ� �ʱⰪ ����
	void test1();//(public abstract ����)
	//�߻�޼ҵ�
	int test2();//(public abstract ����)
}

//�߻�Ŭ���� -��ӹ��� Ŭ������ �Ϻθ�
//abstract class Test1 implements MyInter{

//�ڹٴ� ���ϻ��
//�������̽��� ���߻�� ����
//�������̽��� ���۳�Ʈ�� ���۳�Ʈ�� ������� ���
//�������̽��� �߻�޼ҵ带 ���� �س���
class Test1 implements MyInter{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Test1:test1");
	}

	@Override
	public int test2() {
		// TODO Auto-generated method stub
		System.out.println("Test1:test2");
		return MAX;
	}
	
}

class Test2 implements MyInter{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Test2:test1");
	}

	@Override
	public int test2() {
		// TODO Auto-generated method stub
		System.out.println("Test2:test2");
		return MAX;
	}
	
}