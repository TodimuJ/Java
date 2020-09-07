package TicTacToe;

/**
 * An immutable class that represents the state of the 3×3 tic-tac-toe board.
 *
 * @author INSERT YOUR NAME(S) HERE
 */

public class Board {

    private char[][] board = new char[3][3];

    /*
     * TBD: Create additional private members if useful.
     */

    /**
     * Construct an empty board (contains all space char's).
     */
    public Board() {
        /*
         * TBD
         */
	    System.out.println("-------------");
        for (int i = 0; i < 3; i++) 
        {
            System.out.print("| ");
            for (int j = 0; j < 3; j++)
            {
               System.out.print(board[i][j] + " | ");
               board[i][j] = ' ';
            }

           System.out.println();
           System.out.println("-------------");
        }
            
    }

    /**
     * Given the 'other' board as a starting condition, apply the given
     * 'move' to generate this board's state.
     */
    public Board(Board other, Move move) {
        /*
         * TBD
         */
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) 
        {
            System.out.print("| ");
            for (int j = 0; j < 3; j++)
            { 
                other.board[i][j] = move.getPiece();
                if(i== move.getI() && j == move.getJ()) 
                {
                    System.out.print(other.board[i][j] + " | ");
                }
                else System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
        
    }

    /**
     * Convert to a string that shows the board's state.
     */
    public String toString() {
        /*
         * TBD
         */
        String boardState = " ";

        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++)
            {
               boardState += board[i][j];
            }
        }

        return boardState;
    }

    /**
     * Get the entry of the board at column i, row j.  Both indices should
     * be in the range [0, 2].
     */
    public char get(int i, int j) {
        /*
         * TBD
         */
        
        assert((i >= 0 && i <=2) && (j >= 0 && j <=2));
        return this.board[i][j];
    }
    
    /**
     * @return true if there remain no empty spots on the board.
     */
    public boolean isFull()
    {
        /*
         * TBD
         */
        boolean isFull = true;

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++) 
            {
                if (board[i][j] == ' ')
                {
                    isFull = false;
                }
            }
        }

        return isFull;
    }
}
