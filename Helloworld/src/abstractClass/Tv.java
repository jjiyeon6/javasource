package abstractClass;

public abstract class Tv {
	
	final String logo = "Made in ";
	
	Tv(String country) {
		this.printLogo(country);
	}

	//logo출력하시오
	public abstract void printLogo(String country);
	
	//현재 채널을 이전 채널로 변경한다.
	abstract void gotoPrevChannel();

}
