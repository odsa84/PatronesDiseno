/**
 * 
 */
package proxy;

import proxy.implementation.AccountBankA;
import proxy.implementation.AccountBankB;
import proxy.interfaces.iAccount;
import proxy.model.Account;

/**
 * @author Osvaldo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Account account = new Account(1, "Osvaldo Sandoval", 500);
		
		iAccount accountProxy = new AccountProxy(new AccountBankA());
		accountProxy.showBalance(account);
		account = accountProxy.depositMoney(account, 100);
		account = accountProxy.removeMoney(account, 50);
		accountProxy.showBalance(account);
	}

}
