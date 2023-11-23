/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica004;

/**
 *
 * @author LAB.ELECT
 */
public class Problematica004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 15;
        int numerador = 1;
        int denominador = 3;
        String signo;
        String cadena = "";
        
        do {
            // para manejar el signo asociado 
            if (denominador % 3  == 0) {
                signo = "+";
            } else {
                signo = "-";
            }
            
            cadena = String.format("%s%s%d/%d ", 
                    cadena,
                    signo,
                    numerador, 
                    denominador);
            denominador = denominador + 3 ;

        } while (denominador <= limite);

        System.out.println(cadena);
    }
    
}
