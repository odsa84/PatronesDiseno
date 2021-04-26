/**
 * 
 */
package proxy.interfaces;

import proxy.model.Account;

/**
 * @author Osvaldo
 *
 */
public interface iAccount {
	
	Account removeMoney(Account account, double monto);
	Account depositMoney(Account account, double monto);
	void showBalance(Account account);
}
