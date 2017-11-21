package abstractClass;

public class MyTv2 extends Tv {

	private boolean isPowerOn = false;
	private int	channel;
	private int	preChannel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	MyTv2() {
		super("KOREA");
	}
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		if((this.isPowerOn == true) && (isPowerOn == false)) {
			this.isPowerOn = isPowerOn;	//전원차단
		} if((this.isPowerOn == true) && (isPowerOn == true)) {
			System.out.println("현재 TV가 켜져 있습니다.");
		} if((this.isPowerOn == false) && (isPowerOn == true)) {
			this.isPowerOn = isPowerOn;	//전원공급
		} if((this.isPowerOn == false) && (isPowerOn == false)) {
			System.out.println("..");
		}	
	}
	
	public int getChannel() {
		if(this.isPowerOn == true) {
			return channel;
		}
		return -1;
	}
	
	public void setChannel(int channel) {
		if(this.isPowerOn == true) {
			if(channel<0 || channel >100) {
//				return;
				System.out.println("유효한 채널을 입력하세요");
			} else {
				this.preChannel = this.channel;
				this.channel = channel;
			}	
		}	
	}
	
	public int getVolume() {
		if(this.isPowerOn == true) {
			return volume;
		}
		return -1;
	}
	
	public void setVolume(int volume) {
		if(this.isPowerOn == true) {
			if(volume<0 || volume >100) {
//				return;
				System.out.println("유효한 볼륨을 입력하세요");
			} else {
				this.volume = volume;
			}
		}	
	}
	
//	public void setVolume(int volume) {
//		if(this.isPowerOn == true) {
//			if(volume<=100 && volume >=1) {
//				this.volume = volume;
//			} else {
//				System.out.println("유효한 채널을 입력하세요");
//			}
//		}	
//	}

	@Override
	public void printLogo(String country) {
		System.out.println(super.logo+country);
	}
	
	//현재 채널을 이전 채널로 변경한다.
	@Override
	public void gotoPrevChannel() {
		int tempChannel;
		tempChannel = this.channel;
		this.channel=this.preChannel;
		this.preChannel = tempChannel;
	}
	
}
