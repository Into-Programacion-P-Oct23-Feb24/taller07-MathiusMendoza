/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema003;

/**
 *
 * @author A S U S
 */
public class Problema003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int suma = 2;
        int contador = 3;
        int limite = 13;
        
        do {
           System.out.printf("%d\n",suma);           
            suma = suma + contador;
           contador = contador + 2;
           
        } while (contador <= limite);
    }
    
}
