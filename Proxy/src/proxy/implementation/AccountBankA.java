/**
 * 
 */
package proxy.implementation;

import proxy.interfaces.iAccount;
import proxy.model.Account;

/**
 * @author Osvaldo
 *
 */
public class AccountBankA implements iAccount {

	@Override
	public Account removeMoney(Account account, double monto) {
		
		double currentBalance = account.getInitialBalance() - monto;
		account.setInitialBalance(currentBalance);
		System.out.println("Current balance: " + account.getInitialBalance());
		
		return account;
	}

	@Override
	public Account depositMoney(Account account, double monto) {
		
		double currentBalance = account.getInitialBalance() + monto;
		account.setInitialBalance(currentBalance);
		System.out.println("Current balance: " + account.getInitialBalance());
		
		return account;
	}

	@Override
	public void showBalance(Account account) {

		System.out.println("Current balance: " + account.getInitialBalance());
	}

}
