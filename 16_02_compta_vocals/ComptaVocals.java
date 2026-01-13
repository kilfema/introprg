/*
 *Kilian Fernández - 12/01/2026
 * Programa que rep un text i mostra totes les vocals catalanes que té
 */
 
public class ComptaVocals {
    public static void main(String[] args) {
        System.out.println("Introdueix un text");
        String text = Entrada.readLine();
        
        String vocals = "aàeèéiíïoóòuúü";
        
        //recorregut vocals
        for (int i = 0; i < vocals.length(); i++) {
            char vocal = vocals.charAt(i);
            int comptador = quantesOcurrencies(text, vocal);           
            mostraOcurrencies(vocal, comptador);
        }
        
    }
    
    public static void mostraOcurrencies(char lletra, int quantes) {
        System.out.println("Nombre de '" + lletra + "'s: " + quantes);
    }
    
    public static int quantesOcurrencies(String text, char lletra) {
        int comptador = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra) {
                comptador += 1;
            }
        }
        return comptador;
    }
}
