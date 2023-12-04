/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minihomework0412;

import java.util.Scanner;

/**
 *
 * @author Matthew 
 */
public class Minihomework0412 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int age = yourAge();
        System.out.println("You are " + age + " years old");
    }
    public static int yourAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        return sc.nextInt();
        
    }
    
}
