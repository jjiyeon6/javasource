package p279_Exercise;

public class Account {

	private int balance;
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	int getBalance() {
		return this.balance;
	}
	
	void setBalance(int balance) {
		if(balance < 0 || balance > 1000000) {
			this.balance = this.balance;
		} else {
			this.balance = balance;
		}	
	}
}
