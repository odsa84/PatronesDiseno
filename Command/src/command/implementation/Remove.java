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
public class Remove implements iOperationCommand {
	
	private Account account;
	private double amount;
	
	public Remove(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void execute() {

		this.account.remove(this.amount);
	}
}
