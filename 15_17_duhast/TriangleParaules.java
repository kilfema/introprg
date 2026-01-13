/*
 *Kilian Fernández - 12/01/2026
 * Programa que que rep un text i crea un triangle de paraules.
 */
 
public class TriangleParaules {
    public static void main(String[] args) {
    
    System.out.println("Text?");    
    String text = Entrada.readLine();
    mostraTriangle(text);
    }
    
    public static void mostraTriangle(String text) {
         String sortida = "";
         
         for (int i = 0; i < text.length(); i++) {
            char caracter = text.charAt(i);
            
            if (i == text.length() -1) {
                sortida += caracter;
                System.out.println(sortida);
                return;
            
            } else if (Character.isWhitespace(caracter)) {
                System.out.println(sortida);
                sortida += caracter;
                
            } else {
                sortida += caracter;
            }
         } 
    }
}
