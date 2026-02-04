/*
*
*
*
*/

import java.util.Scanner;

public class UsoCuenta {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Bienvenido a Nox Banking\n\n    Introduzca el nombre del titular:");
    
    CuentaCorriente Cuenta = new CuentaCorriente(sc.nextLine());
    
    System.out.println("\n\nCargando...\n\nBienvenido, " + Cuenta.getTitular() + "\n\n");
    
    while (true) {
        System.out.println("\n¿Qué desea hacer? \n" +
                            "1. Consultar saldo\n" +
                            "2. Ingresar dinero\n" +
                            "3. Retirar dinero\n" +
                            "4. Salir\n");
        
        String entrada = sc.nextLine();
        
        if (entrada.equals("1")) {
            System.out.println("\nSaldo actual: " + Cuenta.getSaldo() + "€");
            
        } else if (entrada.equals("2")) {
            System.out.println("\nIntroduzca la cantidad a ingresar: ");

            String cantidadIngresar = sc.nextLine();
            
            if (Cuenta.ingresar(cantidadIngresar)) {
                
                System.out.println("\n¡Éxito! Se han ingresado " +
                                    Double.parseDouble(cantidadIngresar) +
                                    "€. Su nuevo saldo es de " +
                                    Cuenta.getSaldo() + "€");
                                    
            } else System.out.println("\n-- ERROR: Operación no válida\n");
            
        } else if (entrada.equals("3")) {
            
            System.out.println("\nIntroduzca la cantidad a retirar: ");
            
            String cantidadRetirar = sc.nextLine();
            
            if (Cuenta.retirar(cantidadRetirar)) {
            
                System.out.println("\n¡Éxito! Se han retirado " +
                                    Double.parseDouble(cantidadRetirar) +
                                    "€. Su nuevo saldo es de " +
                                    Cuenta.getSaldo() + "€");
             
            } else System.out.println("\n-- ERROR: Operación no válida o saldo insuficiente\n");
            
        } else if (entrada.equals("4")) {
            
            System.out.println("\nGracias por usar Nox Banking. ¡Hasta pronto!");
            break;
            
        } else {
            System.out.println("\nOpcion no válida");
        }
    }
    
    }
}
