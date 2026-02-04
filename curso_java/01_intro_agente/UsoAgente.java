/*
*
* Este es el programa de uso de la clase Agente. Simula un asistente de IA.
*
* Proyecto de práctica de introducción a POO.
*
*/

import java.util.Scanner;
    
 public class UsoAgente {
    public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    
    Agente miAgente = new Agente();
    
    System.out.println("\n\nBienvenido de nuevo, soy " 
                        + miAgente.getNombre() + 
                        ", tu asistente personal.");
                                 
    
    while (true) {
        
        System.out.println("\n\n ¿Qué quieres hacer hoy? \n" +
                            "\n\n 1. Ver datos del asistente" +
                            "\n 2. Cambiar nombre del asistente" +
                            "\n 3. Enviar correo\n" +
                            "\n Introduce cualquier otra tecla para salir\n"
                            );
        
        String entrada = sc.nextLine();
        
        if (entrada.equals("1")) System.out.println(miAgente.mostrarDatosGenerales());
        
        else if (entrada.equals("2")) protocoloCambioNombre(miAgente);
        
        else if (entrada.equals("3")) protocoloCorreo(miAgente);
        
        else {
            System.out.println("Hasta la próxima!");
            break;
        }
    }
                        
    }
    
    public static void protocoloCambioNombre(Agente ag) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nIntroduce el nuevo nombre de tu asistente\n");
        
        ag.setNombre(sc.nextLine());        
        
    }
                
    public static void protocoloCorreo(Agente ag) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("\nIntroduce una dirección de correo\n");
    String correo = sc.nextLine();
    
    System.out.println("\nIntroduce un asunto\n");
    String asunto = sc.nextLine();
    
    // comprobar si el asunto está vació
    while (true) {
    
        if (!asunto.isEmpty()) break;
        
        System.out.print ("¿Estás seguro de que no quieres añadir un asunto? [s/n]\n");
        
        if (sc.nextLine().equals("s")) break;
        
        asunto = sc.nextLine();
        }
    
    System.out.println("\nIntroduce el cuerpo del correo\n");
    String cuerpo = sc.nextLine();
    
    //Enviar correo
    System.out.println(ag.enviarMail(correo, asunto));
     
    System.out.println("\n\n ¿Quieres revisar el mensaje? [s/n]\n");
    
    if (sc.nextLine().equals("s")) System.out.println("\n Mostrando mensaje... \n\n" + cuerpo);
    
    }
 }
 
