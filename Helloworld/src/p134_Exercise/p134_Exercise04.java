package p134_Exercise;
//while���� Math.random()�޼ҵ带 �̿��ؼ� �� ���� �ֻ����� ������ �� ������ ���� (��1,��2) ���·� ����ϰ�,
//���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸� ������ ���ߴ� �ڵ踦 �ۼ�
//���� ���� 5�� �Ǵ� ������ (1,4), (4,1), (2,3), (3,2)

public class p134_Exercise04 {

	public static void main(String[] args) {
		
		while (true) {
			int nun1 = (int)(Math.random()*6) +1;	//�ֻ��� ��ȣ �ϳ� �̱�
			int nun2 = (int)(Math.random()*6) +1;	//�ֻ��� ��ȣ �ϳ� �̱�

			if (nun1 + nun2 !=5) {
				System.out.println(nun1+", "+nun2+" ��: "+(nun1+nun2));				
			} else {
				break;
			}
		}
	}
	
}
