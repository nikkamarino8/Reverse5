/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverse5;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author nikka
 */
public class Reverse5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = new String[] {"John", "Paul","Mark","Matthew","Peter"};  
        Collections.reverse(Arrays.asList(names));
    System.out.println(Arrays.toString(names));
    }
    
}
