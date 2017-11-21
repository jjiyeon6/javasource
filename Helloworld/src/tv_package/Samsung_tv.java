package tv_package;

public class Samsung_tv extends Tv {
	
	String panel = "LCD";
	
	public Samsung_tv(String maker, String tvSize, String tvType, String quality) {
		super(maker, tvSize, tvType, quality);	// 매개값과 일치하는 부모 생성자 호출
		maker = "Samsung";
	}

}
