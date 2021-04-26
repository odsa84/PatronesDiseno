/**
 * 
 */
package command;

import java.util.ArrayList;
import java.util.List;

import command.interfaces.iOperationCommand;

/**
 * @author Osvaldo
 *
 */
public class Invoker {
	
	private List<iOperationCommand> operations = new ArrayList<>();
	
	//Recibir Operación
	public void receiveOperation(iOperationCommand operation) {
		this.operations.add(operation);
	}
	
	//Realizar Operacion
	public void performOperation() {
		this.operations.forEach(x -> x.execute());
		this.operations.clear();
	}

}
