/**
 * 
 */
package command.logic;

/**
 * @author Osvaldo
 *
 */
public class Account {
	
	private int id;
	private double balance;
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public void remove(double amount) {
		this.balance = this.balance - amount;
		System.out.println("[REMOVE COMMAND] Account: " + this.id + " Balance: " + this.balance);
	}
	
	public void deposing(double amount) {
		this.balance = this.balance + amount;
		System.out.println("[DEPOSING COMMAND] Account: " + this.id + " Balance: " + this.balance);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}	
	
}
