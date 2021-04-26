/**
 * 
 */
package memento;

/**
 * @author Osvaldo
 *
 */
public class Game {
	
	private String nombre;
	private int checkpoint;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCheckpoint() {
		return checkpoint;
	}
	public void setCheckpoint(int checkpoint) {
		this.checkpoint = checkpoint;
	}
	
	@Override
	public String toString() {
		return "Game [nombre=" + this.nombre + ", checkpoint=" + this.checkpoint + "]";
	}
}
