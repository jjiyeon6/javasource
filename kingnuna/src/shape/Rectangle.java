package shape;

public class Rectangle extends Shape {

	private Point p1;
	private Point p2;
	private int w;
	private int h;
	
	public Rectangle() {
		p1 = new Point(1,1);
		p2 = new Point(100,100);
		w = 150;
		h = 200;
	}
	
	public Rectangle(Point p1, Point p2, int w, int h) {
		this.p1 = p1;
		this.p2 = p2;
		this.w = w;
		this.h = h;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다.");
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("w: " + w);
		System.out.println("h: " + h);
	}

}
