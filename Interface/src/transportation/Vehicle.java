package transportation;

public interface Vehicle {

	//���  [static final] �������� 
	
	
	//�߻� �޼ҵ�  [abstract] ��������
	public abstract void run();
	
	//default method
	default void electCharge() {
		System.out.println("�������Դϴ�.");
	}
		
}
