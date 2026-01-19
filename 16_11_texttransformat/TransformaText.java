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
        
        //Casos
        // ESPACIOS BLANCOS
        if (Character.isWhitespace(caracter)) {
            resultat += caracter;
            continue;
        }
        
        //VOCALES
        if (UtilString.esVocal(caracter)) {
            resultat+= caracter;
            continue;
        }
        
        
        //CONSONANTES
        if (UtilString.esConsonant(caracter)) {
            resultat += Character.toUpperCase(caracter);
            continue;
        }
       
       //DIGITOS 
        if (Character.isDigit(caracter)) {
            
            //Añadir "(". Valora si es el primer caracter, o si el caracter anterior no es digito
            //Se ha hecho con estos dos condicionales para evitar errores OutOfBondex
            if (i == 0) {
               resultat += "("; 
               
            } else if (!Character.isDigit(text.charAt(i-1))) {
                resultat += "("; 
            }
            
            //concatena caracter
            resultat += caracter;    
            
            
            //Añadir ")". Valora si es el último caracter o si el caracter posterior no es digito.
            if (i == text.length() - 1) {
                resultat += ")";
                
            } else if (!Character.isDigit(text.charAt(i+1))) {
                resultat += ")";
            }
        }
    }
    
    return resultat;
    }   
}
