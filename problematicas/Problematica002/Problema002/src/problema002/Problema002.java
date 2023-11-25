/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema002;

/**
 *
 * @author A S U S
 */
public class Problema002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 4;
        int sumar = 2;
        
        do {
            System.out.printf("%d\n",
                    sumar);
            sumar = sumar + contador;
            contador = contador + 2;
            
        } while (sumar <= 110);   
    }
    
}
