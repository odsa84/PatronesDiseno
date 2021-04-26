/**
 * 
 */
package decorator.main;

import decorator.ShieldDecorator;
import decorator.implementation.AccountSaving;
import decorator.interfaces.iAccount;
import decorator.model.Account;

/**
 * @author Osvaldo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Account acc = new Account(1, "Osvaldo Sandoval");
		
		iAccount iaccount = new AccountSaving();
		iAccount shieldAccount = new ShieldDecorator(iaccount);
		
		//iaccount.openAccount(acc);
		shieldAccount.openAccount(acc);
	}

}
