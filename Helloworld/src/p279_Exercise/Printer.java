package p279_Exercise;

public class Printer {
	
	//field
	int page;
	boolean power;
	double count;
	String name;
	
	//method
	void println(int page) {
		this.page = page;
	}
	
	void println(boolean power) {
		this.power = true;
	}
	
	void println(double count) {
		this.count = count;
	}
	
	void println(String name) {
		this.name = name;
	}
}
