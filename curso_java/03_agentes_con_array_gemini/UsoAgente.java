/*
 * Continuación intro POO - Ejercicio propuesto por Gemini
 *
 * Nueva versión de UsoAgente con creación de diferentes instancias (agentes) e implementación de
 * arrays.
 *
*/

public class UsoAgente {
    public static void main(String[] args) {
    
    System.out.println("¿Cuántos agentes quieres dar de alta?");
    int numAgentes = Integer.parseInt(Entrada.readLine());
    
    if (numAgentes<1) return;
    
    
    // RECORDAR ESTO: cuando llamas a una funcion, misAgentes[i] == Agente 
    // Ambos llaman a Agente pero en el caso de misAgentes[] indicas una instancia concreta
    
    Agente misAgentes [] = new Agente[numAgentes];
    
    for (int i=0; i<misAgentes.length; i++) {
        System.out.println("Agente n." + (i+1) + ": Indica qué nombre le quieres poner");
        
        misAgentes[i] = new Agente(Entrada.readLine());
        
        if(i==numAgentes - 1) System.out.println("\nAgentes creados con éxito\n");
    }
    
    while (true) {
    
    System.out.println("\n¿Qué deseas hacer a continuación?");
    
    System.out.println("\n1. Ver informe de toda la flota\n" +
                        "2. Actualizar versión de los agentes\n" +
                        "3. Salir\n");
    
    String entrada = Entrada.readLine();
    
    if (entrada.equals("1")) {
        
        for (int i=0; i<misAgentes.length; i++) {
            
            System.out.println(misAgentes[i].getInfoAgente()); 
            //o Agente.getInfoAgente(misAgentes[i])??? comprobar si no funciona
        }
    }
    
    if (entrada.equals("2")) {
    
        for (int i=0; i<misAgentes.length; i++) {
            
            misAgentes[i].setVersion();
        }
        System.out.println("\nVersión actualizada");
    }
    
    if (entrada.equals("3")) {
        System.out.println("\n¡Hasta la próxima!");
        return;
    }
    }  
    }
}
