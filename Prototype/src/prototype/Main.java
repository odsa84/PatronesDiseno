/**
 * 
 */
package prototype;

import prototype.implementacion.Account;

/**
 * @author Osvaldo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Account account = new Account();
		account.setMonto(500);
		
		Account clonedAccount =  (Account) account.clonar();
		
		if(clonedAccount != null) {
			System.out.println(clonedAccount);
		}

	}

}
