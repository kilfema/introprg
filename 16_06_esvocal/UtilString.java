/*
 *Kilian Fernández - 12/01/2026
 * Modul que rep un text i retorna un boolea confirmant si conté vocal
 */
 
public class UtilString {
   public static boolean esVocal(String text) {
        
        String vocals = "aàeèéiíïoóòuúü";
        
        for (int i = 0; i < text.length(); i++) {
            char caracterText = text.charAt(i);
            
            for (int j = 0; j < vocals.length(); j++) {
                if (caracterText == vocals.charAt(j)) {
                    return true;
                }
            }
        }
        
     return false;   
    }
}
