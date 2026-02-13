/*
 * Kilian Fernández
 * 13/02/2026
 *
 * Programa que demana un text a l’usuari i calcula la suma de tots
 * els dígits numèrics que apareixen en el text, utilitzant una
 * solució recursiva sense iteradors.
 */

public class SumaDigits {

    public static void main(String[] args){

        System.out.println("Text?");

        String text = Entrada.readLine();

        int nombres = sumaDigits(text);

        System.out.println(nombres);

    }


    // XXX

    public static int sumaDigits(String text) {

        if (text.isEmpty()) return 0;

        int suma = 0;
        
        // tracta pas actual
        char primer = text.charAt(0);

        if (Character.isDigit(primer)) {
        
            int numero = Character.getNumericValue(primer);
            suma += numero;
        }
        // tracta pas recursiu

        String restaText = text.substring(1);


        // composa resultat

        return suma + sumaDigits(restaText);

    }

}
