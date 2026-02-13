/*
 * Kilian Fernández
 * 13/02/2026
 *
 * Programa que demana un text a l’usuari i retorna una cadena amb tots
 * els caràcters numèrics que apareixen al text original, utilitzant
 * una solució recursiva sense iteradors.
 */


 public class ExtreuNombres {

    public static void main(String[] args){

        System.out.println("Text?");

        String text = Entrada.readLine();

        String nombres = extreuNombres(text);

        System.out.println(nombres);

    }


    // extreu els nombres i els retorna concatenats

    public static String extreuNombres(String text) {

        String nombres = "";
        // cas base

        if (text.isEmpty()) {
            
            return "";
        }


        // tracta pas actual

        char primer = text.charAt(0);
        
        if (Character.isDigit(primer)) nombres += primer;
            

        // tracta pas recursiu

        String restaText = text.substring(1);


        // composa resultat
        
        
        
        return nombres + extreuNombres(restaText);
     
    }
}
