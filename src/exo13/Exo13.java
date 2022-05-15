/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo13;

import java.util.Scanner;

/**
 *
 * @author samnd
 */
public class Exo13 {

    public static void main(String[] args) {
       Scanner scanne = new Scanner(System.in);
        System.out.println("Entrez un entier!");
        
        int n = scanne.nextInt();
        System.out.println("n= " +n);
        System.out.println("Table de multiplication de "+ n);
        for (int i = 0; i <=10; i++) {
            System.out.println(n+ " x " + i +  " = "+ (n*i));
            
        }
    
}
}
