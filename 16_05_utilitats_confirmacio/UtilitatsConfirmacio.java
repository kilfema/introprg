/* Utilitats de confirmació

 *

 * Aquest mòdul conté diferents utilitats per gestionar les confirmacions

 * Bé, de moment només en tenim una però potser anirem ampliant-ho

 */

public class UtilitatsConfirmacio {

    /*

     * Donada una resposta textual, aquesta funció tradueix la resposta a

     * un booleà.

     * Considera true quan la resposta és, independentment de majúscules i

     * sense considerar espais a l'inici ni al final,

     * "sí", "s", "yes" o "y", i algunes variants amb errors ortogràfics.

     * Altrament considera false.

     */

    public static boolean respostaABoolean(String resposta) {
        
        resposta = senseEspaisVuits(resposta);
        
        if (null == resposta) {     // si la resposta és null, la donem com a false

            return false;

        }

        resposta = resposta.toLowerCase();

        if (resposta.equals("s") || resposta.equals("y")) {

            return true;

        }

        if (resposta.equals("sí") || resposta.equals("yes")) {

            return true;

        }

        if (resposta.equals("si") || resposta.equals("vale") || resposta.equals("yeah")) {

            return true;

        }

        return false;
    }

    public static String senseEspaisVuits(String text) {
        
        String resposta = "";
        int caracterInicial = 0;
        int caracterFinal = 0;
        
        //analitza quin és el primer caràcter que no és espai blanc
        for (int i = 0; i < text.length(); i++) {
            
            char caracterActual = text.charAt(i);
            
            if (!Character.isWhitespace(caracterActual)) {
                caracterInicial = i;
            break;
            } 
        }
        
        //analitza quin es l'últim caràcter que no és espai blanc
        for (int j = text.length() - 1; j >= 0; j--) {
            
            char caracterActual = text.charAt(j);          
            
            if (!Character.isWhitespace(caracterActual)) {
                caracterFinal = j;
            break;
            } 
        }
       
       //reescriu text des del caràcter inicial trobat fins al caràcter final trobat
       for (int j = caracterInicial; j <= caracterFinal; j++) {
            resposta += text.charAt(j);
       }        
        
    return resposta;
      
    }
}
    
