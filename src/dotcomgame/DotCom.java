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
        /*int startCell = (int)(Math.random()*7);
        int [] randomNum = new int [3];
        String [] ran = new String [3];
        locationCells = new ArrayList <String>();
        for(int i = 0; i<3; i++){
            randomNum[i]=startCell+i;
            ran [i] = String.valueOf(randomNum[i]);
            locationCells.add(ran[i]);
        }*/
        locationCells = loc;
    }
    
    public String checkGuess(String in){
        String result = "miss";
        int index = locationCells.indexOf(in);
        if (index == -1)
            return result;
        else {
            locationCells.remove(index);
        }
        if (locationCells.isEmpty()){
            result = "kill";
        }
        else 
            result = "hit";
        return result;
        
    }
    
}
