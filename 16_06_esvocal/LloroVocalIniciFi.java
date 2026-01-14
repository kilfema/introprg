/*
 *Kilian Fernández - 12/01/2026
 * Programa que rep un text i el repeteix si té vocal. Si no en té, pregunta a l'usuari si vol continuar amb el programa.
 */
 
public class LloroVocalIniciFi {
    public static void main(String[] args) {
    
    int comptador = 1;   
    while (true) {

        System.out.println("Text?");
        String text = Entrada.readLine();
        
        String textMinus = text.toLowerCase();
        
        boolean esVocal = UtilString.esVocal(textMinus);
        
            //si no és vocal, pregunta si vols sortir i crida al mètode de confirmació per decidir 
            //si tanca el programa o torna a demanar text
            String respostaSortir = "";
            boolean volSortir = false;  
            
            if (!esVocal) {
                System.out.println("Sortir?");
                respostaSortir = Entrada.readLine();
                volSortir = UtilitatsConfirmacio.respostaABoolean(respostaSortir);
                
                if (volSortir) {
                    System.out.println("Adéu");
                    return;
                }            
            }
        
        //lloro
        System.out.println(comptador + ": \"" + text + "\"");
        comptador++;
    }
    }
}
