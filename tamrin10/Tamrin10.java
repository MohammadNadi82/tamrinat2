/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamrin10;

import java.util.*;

public class Tamrin10 {

    public static void main(String[] args) {
                Scanner inp = new Scanner(System.in);
        System.out.println("پايه را وارد کنيد ");
        int x = inp.nextInt();
        System.out.println(" توان را دارد کنيد");
        int n = inp.nextInt();
        int i = 1;
        int count = x;
        bazgashti(x, n, i, count);
    }
    public static int bazgashti(int x, int n, int i, int count) {
        if (i < n) {
            x = x * count;
            i++;
            bazgashti(x, n, i, count);
        } else {
            System.out.println(x);
        }
        return 1;
    }

}
