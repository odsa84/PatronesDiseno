/**
 * 
 */
package singleton.watch;

import java.util.Date;

/**
 * @author Osvaldo
 *
 */
public class Watch extends Thread {
	
	private static Watch instance;
	
	/**
     * Constructor privado para usar el patron Singleton
     */
	private Watch() {
		
	}
	
	 // /**
    // * Constructor publico para probar sin singleton
    // */

    // public Watch() {
    // this.start();
    // }

    /**
     * Inicializa una sola vez el reloj
     */
	private synchronized static void createInstance() {
		if(instance == null) {
			instance = new Watch();
			 instance.start();
		}
	}
	
	/**
     * Obtiene la unica instancia del gestor de geozonas
     * 
     * @return gestorGeozonas
     */
	public static Watch getInstance() {
		createInstance();
		
		return instance;
	}
	
	@Override
	public void run() {
		while (true) {

            Date hora = new Date(System.currentTimeMillis());
            System.out.println(hora);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
	}
}
