
public class IfExample {

	public static void main(String[] args) {

		int score = 89;
		
		char grade = 'A';
		
		//���ǹ�
		if (score != 90) {
			System.out.println("�� ������ 90���� �ƴմϴ�");
		
		} else if (score > 80) {
			System.out.println("�� ������  80�� ���� ũ��");
		
		} else {
			System.out.println("�� ������ " + score);
		}
		
		
		//switch��
		switch (score) {
			case 90 :
				System.out.println("90���̴�");
				break;	//���� case�� �������� ���� switch���� ����������.
			case 89 :
				System.out.println("89���̴�");
//				break;
			case 88 :
				System.out.println("88���̴�");
				break;
			default :
				System.out.println("������ ����");
				break;
		}
		
		switch (grade) {
			case 'A' :
				System.out.println("A�����̴�");
				break;
			case 'B' :
				System.out.println("B�����̴�");
				break;
			case 'C' :
				System.out.println("C�����̴�");
				break;
			default :
				System.out.println("������ ����");
				break;
		}
	
	}

}
