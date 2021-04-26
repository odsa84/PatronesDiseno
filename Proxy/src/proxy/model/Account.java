/**
 * 
 */
package proxy.model;

/**
 * @author Osvaldo
 *
 */
public class Account {
	
	private int id;
	private String user;
	private double initialBalance;
	
	public Account(int id, String user, double initialBalance) {
		super();
		this.id = id;
		this.user = user;
		this.initialBalance = initialBalance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public double getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}
	
}
