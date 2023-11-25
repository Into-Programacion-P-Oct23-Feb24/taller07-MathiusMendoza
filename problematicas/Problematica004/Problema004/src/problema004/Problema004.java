/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema004;

/**
 *
 * @author A S U S
 */
public class Problema004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numerador = 0;
        int denominador = 3;
        int contador = 0;
        String cadena_A = "1 ";

        while (contador <= 8) {

            if (contador % 2 == 0) {
                numerador = +1 / denominador;

                cadena_A = String.format("%s- 1/%d ",
                        cadena_A,
                        denominador);
            } else {
                numerador = -1 / denominador;

                cadena_A = String.format("%s+ 1/%d ",
                        cadena_A,
                        denominador);
            }

            denominador = denominador + 2;
            contador = contador + 1;
        }
        
        System.out.printf("%s\n", cadena_A);

    }

}
