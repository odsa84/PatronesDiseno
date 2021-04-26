/**
 * 
 */
package decorator.implementation;

import decorator.interfaces.iAccount;
import decorator.model.Account;

/**
 * @author Osvaldo
 *
 */
public class AccountSaving implements iAccount {
	
	@Override
	public void openAccount(Account acc) {
		System.out.println("-------------------");
		System.out.println("Saving account opened");
		System.out.println("Client: " + acc.getClient());
	}

}
