/*
 *Kilian Fernández - 12/01/2026
 * Programa que rep un text i el repeteix si té vocal. Si no en té, pregunta a l'usuari si vol continuar amb el programa.
 */
 
public class LloroVocalIniciFi {
    public static void main(String[] args) {
    
    //Aquest programa té tres sortides diferents depenent de l'entrada donada. per evitar que 
    //una funció retorni més d'un valor, he creat una variable integer anomenada textValid amb 3 
    //opcions que generaràn diferents sortides del programa. 
    //
    // 1. el programa NO conté vocal --> retorna textValid = 0
    // 2. el text comença o acaba amb vocal --> retorna textValid = 1
    // 3. el text conté vocal però NO a l'inici o fi --> retorna textValid = 2
    
    int comptador = 1;
    int textValid = 0;
       
    while (true) {

        System.out.println("Text?");
        String text = Entrada.readLine();
        textValid = analisisText(text);
        
        //retorna 0; crida funcio de confirmar sortida del programa
        boolean confirmarSortida = false;        
        if (textValid == 0) {
            confirmarSortida = confirmarSortida();          
        }
        
        if (confirmarSortida) return; 

        //retorna 1, lloro repeteix 
        if (textValid == 1) {
            if (comptador < 10) {
                System.out.print(" ");
            }
            
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
    ** confirmar si té vocals. Retorna int: 0, 1 o 2. */
    public static int analisisText(String text) {
         
        if (text.isEmpty()) {
            return 0;
        }
        
        String textMinus = text.toLowerCase();
        
        //evalua PRIMERA i ULTIMA vocal
        if (UtilString.esVocal(text.charAt(0))) {
            return 1;
            
        } else if (UtilString.esVocal(textMinus.charAt(text.length() - 1))) {
            return 1;
        
        //si primera o ultima NO son vocal, evalua els caracters restants    
        } else {
            
            for (int i = 1; i < (textMinus.length() - 1); i++) {
                char caracterText = textMinus.charAt(i);

                if (UtilString.esVocal(caracterText)) return 2; 
            }
         
         //si cap és vocal, retorna 0           
        return 0;
    }
    } 
}
