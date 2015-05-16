/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dotcomgame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DotCom {
    private ArrayList <String> locationCells; // location cells of the dotcom
    private String DotComName;
    private int numOfHits;
    
    public DotCom(){
        
        numOfHits = 0;
    }
    public String getName (){
        return DotComName;
    }
    
    public void setName(String name){
        DotComName = name;
    }
    
    public int getNumOfHits(){
        return numOfHits;
    }
    
    public boolean getIsEmpty(){
        return locationCells.isEmpty();
    }
    public void setLocation(ArrayList<String> loc){
       locationCells = loc;
    }
    
    public String checkGuess(String in){
         String result = "miss";
         int index = locationCells.indexOf(in);
         if (index>=0){
             locationCells.remove (index);
             
             if (locationCells.isEmpty()){
                 result = "kill";
                 System.out.println("You have sunk "+ DotComName);
             }
             else result = "hit";
         }
         return result;
    }
    
}
