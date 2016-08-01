/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

/**
 *
 * @author winny
 */
public class Reversestring {

   // Write a java algorithm to reverse a string, and print it's output
// For instance, "CodeNinja" returns: 'ajniNedoC'


	 
    public static void main(String [] args){

        String troy ="HEY! UPTOWN FUNK!";
        StringBuffer winny= new StringBuffer(troy); 
        winny.reverse();
        System.out.println( winny);
}

    
}
