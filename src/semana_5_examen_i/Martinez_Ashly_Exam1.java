/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana_5_examen_i;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kurtg
 */
public class Martinez_Ashly_Exam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        do{
            System.out.println("\n ----- Menu Principal ----");
            System.out.println(" 1.- Piramide ");
            System.out.println(" 2. - Clave ");
            System.out.println(" 3. - Juego de Piedra, Papel o Tijera ");
            System.out.println(" 4. - Adivinar ");
            System.out.println(" 5. - Salir ");
            System.out.print("Ingrese su opcion deseada: ");
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1 -> {
                    //Piramide
                    System.out.print("Cantidad de filas de la piramide: ");
                    int filas = sc.nextInt();
                    for (int i = 1; i <= filas; i++) {
                        int inicio = i * i - i + 1;
                        int suma = 0;
                        for (int j = 0; j < i; j++) {
                            int actual = inicio + j * 2;
                            System.out.print(actual + " ");
                            suma += actual;
                        }
                        System.out.println("= " + suma);
                        
                               
                    }
                }
                case 2 -> {
                    
                }
            }
        }while(opcion !=5);
           
        
        
    }
    
}
    
    
    
    
    
    
    
    
    
    
    