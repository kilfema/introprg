/*
 *Kilian Fernández - 12/01/2026
 * Programa que rep un text i el repeteix si té vocal. Si no en té, pregunta a l'usuari si vol continuar amb el programa.
 */
 
public class LloroVocalIniciFi {
    public static void main(String[] args) {
    
    int comptador = 1;
    int textValid = 0;
       
    while (true) {

        System.out.println("Text?");
        String text = Entrada.readLine();
        textValid = analisisText(text);

        boolean confirmarSortida = false;        
        if (textValid == 0) {
            confirmarSortida = confirmarSortida();          
        }
        
        if (confirmarSortida) return; 

        //lloro
        if (textValid == 1) {
        System.out.println("  " + comptador + ": \"" + text + "\"");
        comptador++;
        }
    }
    }
    
    public static boolean confirmarSortida() { 
    /*Modul de confirmació de sortida. quan s'activa, pregunta a l'usuari si vol sortir i crida a    
    **UtilitatsConfirmació per valorar si la resposta és afirmativa. */
    
        System.out.println("Sortir?");
        String respostaSortir = Entrada.readLine();
        boolean volSortir = UtilitatsConfirmacio.respostaABoolean(respostaSortir);
                
        if (volSortir) {
            System.out.println("Adéu");
            return true;
        }            
        return false;
    }
    
    
    /* Funcio que rep el text, valida si està vuit, i en cas contrari, crida a esVocal per
    ** confirmar si té vocals. Retorna int: 0, 1 o 2. */
    public static int analisisText(String text) {
        
        boolean esVocal = false;
         
        if (text.isEmpty()) {
            return 0;
        }
        
        String textMinus = text.toLowerCase();
        for (int i = 0; i < textMinus.length(); i++) {
            char caracterText = textMinus.charAt(i);
            
            //Crida a la funicó que valida si és vocal. Retorna boolèa
            esVocal = UtilString.esVocal(caracterText);
 
            if (esVocal) {
                
                if (caracterText == 0 || caracterText == text.length() - 1) {
                    return 1;
                    
                } else return 2;
            }   
        }
        
    return 0;
    } 
}
