package p279_Exercise;

public class AccountExample {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("���� �ܰ�1: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("���� �ܰ�2: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("���� �ܰ�3: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("���� �ܰ�4: " + account.getBalance());
	}
}
