/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamrin.pkg9;

import java.util.*;
public class Tamrin9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = input.nextInt();
        int i = 1;
        System.out.println(bazgasht(n, i));
    }
    public static int bazgasht (int n, int i){
        if(i < n){
            System.out.println(i);
            i++;
            bazgasht(n, i);
            
        }
    return n;
    }
}
