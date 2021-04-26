/**
 * 
 */
package memento;

/**
 * @author Osvaldo
 *
 */
public class Memento {
	
	private Game gameState;
	
	public Memento(Game gameState) {
		this.gameState = gameState;
	}
	
	public Game getGameState() {
		return gameState;
	}

}
