package v4;

import java.awt.Dimension;

public class GameUtils{
	
	
	/**
	 * Set the tile on a specified position in the gameboard.
	 * 
	 * @param pos
	 *            The position in the gameboard matrix.
	 * @param tile
	 *            The type of tile to paint in specified position
	 */
	
	
	public static void setGameboardState(GameTile[][] board, final Position pos, final GameTile tile) {
		setGameboardState(board, pos.getX(), pos.getY(), tile);
	}

	/**
	 * Set the tile on a specified position in the gameboard.
	 * 
	 * @param x
	 *            Coordinate in the gameboard matrix.
	 * @param y
	 *            Coordinate in the gameboard matrix.
	 * @param tile
	 *            The type of tile to paint in specified position
	 */
	public static void setGameboardState(GameTile[][] board,final int x, final int y,
			final GameTile tile) {
		board[x][y] = tile;
	}

	

	/**
	 * Returns the size of the gameboard.
	 */
	public static Dimension getGameboardSize() {
		return GameModel.gameboardSize;
	}

	
	
}
