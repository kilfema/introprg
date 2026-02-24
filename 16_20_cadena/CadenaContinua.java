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
    
    System.out.println("Nombre?");
    int nombre = Integer.parseInt(Entrada.readLine());
    
    if (text.isEmpty() || UtilString.esTextVuit(text)) {
        System.out.println("error");
        return;
    }
    
    if (nombre<1) return;
    
    UtilString.cadenaContinua(text, nombre);
    }
  }
