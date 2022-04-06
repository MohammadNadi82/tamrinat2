/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamrin2;

import java.util.*;

public class Tamrin2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string one :");
        String str = input.next();
        System.out.println("enter a string one :");
        String str2 = input.next();
        int m = 0;
        if (str.equals(str2)) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= (48) && str.charAt(i) <= (57)) {
                    if (str.length() < 8) {
                        m = m + 1;
                    }
                }
            }
            for(int j =0; j < str.length(); j++){
               if (str.charAt(j) < (48) || str.charAt(j) > (57) && str.charAt(j)< (65) ||
                       str.charAt(j) > (90) && str.charAt(j) < (97) || str.charAt(j) > (122)) 
               {
                    m = m + 1;
               }
            }
        }
        if(m >= 2) {
        System.out.println("true");
        }
        else System.out.println("false");
    }

}
