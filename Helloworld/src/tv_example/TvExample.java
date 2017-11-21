package tv_example;

import tv_package.*;

public class TvExample {

	public static void main(String[] args) {
		
		Tv tv = new Tv("Samsung","60인치","stand type","UHD");
		
		tv.powerOn();
//		tv.powerOff();
		tv.choiceChannel(11);
//		tv.design_date = "20111111";
		
		tv.volumeUp(10);
		tv.volumeUp();
		
		LG_tv lg_tv = new LG_tv("Samsung","60인치","stand type","UHD");
		lg_tv.powerOn();
		lg_tv.volumeUp(10);
		
		Samsung_tv samsung_tv = new Samsung_tv("Samsung","60인치","stand type","UHD");
		samsung_tv.powerOn();
		samsung_tv.volumeUp(10);
		
	}

}
