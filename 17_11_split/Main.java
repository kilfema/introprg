/*
 *Kilian Fernández - 21/01/2026
 * 
 * Aquest programa separa un text en fragments utilitzant els espais en blanc com a separadors, amb
 * l’opció d’incloure o no aquests espais en el resultat, i retorna un array de String amb el
 * resultat de la separació.
 *
 */
 
public class Main {
    public static void main(String[] args) {
    
    System.out.println("Text principal?");
    String text = Entrada.readLine();
    
    System.out.println("Inclou espais?");
    boolean inclouBlancs = UtilitatsConfirmacio.respostaABoolean(Entrada.readLine());
    
    String[] resultat;
    
    if (inclouBlancs) {
        resultat = UtilString.separa(text, inclouBlancs);
        
    } else {
        resultat = UtilString.separa(text);
    }
    
    if (resultat.length == 0) {
    
        System.out.println("Cap resultat");
        return;
    }
    
    for (int i=0; i<resultat.length; i++) {
        
        if (resultat[i] == null) break;
        
        System.out.println("- \"" + resultat [i] + "\"");
    }

    }
}
