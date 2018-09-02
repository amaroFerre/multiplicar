/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacion;

// Importo el paquete java.util, para poder utilizar la clase Scanner

import java.util.*;

/**Realiza un programa que pida dos números 
 * y que luego muestre el resultado de su multiplicación
 *
 * @author Amarico
 */
public class Multiplicacion {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    // Creo el objeto entrada de la clase Scanner
    
    Scanner entrada = new Scanner(System.in);
    
    // Creo tres variables de tipo entero
    
    int numero1, numero2, resultado;
    
    // Pido los número por teclado
    
    System.out.println("Introduce un número: ");
    
    numero1 = entrada.nextInt();
    
    System.out.println("Introduce un segundo número para multiplicar: ");
    
    numero2 = entrada.nextInt();
    
    // Imprimo el resultado
    
    resultado = numero1 * numero2;
    
    System.out.println("El resultado de multiplicar "+ numero1 + " * " + numero2 + " es: " + resultado);
    
  }
  
}
