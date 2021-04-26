/**
 * 
 */
package prototype.implementacion;

import prototype.interfaces.iAccount;

/**
 * @author Osvaldo
 *
 */
public class Account implements iAccount {
	
	private String tipo;
	private double monto;
	
	public Account() {
		this.tipo = "AHORRO";
	}

	@Override
	public iAccount clonar() {
		Account acc = null;
		
		try {
			
			acc = (Account) clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		return acc;
	}
	
	@Override
	public String toString() {
		return "Account [Type: " + tipo + ", Mount: " + monto + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

}
