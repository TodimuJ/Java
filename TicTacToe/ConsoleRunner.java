package TicTacToe;

/**
 * ConsoleRunner:  Prompts the user to determine the parameters of the Game
 * constructor.  Creates a Game and manages the alternating calls to the
 * ‘place’ methods in Game.  Prompts the user for inputs and outputs the state
 * of the board to the console.
 *
 * @author Oluwatodimu Jenrola and Hrishit Mazumder
 */

import java.util.Scanner;

public class ConsoleRunner {

    /**
     * Should the human player be the X?  Note that X always
     * goes first.
     */
    private boolean playerIsX;
    private Game game;
    private String play, challenge;
    private int x, y;
    private DumbAI ai;
    char player;

    
    // Use to process text input from the user.
    private Scanner scanner = new Scanner(System.in);

    /*
     * TBD: Create additional private members if useful.
     */

    /**
     * Constructor
     */
    public ConsoleRunner() {    
        /*
         * TBD
         *
         * Use the 'next' method of Scanner and the 'matches' of the String
         * class to process user responses as strings.
         */
        
        System.out.println("Do you want to play as X (Y/N): ");
        play = scanner.next();
        System.out.println("Do you want a challenge (Y/N): ");
        challenge = scanner.next();
        if(play.matches("Y") )
        {  
        
            game = new Game(true, false);
        }
        else
        {
            game = new Game(false, false);
        }
        
    }

    /**
     * Enter the main control loop which returns only at the end of the game
     * when one party has won or there has been a draw.
     */
    public void mainLoop() {
        /*
         * TBD
         *
         * Use the 'nextInt' method of Scanner class to read user responses as
         * integers.
         *
         * There is enough work to do here that you may want to introduce
         * private methods (i.e. helper methods).
         */
    
        while(true)
        {
            System.out.println("Enter desired x-coordinate");
            x = scanner.nextInt();
            System.out.println("Enter desired y-coordinate");
            y = scanner.nextInt();
            game.placePlayerPiece(x, y);
            ai = new DumbAI(!playerIsX);
            game.aiPlacePiece();
        }
        

        //System.out.println("You won");

    }

  
}
