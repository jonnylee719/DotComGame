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
 * @author Jonathan
 */
public class GameHelper {
    private int gridLength = 7;
    private int gridSize = 49;
    private int [] grid = new int [gridSize];
    private ArrayList <String> alphaCells = new ArrayList <String>();
    private int comSize =0;
    
    public String getUserInput(String prompt){
        Scanner scan = new Scanner(System.in);
        System.out.println("prompt" + scan);
        String userInput = scan.next();
        return userInput;
    }
    public ArrayList <String> placeDotCom(int comSize){
        boolean success = false;
        int loca;
        int attempt = 0;
        int incr = 0;
        int [] coord = new int [comSize];
        String alphabet = "ABCDEFG";
        
        comSize++;
        if (comSize % 2 == 1){
            incr = 7;
        }
        else incr = 1;
        
        while (success != true & attempt++ < 200){
            loca = (int)(Math.random()*gridSize);
            int x = 0;
            while (success & x<comSize){
                if (grid[loca] == 0){
                    coord [x++] = loca;
                    loca = loca + incr;
                    if (loca > gridSize)
                        success = false;
                    if (x> 0 && loca%gridLength == 0)
                        success = false;
                }
                else success = false;
            }
        }
        
        // convert coord to String
        int x = 0;
        
        while ( x< comSize){
            grid [coord[x]] = 1;
            int row = coord[x]/7;
            int column = coord[x]%7;
            String temp = String.valueOf(alphabet.charAt(column));
            alphaCells.add (temp.concat(Integer.toString(row)));
            x++;
        }
        return alphaCells;
    }
}
