package v7;
/*Anton Strandman && Maxim Goretskyy
 *Grupp 18 Labb 3
 *Version 1.7
 * 
 */
import java.awt.Dimension;

/**
 * Common interface for all game model classes.
 * 
 * 
 */
public interface GameModel extends IObservable{

	
	

	/** The size of the state matrix. */
	final Dimension gameboardSize = Constants.getGameSize();

	/**
	 * 
	 * @param i is the x-axis value
	 * @param j is the y-axis value
	 * @return GameTile at the given position
	 */
	public GameTile getGameboardState(int i, int j);

	
	/**
	 * This method is called repeatedly so that the game can update it's state.
	 * 
	 * @param lastKey
	 *            The most recent keystroke.
	 */
	public void gameUpdate(int lastKey) throws GameOverException;
	/**
	 * 
	 * @return speed interval
	 */
	public int getUpdateSpeed();
	
}
