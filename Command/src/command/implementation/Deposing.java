/**
 * 
 */
package command.implementation;

import command.interfaces.iOperationCommand;
import command.logic.Account;

/**
 * @author Osvaldo
 *
 */
public class Deposing implements iOperationCommand {
	
	private Account account;
	private double amount;
	
	public Deposing(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void execute() {

		this.account.deposing(this.amount);
	}

}
