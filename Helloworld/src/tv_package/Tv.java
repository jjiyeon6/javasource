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
	String quality;	//ȭ��
	
	//final�� ����
	//����� �ʱⰪ���� ������ �� ���� �ܺο��� ���� ���� �� ����.
	final String design_date = "20171115";
	
	//constructor
	//class�� ���� �̸�
	Tv() {	//�ʱ�ȭ
		mute = false;
		volume = 5;
		channel = 7;
	}
	
	public Tv(String maker, String tvSize, String tvType, String quality) {
		this();
		this.maker = maker;	//�ܺο��� �Ű����� maker�� ���� 
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
//			System.out.println("���� ä���� " +futureCha+ "�� �Դϴ�.");
//		}
//		System.out.println(futureCha+" "+channel);
		diff = futureCha - channel;
		switch (diff) {
		case -1 ://7-6 = 1
			for(int i=0; i<diff; i++) {
				channelDown();
			}
			System.out.println("����ä��1: "+channel+"��");
			break;
			
		case 4 ://11-7 = 4
			for(int i=0; i<diff; i++) {
				channelUp();
			}
			System.out.println("����ä��2: "+channel+"��");
			break;	
			
		default:
			System.out.println("����ä��3: "+channel+"��");
			break;
		}
		
		return channel;
	}
	
	boolean muteOn() {
		if(power == true) {
			if(mute == true) {
				System.out.println("���Ұ� �����Դϴ�.");
			} else {
				preVolume = volume;
				this.volume = 0;
				mute = true;
				System.out.println("���Ұ� �Ǿ����ϴ�.");
			}	
		}
		return mute;
		
	}
	
	boolean muteOff() {
		if(power == true) {
			if(mute == true) {
				this.volume = preVolume;
				mute = false;
				System.out.println("���ҰŰ� ���� �Ǿ����ϴ�.");
			} else {
				System.out.println("mute�� off �����Դϴ�");
			}
		}
		return mute;
	}
	
	
}
