/*
 *Kilian Fernández - 12/01/2026
 * Programa que rep un text i el repeteix si té vocal. Si no en té, pregunta a l'usuari si vol continuar amb el programa.
 */
 
public class LloroVocalIniciFi {
    public static void main(String[] args) {
    
    int comptador = 1;
    boolean esVocal = false;
       
    while (true) {

        System.out.println("Text?");
        String text = Entrada.readLine();
        
        if (text.isEmpty()) {
            confirmarSortida();
        }
        
        String textMinus = text.toLowerCase();
        
        for (int i = 0; i < textMinus.length(); i++) {
            char caracterText = text.charAt(i);
            esVocal = UtilString.esVocal(caracterText);
            
            if (esVocal) break;   
        }    

        if (!esVocal) {
            confirmarSortida();
        }
        
        
        boolean confirmarSortida = false;
        if (confirmarSortida) return;
        
        //lloro
        System.out.println(comptador + ": \"" + text + "\"");
        comptador++;
    }
    }
    
    public static boolean confirmarSortida() { //modul de confirmació de sortida. quan s'activa, pregunta a l'usuari si vol sortir i crida a UtilitatsConfirmació per valorar si la resposta és afirmativa.
    
            System.out.println("Sortir?");
            String respostaSortir = Entrada.readLine();
            boolean volSortir = UtilitatsConfirmacio.respostaABoolean(respostaSortir);
                
            if (volSortir) {
                System.out.println("Adéu");
                return true;
            }
                     
    return false;
    }
}
