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
        Random random = new Random();
        int opcion = 0;
        
        do{
            System.out.println("\n ----- Menu Principal ----");
            System.out.println(" 1. - Piramide ");
            System.out.println(" 2. - Clave ");
            System.out.println(" 3. - Juego de Piedra, Papel o Tijera ");
            System.out.println(" 4. - Adivinar ");
            System.out.println(" 5. - Salir ");
            System.out.print("Ingrese su opcion deseada: ");
            opcion = sc.nextInt();
                   
            switch (opcion){
                case 1 -> {
                    //Piramide
                    System.out.println("\n|--------------------------|");
                    System.out.println("     >>> Piramide <<< ");
                    System.out.println("|--------------------------|");
                    System.out.print(">> Cantidad de filas de la piramide: ");
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
                    //Clave
                    System.out.println("|--------------------------|");
                    System.out.println("      >>> Clave <<< ");
                    System.out.println("|--------------------------|");
                    System.out.print(">> Ingrese un mensaje para cifrar/descifrar: ");
                    String mensaje = sc.next();
                    String resultado = "";

                    for (int i = 0; i < mensaje.length(); i++) {
                        char c = mensaje.charAt(i);
                        if (c >= 'a' && c <= 'z') {
                            resultado += (char) ('z' - (c - 'a'));
                        } else if (c >= 'A' && c <= 'Z') {
                            resultado += (char) ('Z' - (c - 'A'));
                        } else {
                            resultado += c;
                        }
                    }

                    System.out.println("> Resultado: " + resultado);
                }
                case 3 -> {
                    int jugarDenuevo = 1;
                    //Mini Juego

                    while (jugarDenuevo == 1) {
                        System.out.println("\n|--------------------------------------|");
                        System.out.println("     >>> Piedra, Papel o Tijera <<<");
                        System.out.println("|--------------------------------------|");
                        System.out.println(" Bienvenido/a Usuario/a, esta vez jugaremos piedra, papel o tijera");
                        System.out.print("-> Ingrese su eleccion (piedra, papel o tijera): ");
                        String eleccionU = sc.next().toLowerCase();

                        if (!eleccionU.equals("piedra") && !eleccionU.equals("papel") && !eleccionU.equals("tijera")) {
                            System.out.println("! - Ingrese una opcion valida - !");
                            continue;
                        }

                        int eleccionC = random.nextInt(3);
                        String respuesta = "";

                        switch (eleccionC) {
                            case 0 -> respuesta = "piedra";
                            case 1 -> respuesta = "papel";
                            case 2 -> respuesta = "tijera";
                            default -> {
                            }
                        }

                        System.out.println("Yo escogo: " + respuesta + "!");

                        if (eleccionU.equals(respuesta)) {
                            System.out.println(">> Empate!");
                        } else if ((eleccionU.equals("piedra") && respuesta.equals("tijera"))
                                || (eleccionU.equals("papel") && respuesta.equals("piedra"))
                                || (eleccionU.equals("tijera") && respuesta.equals("papel"))) {
                            System.out.println(">> Ganaste!");
                        } else {
                            System.out.println(">> Perdiste...");
                        }

                        System.out.print("Jugamos de nuevo? (Si/No): ");
                        String respuestaJugar = sc.next().toLowerCase();
                        if (!respuestaJugar.equals("si")) {
                            jugarDenuevo = 0;
                            System.out.println(">> Que mal, espero verte pronto!");
                        }


                }}
                case 4 -> {
                  //Adivinar
                   System.out.println("|--------------------------------------|");
                    System.out.println("           >>> Adivinar <<<");
                    System.out.println("|--------------------------------------|");
                    int numeroSecreto = random.nextInt(100) + 1;
                    int limintentos = 10;
                    int intento;

                    System.out.println("He pensado un numero del 1 al 100. Tienes 10 intentos para adivinarlo.");

                    for (int i = 1; i <= limintentos; i++) {
                        System.out.print("Intento " + i + ": ");
                        intento = sc.nextInt();

                        if (intento == numeroSecreto) {
                            System.out.println("Asi es! Adivinaste en " + i + " intento(s).");
                            break;
                        } else if (intento < numeroSecreto) {
                            System.out.println("El numero es mayor.");
                        } else {
                            System.out.println("El numero es menor.");
                        }
                       
                    }

                    System.out.println("Se te acabaron los intentos. El numero era: " + numeroSecreto);
                    break;
                    
                }
                case 5 -> {
                    System.out.println(">> Hasta luego!! Cerrando programa...");
                }
                default -> {
                    System.out.println("\n! - Ingresar una opcion valida - !");
                }
            }
        } while(opcion !=5);
           
        
        }}
  
    

    
    
   
    
    
    