/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamrin1;

import java.util.*;
import java.util.regex.Pattern;
public class Tamrin1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an Email : ");
        String Email = input.next();
        System.out.println(Pattern.matches("[a-zA-Z]*[a-zA-Z0-9][@](gmail|GMAIL|Gmail)\\.([a-z]{3}|[a-z]{2})", Email));
    }

}
