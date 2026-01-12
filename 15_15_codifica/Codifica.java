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
    String abc = "abcdefghijklmnopqrstuvwxy";
    
    for (int i = 0; i < text.length(); i++) {
        char caracter = text.charAt(i);
        
        if (Character.isLetter(caracter)) {
            //cas caracter z 
            if (caracter == 'z') {
                caracter = 'a';
                
            } else {
            
                //recorregut abecedari minuscules
                for (int j = 0; j < abc.length(); j++) {
                    char charAbc = abc.charAt(j);
                    
                    if (charAbc == caracter) {
                        caracter ++;
                        break;  
                    }
                }                
            }
        }
        textCodificat += caracter;
    }
    
    System.out.println(textCodificat);
    }    
}
