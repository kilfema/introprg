/*
 *Kilian Fernández - 28/10/2025
 * Programa que demana un text i el retorna amb: vocals en minúscula, no vocals en majúscula, nombres
 * entre parèntesi i treient la resta de caràcters que no són espais
 */
 
public class TransformaText {
    public static void main(String[] args) {
        
    System.out.println("Text?");    
    System.out.println(
                transformaText(
                    Entrada.readLine()
                )
    );   
    }
    
    public static String transformaText(String text) {
    
    String resultat = "";
    text = text.toLowerCase();
    
    for (int i = 0; i < text.length(); i++) {
    
        char caracter = text.charAt(i);         
        boolean esDigit = Character.isDigit(caracter);
        boolean iniciaNombres;
        

        if (Character.isWhitespace(caracter)) {
            resultat += caracter;
            continue;
        }
        
        if (UtilString.esVocal(caracter)) {
            resultat+= caracter;
            continue;
        }
        
        if (UtilString.esConsonant(caracter)) {
            resultat += Character.toUpperCase(caracter);
            continue;
        }
        
        if (Character.isDigit(caracter)) {
            
            if (i == 0) {
               resultat += "(" + caracter; 
               
            } else if (!Character.isDigit(text.charAt(i-1))) {
                resultat += "(" + caracter; 
            }
            
            if (i == text.length() - 1) {
                resultat += caracter + ")";
                
            } else if (!Character.isDigit(text.charAt(i+1))) {
                resultat += caracter + ")";
            }
        }
    }
    
    return resultat;
    }   
}
