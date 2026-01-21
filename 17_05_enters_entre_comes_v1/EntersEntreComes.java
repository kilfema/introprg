/*
 *Kilian Fernández - 20/01/2026
 * Programa que guarda tres enters en un array i els mostra per pantalla.
 */
public class EntersEntreComes {

    public static void main(String[] args) {

        int[] numeros;

        numeros = new int[3];

        numeros[0]=1;

        numeros[1] = 2;

        numeros[2] = 3;

        System.out.print(numeros[0]);

        for (int i = 1; i < numeros.length; i++) {

            System.out.print(", " + numeros[i]);

        }

        System.out.println();

    }
}
