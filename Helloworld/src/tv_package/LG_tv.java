package tv_package;

public class LG_tv extends Tv {
	
	String panel = "OLED";
	
	//constructor
	public LG_tv(String maker, String tvSize, String tvType, String quality){
		super(maker, tvSize, tvType, quality);	// �Ű����� ��ġ�ϴ� �θ� Ŭ�����ǻ����� ȣ��
		maker = "LG";
		System.out.println("lgtv");;
	}
	
	//method
	
	//override
//	@Override
	public int volumeUp(int upCount) {
		if(this.power == true) {
			volumeUp();
		}
		System.out.println("volumeUp(int upCount) @Override");
		return volume;
	}

}
