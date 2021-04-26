/**
 * 
 */
package memento;

/**
 * @author Osvaldo
 *
 */
public class Originator {
	
	private Game gameState;

	public Game getGameState() {
		return gameState;
	}

	public void setGameState(Game gameState) {
		this.gameState = gameState;
	}
	
	public Memento save() {
		return new Memento(gameState);
	}
	
	public void restore(Memento m) {
		this.gameState = m.getGameState();
	}

}
