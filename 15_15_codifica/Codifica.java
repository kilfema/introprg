/*
 *Kilian Fernández - 28/10/2025
 * Programa que demana un text i el codifica canviant cada lletra, per la següent de l'abecedari.
 */
 
public class Codifica {
    public static void main(String[] args) {
        
    System.out.println("Text?");
    String text = Entrada.readLine();
    
    mostraCodificat(text);
    }
    
    public static void mostraCodificat(String text) {
    
    String textCodificat = "";
    
    for (int i = 0; i < text.length(); i++) {
        char caracter = text.charAt(i);
        
        if (Character.isLetter(caracter)) {
            //casos caracter = Z || z
            if (caracter == 'Z') {
                caracter = 'A';
                
            } else if (caracter == 'z') {
                caracter = 'a';
                
            } else {
                caracter ++;
            }
        }
        textCodificat += caracter;
    }
    
    System.out.println(textCodificat);
    }    
}
