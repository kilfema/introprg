/*
 * Nom: Kilian Fernández
 * Data: 24/02/2026
 * Descripció: Programa que demana un text i una longitud, i mostra una cadena contínua repetint el 
 * text tantes vegades com calgui fins assolir la longitud indicada.
 */
 
 public class CadenaContinua {
    public static void main(String[] args) {
    
    System.out.println("Text?");
    String text = Entrada.readLine();
    
    if (text.isEmpty() || UtilString.esTextVuit(text)) {
        System.out.println("error");
        return;
    }  
      
    System.out.println("Nombre?");
    String nombre = Entrada.readLine();
    
    
    if (nombre.length()<1 || !UtilString.esEnter(nombre)) {
        System.out.println("error");
        return;
    }  
       
    System.out.println(UtilString.cadenaContinua(text, Integer.parseInt(nombre)));
    }
  }
