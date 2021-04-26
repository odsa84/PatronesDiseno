/**
 * 
 */
package proxy;


import com.oracle.tools.packager.Log.Logger;

import proxy.implementation.AccountBankA;
import proxy.interfaces.iAccount;
import proxy.model.Account;

/**
 * @author Osvaldo
 *
 */
public class AccountProxy implements iAccount {
	
	private iAccount bankAccount;	

	public AccountProxy(iAccount bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}

	@Override
	public Account removeMoney(Account account, double monto) {
		
		if(bankAccount == null) {
			bankAccount = new AccountBankA();			
			return bankAccount.removeMoney(account, monto);
		} else {
			return bankAccount.removeMoney(account, monto);
		}		
	}

	@Override
	public Account depositMoney(Account account, double monto) {

		if(bankAccount == null) {
			bankAccount = new AccountBankA();			
			return bankAccount.depositMoney(account, monto);
		} else {
			return bankAccount.depositMoney(account, monto);
		}
	}

	@Override
	public void showBalance(Account account) {

		if(bankAccount == null) {
			bankAccount = new AccountBankA();			
			bankAccount.showBalance(account);
		} else {
			bankAccount.showBalance(account);
		}
	}

}
