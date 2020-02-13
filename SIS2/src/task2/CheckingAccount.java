package task2;

public class CheckingAccount extends Account {
	public int FREE_TRANSACTION = 3;
	public int transactions_cnt = 0;
	public double fee = 0.02; 
	
	public CheckingAccount(int accNumber) {
		super(accNumber);
	}	
	
	public void deductFee() {
		if(transactions_cnt >  FREE_TRANSACTION) {
			super.withdraw(fee);
		}
	}

	public void transfer(double amount, Account other){
		super.transfer(amount, other);
		deductFee();
	} 
	
	public String toString() {
		return super.getAccountNumber()+" " + super.getBalance()+this.transactions_cnt+this.fee;
}
}
