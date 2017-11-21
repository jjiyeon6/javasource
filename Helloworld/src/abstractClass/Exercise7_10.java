package abstractClass;

public class Exercise7_10 {

	public static void main(String[] args) {
		
		MyTv2 t = new MyTv2();
		
		t.setPowerOn(true);
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(11);
		System.out.println("CH:" + t.getChannel());
		
//		t.setVolume(20);
//		System.out.println("VOl:" + t.getVolume());
//		
		t.gotoPrevChannel();
		System.out.println("preCH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("preCH:" + t.getChannel());
	
	}

}
