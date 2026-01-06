/*
 *Kilian Fernández - 28/10/2025
 * Programa que llegeix línies de text fins que s’introdueix una cadena buida i distribueix els caràcters rebuts en quatre categories: vocals catalanes, consonants, nombres i altres símbols (excloent l’espai). Cada caràcter es guarda una sola vegada, respectant l’ordre d’aparició, i les lletres es mostren en majúscules. Finalment, es mostren únicament les categories que contenen algun caràcter.
 */
 
public class Distribuidor {
    public static void main(String[] args) {
    
    System.out.println("Introduïu texts (INTRO per finalitzar)");
    boolean teText = true;
    
    //variable vocales, consonantes, nombres, simbols
    
    String text = "";
    String vocals = "ÀAÈEÉIÍÏÒOÓUÚÜ";    
    String vocalsTrobades = "";
    char caracterText = 0;
    char caracterVocals = 0;
    boolean repetida = false;
    
    while (teText) {
    
    text = Entrada.readLine(); //demana text
        
        if (text.isEmpty()) {
            teText = false;
            
        } else {
        
        text = text.toUpperCase();
        
        for (int i = 0; i < text.length(); i++) { //bucle del caracter del text d'entrada       
            
            caracterText = text.charAt(i);

            for (int j = 0; j < vocals.length(); j++) { //bucle del caracter de les vocals de referencia
                
                caracterVocals = vocals.charAt(j);
                
                //comprueba coincidencia entre caracter del texto y vocales catalanas
                if (caracterVocals == caracterText) {
                
                //comprueba si está repetido
                for (int l = 0; l < vocalsTrobades.length(); l++) {
                    
                    if (vocalsTrobades.charAt(l) == caracterText) {
                        repetida = true;
                    }                    
                }
                }
            }
        
        if (!repetida) {
            vocalsTrobades += caracterText;
            repetida = false; //reinicia booleano para siguiente comprobación
        }
        
        }
        }
        }

    System.out.println(vocalsTrobades);
        
    }
}
