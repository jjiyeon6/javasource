package timetable;

import java.util.ArrayList;

public class TController {
	private Service serviceT;
	
	public TController() {
		serviceT = new ServiceImpl();
	}

	public void getAll() {
		System.out.println("시간표출력");
		System.out.println( "      |  월   |  화   |  수   |  목   |   금    ");
		printAll(serviceT.getAll());
	}
	
	public void printAll(ArrayList<Timetable> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
