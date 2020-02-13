package task2;
import java.util.*;

public class Bank {
	Vector<Account> accounts = new Vector<Account>();
	
	public Bank() {}
	
	public Bank(Vector<Account> accounts) {
		this.accounts = accounts;
	}

	public void update(int accNumber, String format, double sum) {
		for(Account account: accounts) {
			if(account.getAccountNumber() == accNumber) {
				if(format.equals("deposit")) 
					account.deposit(sum);
				else 
					account.withdraw(sum);		
				break;
			}
		}	
	}
	
	public void openAcc(Account newAccount) {
		accounts.add(newAccount);
	}
	
	public void closeAcc(int accNum) {
		for(int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getAccountNumber() == accNum) {
				accounts.remove(i);
				i --;
			}
		}
	}
	
	public String toString() {
		return accounts.size()+" ";
	}
}