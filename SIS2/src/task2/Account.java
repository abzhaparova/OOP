package task2;

public class Account {  
	private double balance; 
	private int accNumber; 
	
	public Account(int accNumber){
		this.balance=0.0;    
		this.accNumber=accNumber;  
		}    
	
	public void deposit(double sum) { 
		this.balance += sum;
	}   
	
	public void withdraw(double sum) { 
		this.balance -= sum;
	}   
	
	public double getBalance(){
		return this.balance;
	}   
	
	public void setBalance(double balance){
		this.balance=balance;
	}  
	
	public double getAccountNumber(){
		return this.accNumber;
	}
	
	public void transfer(double amount, Account other){
		this.balance -= amount; 
		other.balance += amount;
	} 

	public String toString() {  
		return this.accNumber + " " + this.balance;
	}   
	
	public final void print(){
		System.out.println( toString() ); 
	}
} 