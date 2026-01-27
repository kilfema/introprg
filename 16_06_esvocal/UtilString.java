/*
 *Kilian Fernández - 12/01/2026
 * Modul que rep un text i retorna un boolea confirmant si conté vocal
 */
 
public class UtilString {
   public static boolean esVocal(char caracter) {
        
        String vocals = "aàeèéiíïoóòuúü";
        
            for (int j = 0; j < vocals.length(); j++) {
                if (caracter == vocals.charAt(j)) {
                    return true;
                }
            }
     return false;   
    }
}
