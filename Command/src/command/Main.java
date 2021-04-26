/**
 * 
 */
package command;

import command.implementation.Deposing;
import command.implementation.Remove;
import command.logic.Account;

/**
 * @author Osvaldo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Account account = new Account(1,  500);
		
		Deposing opDeposing = new Deposing(account, 100);
		Remove opRemove = new Remove(account, 50);
		
		Invoker invoker = new Invoker();
		invoker.receiveOperation(opDeposing);
		invoker.receiveOperation(opRemove);
		
		invoker.performOperation();
	}

}
