package v2;

import java.awt.Dimension;

/**
 * Common superclass for all game model classes.
 * 
 * Constructors of subclasses should initiate matrix elements and additional,
 * game-dependent fields.
 */
public interface GameModel {

	/** A Matrix containing the state of the gameboard. */
	

	/** The size of the state matrix. */
	final Dimension gameboardSize = Constants.getGameSize();

	public GameTile getGameboardState(int i, int j);


	/**
	 * This method is called repeatedly so that the game can update it's state.
	 * 
	 * @param lastKey
	 *            The most recent keystroke.
	 */
	public void gameUpdate(int lastKey) throws GameOverException;

}
