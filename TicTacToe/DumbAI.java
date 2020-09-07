package TicTacToe;

/*
 * Realization of AI interface using simplistic random placement strategy.
 *
 * @author INSERT YOUR NAME(S) HERE
 */

import java.util.Random;

public class DumbAI implements AI {
    
    private Random random = new Random();
    protected char ai_piece;
    

    /*
     * TBD: Create additional private members if useful.
     */
    
    /**
     * Construct a Dumb 
     * 
     * @param aiIsX Indicates whether the AI player's piece is
     *              the 'X'.
     */
    public DumbAI(boolean aiIsX) {
        /*
         * TBD
         */
        if(aiIsX == true)
        {
            ai_piece = 'X';
    
        }
        else
        {
            ai_piece = 'O';
        }        
    }

    public Move chooseMove(Board board) {
        /*
         * TBD
         */
         int a = random.nextInt(3);
         int b = random.nextInt(3);

        while(board.get(a, b) != ' ')
        {
            a = random.nextInt(3);
            b = random.nextInt(3);
        }
        
        Move s = new Move(a, b, ai_piece);
        return s;
    }
}
