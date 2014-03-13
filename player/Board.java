
public class Board {
	//an 8 by 8 board for the game.
	public int[][] misterBoard = new int[8][8];
	private int Empty = -1;
	private int Black = 0;
	private int White = 1;
	private int blackChips = 0;
	private int whiteChips = 0;
	
	//creates the empty board.
	public Board() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				misterBoard[i][j] = Empty;
			}
		}
	}
	

//returns the configuration of the current board
public int[][] current() {
	return misterBoard;
}

//gets the chip color at at location (x, y)
public int getChip(int x, int y) {
	return misterBoard[x][y];
}

//Increases or decreases the count of white or black chips and sets (x, y) to the color
public void countChip(int x, int y, int color) {
	if (misterBoard[x][y] == Empty && color != Empty) {
		if (color == Black) {
			blackChips++;
		} else {
			whiteChips++;
		}
	} else if (misterBoard[x][y] != Empty && color == Empty) {
		if (misterBoard[x][y] == Black) {
			blackChips--;
		} else if (misterBoard[x][y] == White) {
			whiteChips--;
		}
	}
	misterBoard[x][y] = color;
}

//returns total number of chips on current board
public int totalChips() {
	return blackChips + whiteChips;
}
	
}
