package shape;

public class Triangle extends Shape {

	private Point[] p;

	public Triangle() {// �迭 �ʱ�ȭ
		p = new Point[3];
		p[0] = new Point(1, 1);
		p[1] = new Point(2, 2);
		p[2] = new Point(3, 3);

//		p = new Point[] {new Point(1,1), new Point(2,2), new Point(3,3)};
	}

	public Triangle(Point[] p) {// �迭�� ���ο��� �����ؼ� �޾ƿ�
		this.p = p;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�ﰢ���� �׸���.");
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}

	}

}
