/*
 *Kilian Fernández - 12/01/2026
 * Programa que rep un text i el repeteix si té vocal. Si no en té, pregunta a l'usuari si vol continuar amb el programa.
 */
 
public class LloroVocalIniciFi {
    public static void main(String[] args) {
    
    int comptador = 1;
    boolean textValid = false;
       
    while (true) {

        System.out.println("Text?");
        String text = Entrada.readLine();
        textValid = analisisText(text);

        boolean confirmarSortida = false;        
        if (!textValid) {
            confirmarSortida = confirmarSortida();          
        }
        
        if (confirmarSortida) return; 

        //lloro
        if (textValid) {
        System.out.println(" " + comptador + ": \"" + text + "\"");
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
    ** confirmar si té vocals. Retorna booleà */
    public static boolean analisisText(String text) {
        boolean esVocal = false;
         
        if (text.isEmpty()) {
            return false;
        }
        
        String textMinus = text.toLowerCase();
        for (int i = 0; i < textMinus.length(); i++) {
            char caracterText = textMinus.charAt(i);
            esVocal = UtilString.esVocal(caracterText);
 
            if (esVocal) return true;   
        }
        
    return false;
    } 
}
