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
    
    private ArrayList <DotCom> dotComsList = new ArrayList <DotCom>();
    
    public void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Weiner.com");
        DotCom two = new DotCom();
        two.setName("Hotdog.com");
        DotCom three = new DotCom();
        three.setName("Feet.com");
        
        dotComsList.add(0, one);
        dotComsList.add(1, two);
        dotComsList.add(2, three);
        
        
    }
    
    public void startPlaying(){
        
    }
    
    public void endGame(){
        
    }
    
    public static void main(String[] args) {
        
        DotCom dot = new DotCom();
        
        // Set name of the created Dot Com
        dot.setName("dot1");
        
        // Set lcoation of the DotCom
        
        
        int numOfGuess = 0;
        
        // prompt user for input
        while(dot.getIsEmpty() != true){
        System.out.println("enter a number");
        Scanner scan = new Scanner(System.in);
        String guess = scan.next();
        numOfGuess++;
        System.out.println(dot.checkGuess(guess));
        }
        if (dot.getIsEmpty() == true){
            System.out.println("You took " + numOfGuess + " guesses.");
        }
        
        
        
    }
    
}
