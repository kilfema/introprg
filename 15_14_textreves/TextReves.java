/*
 *Kilian Fernández - 28/10/2025
 * Programa que demana un text i el retorna invertint l'ordre de caràcters que el composen separant-lo per comes
 */
 
public class TextReves {
    public static void main(String[] args) {
        
    System.out.println("Text?");
    String text = Entrada.readLine();
    mostraReves(text);
    System.out.println();
    }
    
    public static void mostraReves(String text) {
        for (int i = 0; i < text.length(); i++) {
            char caracter = text.charAt(text.length()-1 - i);
            
            if (i > 0) {
                System.out.print(", ");
            }
            
            System.out.print(caracter);
        }
    }
}
