/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício.looping.pkg1;

import java.util.Scanner;

/**
 *
 * @author Kayke
 */
public class ExercícioLooping1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        i = 0;
        
        Scanner enter= new Scanner (System.in);
        do
        {
            int result = (int) Math.pow(3, i);
            System.out.println(result);
            i++;
        }
    
        while(i <= 15);
    
    }
    
}
