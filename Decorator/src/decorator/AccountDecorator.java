/**
 * 
 */
package decorator;

import decorator.interfaces.iAccount;
import decorator.model.Account;

/**
 * @author Osvaldo
 *
 */
public abstract class AccountDecorator implements iAccount {
	
	protected iAccount iaccount;
	
	public AccountDecorator(iAccount iaccount) {
		this.iaccount = iaccount;
	}
	
	@Override
	public void openAccount(Account acc) {
		this.iaccount.openAccount(acc);
	}

}
