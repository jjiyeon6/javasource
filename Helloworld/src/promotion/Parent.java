package promotion;

public class Parent {
	
	public void method1(Parent parent) {//method�� ParentŬ������ �Ű������� ���� 
		if(parent instanceof Child) {//parent�� Child�� �� �� �ִ��� Ȯ��
			System.out.println("Parent�� Child�� ���� ����ȯ ����");
		} else {
			System.out.println("Parent�� Child�� ��ȯ �Ұ� x");
		}
	}
	
	public void method2(Parent parent) {
		if(parent instanceof Parent) {
			System.out.println("Parent�� Parent�� ���� ����ȯ ����");
		} else {
			System.out.println("Parent�� Parent�� ���� ����ȯ �Ұ���");
		}
	}
}
