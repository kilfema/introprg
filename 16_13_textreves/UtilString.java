/*
 *Kilian Fernández - 12/01/2026
 * Modul que rep un text i retorna un boolea confirmant si conté vocal
 */
 
public class UtilString {
   
   /*
   
   * Funció que rep un caràcter i retorna un booleà indicant si és vocal
   
   */
    public static boolean esVocal(char caracter) {
        
        String vocals = "aàeèéiíïoóòuúü";
        
            for (int j = 0; j < vocals.length(); j++) {
                if (caracter == vocals.charAt(j)) {
                    return true;
                }
            }
     return false;   
    }
    
   /*
  
   * Funció que rep un string amb un text i retorna el mateix text només amb lletres.
   * NO manté espais blancs, dígits, símbols...
   
   */
   
    public static String nomesLletres(String text) {
    
    String resultat = "";
    
    for (int i = 0; i < text.length(); i++) {
        char caracter = text.charAt(i);
        
        if (Character.isLetter(caracter)) {
            resultat+= caracter;
        }
    }
    
    return resultat;    
    }
    
   /*
  
   * Funció que rep un string amb un text i retorna el mateix text separant cada caràcter amb comes.
   
   */
   
    public static String lletresSeparades(String text) {
   
    String resultat = "";
    
    for (int i = 0; i < text.length(); i++) {
        
        if (i > 0) {
            resultat+= ", ";
        }
        
        resultat += text.charAt(i);
    }   
   
    return resultat; 
    }
    
   /*
   
   * Funció que rep un caràcter i retorna un booleà indicant si és consonant minuscula
   
   */
    
    public static boolean esConsonant(char caracter) {
        
        String consonants = "bcdfghjklmnpqrstvwxyzñç";
        
            for (int j = 0; j < consonants.length(); j++) {
                if (caracter == consonants.charAt(j)) {
                    return true;
                }
            }
     return false;   
    }
    
    /*
   
   * Funció que rep un String i retorna el string del revés
   
   */
    
    public static String inverteix(String text) {
    
        String resultat= "";
    
        for (int i = text.length() - 1; i >= 0; i--) {
        
            char caracter = text.charAt(i);
            
            resultat += caracter;
        }
        
        return resultat;    
    }
    
   /* 
   
   * Funció que rep un string amb un text i retorna el string separant cada caracter amb comes.
   
   * Primer, elimina els possibles espais blancs a l'inici o final del text cridant a una altra
   
   * funció anomenada treureEspaisInicialsFinals
   
   */
    
    public static String cometeja(String text) {
    
    text  = cometeja(text);
    
    String resultat = "";
    
    for (int i = 0; i < text.length(); i++) {
       
        char caracter = text.charAt(i);
        
        if (Character.isWhitespace(caracter)) continue;
        
        if (i > 0) {
            resultat += ", ";
        }
        
        resultat += caracter;
    }
    
    return resultat;
    }   
    
    
   /* 
   
   * Funció que rep un string amb un text i retorna el mateix text només amb lletres.
   
   * NO manté espais blancs, dígits, símbols...
   
   */

   
    public static String treureEspaisInicialsFinals(String text) {
    
    String resultat = "";
    int primerCaracter = primerCaracterValid(text);
    int ultimCaracter = ultimCaracterValid(text);
    
    for (int i = primerCaracter; i <= ultimCaracter; i++) {
        char caracter = text.charAt(i);
        
        resultat += caracter;   
    }
    
    return resultat;    
    }

   /* 
   
   * Funció que rep un string amb un text i retorna a quina posició char es troba el primer caràcter
   
   * que NO és espai blanc. El programa no està pensat per rebre strings vuits.
   
   */
       
    public static int primerCaracterValid (String text) {
    
    int caracterValid = 0;
        
    for (int i = 0; i < text.length(); i++) {
        char caracter = text.charAt(i);
        
        if (!Character.isWhitespace(caracter)) {
            caracterValid = i;
            break;
        }
    }
    return caracterValid;   
    }
    
   /* 
   
   * Funció que rep un string amb un text i retorna a quina posició char es troba l'últim caràcter
   
   * que NO és espai blanc. El programa no està pensat per rebre strings vuits.
   
   */
   
    public static int ultimCaracterValid (String text) {
    
    int caracterValid = 0;
        
    for (int i = text.length() - 1; i >= 0; i--) {
        char caracter = text.charAt(i);
        
        if (!Character.isWhitespace(caracter)) {
            caracterValid = i;
            break;
        }
    }
    return caracterValid;   
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
}
