/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dotcomgame;


import java.util.*;


/**
 *
 * @author user
 */
public class DotComGame {
    private int numOfGuesses ;
    private ArrayList <DotCom> dotComsList = new ArrayList <DotCom>();
    private GameHelper helper = new GameHelper();
    
    public void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Weiner.com");
        DotCom two = new DotCom();
        two.setName("Hotdog.com");
        DotCom three = new DotCom();
        three.setName("Feet.com");
        
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        
        
        // place dotComs
        for (DotCom dotComToSet: dotComsList){
            
            ArrayList <String> newLocations = helper.placeDotCom(3);
            dotComToSet.setLocation(newLocations);
        }
        
    }
    
    public void startPlaying(){
        while(dotComsList.isEmpty()!=true){
            String guess = helper.getUserInput("Please enter your guess: ");
            if(guess.equals("end"))
                return;
            checkUserGuess(guess);
        }
        endGame();
    }
    
    public void checkUserGuess (String userGuess){
        numOfGuesses++;
        String result = null;
        
        result = "miss";
        for (DotCom dotComToCheck: dotComsList){
            result = dotComToCheck.checkGuess(userGuess);
            if (result.equals("hit")){
                break;
            }
            if (result.equals("kill")){
                dotComsList.remove(dotComToCheck);
                break;
            }
        }
        System.out.println(result);
    }
    
    public void quickEndGame(){
            endGame();
    }
    
    public void endGame(){
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuesses<= 18){
            System.out.println("It only took you " + numOfGuesses + "guesses.");
            System.out.println(" Your got out before your options sunk.");
        }
        else {
            System.out.println("Took you long enough. " + numOfGuesses + "guesses.");
            System.out.println("You have lost everything");
        }
    }
    
    public static void main(String[] args) {
        DotComGame game = new DotComGame();
        game.setUpGame();
        game.startPlaying();
        
    }
    
}
