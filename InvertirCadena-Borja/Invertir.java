/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Este comentario esta añadido para github */ 
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author borjo
 */
public class Invertir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una cadena y se intercambiarán mayúsuclas y minúsculas");
        System.out.println("Cadena: ");
        String s = sc.nextLine();
        
        String sNueva = "";
        
        int conv = (int)'A' - (int)'a';
        
        for(int i = 0; i < s.length(); i++){
            char aux = s.charAt(i);
            if(Character.isUpperCase(aux)){
                aux = Character.toLowerCase(aux);
            } else {
                aux = Character.toUpperCase(aux);  
            }
            sNueva+=aux;
        }
        System.out.println("La nueva cadena es: " + sNueva);
    }
}
