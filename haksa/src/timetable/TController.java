package timetable;

import java.util.ArrayList;

public class TController {
	private Service serviceT;
	
	public TController() {
		serviceT = new ServiceImpl();
	}

	public void getAll() {
		System.out.println("�ð�ǥ���");
		System.out.println( "      |  ��   |  ȭ   |  ��   |  ��   |   ��    ");
		printAll(serviceT.getAll());
	}
	
	public void printAll(ArrayList<Timetable> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
