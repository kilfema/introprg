/*
 *Kilian Fernández - 20/01/2026
 * Programa que demana un text i el retorna repetint-lo normalitzat; sense caracters especials.
 */
 
public class ForaEspaisSobrers {
    public static void main(String[] args) {
        
    while (true) {
    
    System.out.println("El lloro espera un text");
    String text = Entrada.readLine();
    
    if (text.isEmpty()) {
        System.out.println("El lloro s'acomiada atentament");
        return;
    }    
    System.out.println("El lloro respon: " + UtilString.normalitzaBlancs(text));  
    }                
    }
} 
    
    
