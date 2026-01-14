/*
 *Kilian Fernández - 28/10/2025
 * Programa que demana un text i el retorna amb totes les lletres en minúscula, excepete les vocals.
 */
 
public class VocalsMajuscules {
    public static void main(String[] args) {
        
    System.out.println("Text?");
    String text = Entrada.readLine();
    boolean esVocal = false;
    String resultat = "";
        

    for (int i = 0; i < text.length(); i++) {
        char caracter = text.charAt(i);
        esVocal = UtilString.esVocal(caracter);
        
        if (!esVocal) {
            resultat+= Character.toLowerCase(caracter);
        
        } else {
            resultat+= caracter;
        }
    }
    
    resultat = majusculitzaVocals(resultat);
    
    System.out.println(resultat);
    }
    
    public static String majusculitzaVocals(String text) {
        //rep text i passa vocals minuscules a majuscules
    boolean esVocal = false;
    String resultat = "";
    
    for (int i = 0; i < text.length(); i++) {
        char caracter = text.charAt(i);          
        esVocal = UtilString.esVocal(caracter);
            
        if (esVocal) {
            resultat+= Character.toUpperCase(caracter);     
            
        } else {
            resultat+= caracter;
        }
    }
        
    return resultat;
    }    
}
