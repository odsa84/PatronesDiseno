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
public class ShieldDecorator extends AccountDecorator {
	
	public ShieldDecorator(iAccount iaccount) {
		super(iaccount);
	}
	
	@Override
	public void openAccount(Account acc) {
		iaccount.openAccount(acc);
		addShield(acc);
	}
	
	public void addShield(Account acc) {
		System.out.println("Shielding was added to the client account: " + acc.getClient());
	}

}
