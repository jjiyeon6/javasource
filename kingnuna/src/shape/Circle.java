package shape;

public class Circle extends Shape {

	private Point p;
	private int r;
	
	public Circle() {
		p = new Point(10,10);
		r = 10;
	}
	
	public Circle(Point p, int r) {
		this.p = p;
		this.r = r;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
//		p.getX();
//		p.getY();
		System.out.println("���� �׸���");
		System.out.println("�߽��� : " + p + ", ������: "+ r);
	}

}
