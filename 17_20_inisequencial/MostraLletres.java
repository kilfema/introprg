/*
 * Kilian Fernández
 * 13/02/2026
 *
 * Programa que demana un text a l’usuari i mostra per pantalla únicament
 * els caràcters que són lletres, utilitzant una solució recursiva.
 */
 public class MostraLletres {

    public static void main(String[] args){

        System.out.println("Text?");

        String text = Entrada.readLine();

        mostraLletres(text);

        System.out.println();   // un salt de línia final

    }


    // mostra només les lletres de text

    public static void mostraLletres(String text) {

        if (text.length() < 1 {      // cas base

            text = "";

        }


        // hi ha al menys un caràcter. Comptem quantes lletres hi queden


        // considerem el primer caràcter

        char primer = text.charAt(0);

        if (Character.isLetter(primer)) {

            text = text.substring(1);

        }


        // considerem les lletres que conté la resta del text

        String restaText = text;  // resta del text

        System.out.println(mostraLletres(restaText));      // crida recursiva

    }

}
