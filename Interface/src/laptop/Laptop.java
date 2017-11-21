package laptop;

//인터페이스는 상수와 메소드만을 구성 멤버로 가진다. 생성자X
//다른 패키지에서도 인터페이스를 사용할 수 있도록 public사용
public interface Laptop extends Usb, Bluetooth, GraphicCard {
	public static final String company = "Samsung";
}

interface Usb {
	//상수
	public static final String usbType = "usb";
	public static final String version = "3.0";
	public static final String capacity = "16GB";
	
	//abstract method
	public abstract void getUsbType();
	public abstract void getVersion();
	public abstract void getCapacity();
}

interface Bluetooth {
	//상수
	public static final String bluetoothType = "usb";
	public static final String bluetoothVersion = "4.0";
	public static final String connDevice = "Laptop";
	
	//abstract method
	public abstract void getBluetoothType();
	public abstract void getBluetoothVersion();
	public abstract void getConnDevice();
}

interface GraphicCard {
	//상수
	public static final String GCType = "PCI";
	public static final String GCVersion = "16.0";
	
	//abstract method
	public abstract void getGCType();
	public abstract void getGCVersion();
}