package goliath;

public class GAll {

	public static void main(String[] args) {

		//�������̽��� ��üȭ�� �� ������
		//�������̽��� ����� �߻� �޼ҵ带 {}�ȿ� �����ؼ� �����Ѵ�.
		//���� Ŭ������ ������ �ʰ� �ѹ��� ����ϱ� ���� ���
		GtoA ga = new GtoA() {
			public void attackAir() {
				System.out.println("�͸� ���� ��ü!");
			}
		};
		
		ga.attackAir();
	}

}
