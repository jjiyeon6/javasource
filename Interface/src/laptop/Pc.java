package laptop;

//interface Laptop 은 implements 로 상속
//class Computer 은 extends 로 상속
public class Pc extends Computer implements Laptop {

	@Override
	public void getUsbType() {
		System.out.println("USB Type: "+Usb.usbType);
		
	}

	@Override
	public void getVersion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCapacity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getBluetoothType() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getBluetoothVersion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getConnDevice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getGCType() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getGCVersion() {
		// TODO Auto-generated method stub
		
	}
}
