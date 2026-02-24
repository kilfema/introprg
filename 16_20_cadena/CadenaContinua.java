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
    
    if (text.isEmpty() || esTextVuit(text)) {
        System.out.println("error");
        return;
    }
    
    if (nombre<1) return;
    
    cadenaContinua(text, nombre);
    }
    
    public static boolean esTextVuit(String text) {
        
        for (int i=0; i<text.length(); i++) {
            
            if (!Character.isWhitespace(text.charAt(i))) return false;          
        }
    return true;
    }
    
    public static void cadenaContinua(String text, int nombre) {
    
    int pos = 0;
    
    for (int i=1; i<=nombre; i++) {
        
        System.out.print(text.charAt(pos));
        
        pos++;
        
        if (pos == text.length()) pos=0;
    }
    
    }
  }
