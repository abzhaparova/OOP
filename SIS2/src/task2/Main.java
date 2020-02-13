package task2;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<Account> accountList = new Vector<Account>();
		accountList.add(new Account(123456789));
		accountList.add(new Account(234567891));
		accountList.add(new SavingsAccount(123456789, 0.2));
		accountList.add(new CheckingAccount(123456789));
		
		Bank b = new Bank(accountList);
		
		b.update(123, "deposit", 3000.1);

	}

}
