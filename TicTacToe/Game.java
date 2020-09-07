package TicTacToe;

/**
 * Represents the logic of the game in terms of detecting wins or draws.  Also
 * places new pieces for the human player or AI.
 *
 * @author Oluwatodimu Jenrola and Hrishit Mazumder
 */

import java.util.Random;
import java.lang.*;

public class Game {
    private Board board = new Board();
    private GameStatus status;
    private AI ai;
    private char player;
    protected boolean playerIsX_;

  
    

    // private boolean playerIsX_;
    // private boolean challenging_;

    /*
     * TBD: Create additional private members if useful.
     */

    /**
     * Construct a new Game according to the given parameters.
     */
    public Game(boolean playerIsX, boolean challenging) {
        /*
         * TBD
         */ 
        // playerIsX = playerIsX_;
        // challenging = challenging_;

        if(playerIsX == true)
       {
            playerIsX_ = true;         
            player = 'X';
       } 
       else
       {
         playerIsX_ = false;
         player = 'O';
       }

    }

    /**
     * Return a copy of the board's current contents.
     */
    public Board getBoard(Move m)
    {
        /*
         * TBD
         */
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) 
        {
            System.out.print("| ");
            for (int j = 0; j < 3; j++)
            { 
               
                if(i== m.getI() && j == m.getJ()) 
                {
                    System.out.print(player + " | ");
                }
                else System.out.print(board.get(i,j) + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }

        return this.board;
     
    }

    // public Board printBoard()
    // {
    //     //Board s = new Board();
    //    // Move t = new Move(printBoard);
    //     //s=printBoard(t);

        
    //     u = new Move(getI(), getJ(), player);
    //     t = getBoard(u);
 
    //     return t;
    // }



    /**
     * Get the game's status.
     */
    public GameStatus getStatus() {
        /*
         * TBD
         */
      
        // for (int a = 0; a < 8; a++) {
		// 	char line = ' ';
		// 	switch (a) {
		// 	case 0:
		// 		line = board[0][0] + board[0][1] + board[0][2];
		// 		break;
		// 	case 1:
		// 		line = board[1][0] + board[1][1] + board[1][2];
		// 		break;
		// 	case 2:
		// 		line = board[2][0] + board[2][1] + board[2][2];
		// 		break;
		// 	case 3:
		// 		line = board[0][0] + board[1][0] + board[2][0];
		// 		break;
		// 	case 4:
		// 		line = board[0][1] + board[1][1] + board[2][1];
		// 		break;
		// 	case 5:
		// 		line = board[0][2] + board[1][2] + board[2][2];
		// 		break;
		// 	case 6:
		// 		line = board[0][0] + board[1][1] + board[2][2];
		// 		break;
		// 	case 7:
		// 		line = board[2][0] + board[1][1] + board[0][2];
        //         break;
        //     }
        //     if (line == 'XXX') {
		// 		return 'X';
		// 	} else if (line == 'OOO') {
		// 		return 'O';
		// 	}
        // }
        


         status = GameStatus.IN_PROGRESS;
         return status;
    }
    
    /**
     * Place a piece for the player on the board.
     * @param i i-coordinate of desired position.
     * @param j j-coordinate of desired position
     * @return true only if the coordinates of the desired position are in
     * range and the corresponding cell is empty.
     *
     * @precondition status == IN_PROGRESS
     *
     */
    public boolean placePlayerPiece(int i, int j) {
        /*
         * TBD
         */
        boolean isTrue = false;

        if((i >= 0 && i <=2) && (j >= 0 && j <=2))
        {
            isTrue = true;
            Move s = new Move(i, j, player);
            System.out.println("After your move:");
            getBoard(s);
        }
         else
        {
             isTrue = false;
        }
    
        return isTrue;
    }

    /**
     * @precondition status == IN_PROGRESS
     */
    public void aiPlacePiece() {
        /*
         * TBD
         */
       
        //Move u = new Move(ai.chooseMove(board).getI(), ai.chooseMove(board).getI(), ai.chooseMove(board).getPiece() );
        if(getStatus() == GameStatus.IN_PROGRESS)
        {
            ai = new DumbAI(!playerIsX_);
            System.out.println("After AI move:");
            getBoard(ai.chooseMove(board));
        }
    }
}
