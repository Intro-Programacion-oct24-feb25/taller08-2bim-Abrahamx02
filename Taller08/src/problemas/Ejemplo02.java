/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author Usuarioo
 */
public class Ejemplo02 {
    public static void main(String[] args) {
        
        double fahrenheit = 20.0; 
        double celsius;
        int incremento = 4;
        
        for (int i = 0; i <= 20; i++) {
           
            celsius =  5.0 / 9* (fahrenheit - 32) ; // cuando los dos enteros de la fraccion se convierte en 0.0 todo,
                                                                  //para ello a uno de los dos se lo vuelve double "5"-->"5.0"
 
            System.out.printf("Operación(%d) Fahrenheit: %.2f ===> Celsius: %.2f\n", i, fahrenheit, celsius);
            
       
            fahrenheit = fahrenheit +incremento;
        }   
    }
    
}
