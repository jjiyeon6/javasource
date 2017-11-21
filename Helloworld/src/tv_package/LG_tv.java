package tv_package;

public class LG_tv extends Tv {
	
	String panel = "OLED";
	
	//constructor
	public LG_tv(String maker, String tvSize, String tvType, String quality){
		super(maker, tvSize, tvType, quality);	// 매개값과 일치하는 부모 클래스의생성자 호출
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
