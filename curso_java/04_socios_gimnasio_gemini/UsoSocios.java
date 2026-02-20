/*
*
* Intro a POO - Práctica de static y final (Ejercicio propuesto por Gemini)
*
* Simulación de un club de socios que gesiona las membersías. Anexado a Socio.java
*
*/

public class UsoSocios {
    
    public static void main(String[] args) {
    
    System.out.println("\nIntroduce la cantidad de socios:\n");
    
    Socio misSocios[] = new Socio[Integer.parseInt(Entrada.readLine())];
    
    System.out.println("\nIntroduzca el nombre del socio:\n");
    
    for (int i=0; i<misSocios.length; i++) {
        
        System.out.print("\nSocio " + (i+1) + ": ");
        
        misSocios[i] = new Socio(Entrada.readLine());
    }
    
    System.out.println("\nInformación general de los socios: \n");
    
    for (int i=0; i<misSocios.length; i++) {
        
        System.out.println(misSocios[i].getDatos() + "\n");
    }
    
    System.out.println("El total de socios es: " + Socio.getTotalSocios() + ".");
       
    }
}
