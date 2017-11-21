package tv_package;

public class Tv {

	//field
	 boolean power = false;
	private boolean mute;
	 int volume;
	private int preVolume;
	private int channel;
	
	String maker;
	String tvSize;
	String tvType;
	String quality;	//화질
	
	//final로 선언
	//선언된 초기값에서 변경할 수 없고 외부에서 값을 받을 수 없다.
	final String design_date = "20171115";
	
	//constructor
	//class와 같은 이름
	Tv() {	//초기화
		mute = false;
		volume = 5;
		channel = 7;
	}
	
	public Tv(String maker, String tvSize, String tvType, String quality) {
		this();
		this.maker = maker;	//외부에서 매개변수 maker로 받음 
		this.tvSize = tvSize;
		this.tvType = tvType;
		this.quality = quality;
	}
	
	//method
	public void powerOn() {
		this.power = true;
		System.out.println("TV Power ON");
	}
	
	void powerOff() {
		this.power = false;
		System.out.println("TV Power OFF");
	}
	
	//Overload
	public int volumeUp(int upCount) {
		if(power == true) {
			volume = volume + volume;
		}
		System.out.println("volume(int upCount):"+volume);
		return volume;
	}
	
	public int volumeUp() {
		if(power == true) {
			this.volume++;
		}
		System.out.println("volume():"+volume);
		return volume;
	}
	
	int volumeDown( ) {
		if(power == true) {
			this.volume--;
		}
		return volume;
	}

	int channelUp() {
		if(power == true) {
			this.channel++;
		}
		return channel;
	}
	
	int channelDown() {
		if(power == true) {
			this.channel--;
		}	
		return channel;
	}
	
	public int choiceChannel(int futureCha) {
		int diff = 0;
//		if(futureCha - channel > 0) {
//			diff = futureCha - channel;	//11-7 = 4
//			for(int i=0; i<diff; i++) {
//				channelUp();
//			}
//		} else if (futureCha - channel < 0) {
//			diff = channel - futureCha;	//7-5 = 2
//			for (int i=0; i<diff; i++) {
//				channelDown();
//			}
//		} else {
//			System.out.println("현재 채널이 " +futureCha+ "번 입니다.");
//		}
//		System.out.println(futureCha+" "+channel);
		diff = futureCha - channel;
		switch (diff) {
		case -1 ://7-6 = 1
			for(int i=0; i<diff; i++) {
				channelDown();
			}
			System.out.println("현재채널1: "+channel+"번");
			break;
			
		case 4 ://11-7 = 4
			for(int i=0; i<diff; i++) {
				channelUp();
			}
			System.out.println("현재채널2: "+channel+"번");
			break;	
			
		default:
			System.out.println("현재채널3: "+channel+"번");
			break;
		}
		
		return channel;
	}
	
	boolean muteOn() {
		if(power == true) {
			if(mute == true) {
				System.out.println("음소거 상태입니다.");
			} else {
				preVolume = volume;
				this.volume = 0;
				mute = true;
				System.out.println("음소거 되었습니다.");
			}	
		}
		return mute;
		
	}
	
	boolean muteOff() {
		if(power == true) {
			if(mute == true) {
				this.volume = preVolume;
				mute = false;
				System.out.println("음소거가 해제 되었습니다.");
			} else {
				System.out.println("mute가 off 상태입니다");
			}
		}
		return mute;
	}
	
	
}
