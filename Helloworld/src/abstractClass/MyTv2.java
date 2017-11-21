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
			this.isPowerOn = isPowerOn;	//��������
		} if((this.isPowerOn == true) && (isPowerOn == true)) {
			System.out.println("���� TV�� ���� �ֽ��ϴ�.");
		} if((this.isPowerOn == false) && (isPowerOn == true)) {
			this.isPowerOn = isPowerOn;	//��������
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
				System.out.println("��ȿ�� ä���� �Է��ϼ���");
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
				System.out.println("��ȿ�� ������ �Է��ϼ���");
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
//				System.out.println("��ȿ�� ä���� �Է��ϼ���");
//			}
//		}	
//	}

	@Override
	public void printLogo(String country) {
		System.out.println(super.logo+country);
	}
	
	//���� ä���� ���� ä�η� �����Ѵ�.
	@Override
	public void gotoPrevChannel() {
		int tempChannel;
		tempChannel = this.channel;
		this.channel=this.preChannel;
		this.preChannel = tempChannel;
	}
	
}
