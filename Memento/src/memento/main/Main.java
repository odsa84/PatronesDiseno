/**
 * 
 */
package memento.main;

import memento.Caretaker;
import memento.Game;
import memento.Originator;

/**
 * @author Osvaldo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String gameName = "NBA 2K";
		
		Game game = new Game();
		game.setNombre(gameName);
		game.setCheckpoint(1);
		
		Caretaker careTaker = new Caretaker();
		Originator originator = new Originator();
		
		game = new Game();
		game.setNombre(gameName);
		game.setCheckpoint(2);
		originator.setGameState(game);
		
		game = new Game();
		game.setNombre(gameName);
		game.setCheckpoint(3);
		originator.setGameState(game);
		
		careTaker.addMemento(originator.save()); //Position 0
		
		game = new Game();
		game.setNombre(gameName);
		game.setCheckpoint(4);
		originator.setGameState(game);
		
		careTaker.addMemento(originator.save()); //Position 1
		
		game = new Game();
		game.setNombre(gameName);
		game.setCheckpoint(5);		
		originator.setGameState(game);
		
		careTaker.addMemento(originator.save()); //Position 2
		
		originator.setGameState(game);
		originator.restore(careTaker.getMemento(2));
		
		game = originator.getGameState();
		System.out.println(game);
	}

}
