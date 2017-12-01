package shape;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] s = new Shape[6];
		s[0] = new Circle();
		s[1] = new Circle(new Point(100, 200), 30);
		s[2] = new Triangle();
		s[3] = new Triangle(new Point[] {new Point(100, 100), new Point(200, 200), new Point(300, 300)});
		s[4] = new Rectangle();
		s[5] = new Rectangle(new Point(500, 600), new Point(700, 800), 400, 300);
		
		for(int i=0; i<s.length; i++) {
			s[i].draw();
		}
		
	}

}
