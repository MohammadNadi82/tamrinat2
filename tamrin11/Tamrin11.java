
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamrin11;

import java.util.*;

public class Tamrin11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string :");
        String str = input.next();
        int i = 0;
        int javab = 0;
        int mosavi = str.length() - 1;
        DoJahate(str, i, mosavi, javab);
    }

    public static void DoJahate(String str, int i, int mosavi, int javab) {
        if (i < str.length() / 2) {
            if (str.charAt(i) == str.charAt(mosavi)) {
                i++;
                mosavi--;
                javab++;
                DoJahate(str, i, mosavi, javab);
            } else {
                i++;
                mosavi--;
                DoJahate(str, i, mosavi, javab);
            }
        }
        if (i == javab) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

}
