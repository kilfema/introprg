/*
 *Kilian Fernández - 20/01/2026
 * Programa que guarda tres enters en un array i els mostra per pantalla.
 */
 
public class EntersEntreComes {

    public static void main(String[] args) {
        
        System.out.println("Quants?");
        int numElements = Integer.parseInt(Entrada.readLine());
        
        if (numElements<1) {
            System.out.println("Res a fer");
            return;
        }
        
        int[] numeros = new int[numElements];

        for (int j = 0; j < numeros.length; j++) {
            System.out.println("Valor " + (j + 1) + "?");
            numeros[j] = Integer.parseInt(Entrada.readLine());
        }
        
        //Mostra sortida
        for (int i = 0; i < numeros.length; i++) {
            
            if (i>0) System.out.print(", ");
            System.out.print(numeros[i]);

        }
    System.out.println();
    }
}
