/*
 *Kilian Fernández - 20/01/2026
 * Programa que guarda tres enters en un array i els mostra per pantalla.
 */
 
public class EntersEntreComes {

    public static void main(String[] args) {
        
        System.out.println("Quants?");
        int numElements = UtilString.demanaEnterValid(Entrada.readLine());
        
        if (numElements<1) {
            System.out.println("Res a fer");
            return;
        }
        
        System.out.println("Separador?");
        char separador = UtilString.separadorChar(Entrada.readLine());
        
        int[] enters = new int [numElements];
        
        for (int i=0; i <enters.length; i++) {
        
            System.out.println("Valor " + (i+1) + "?");
            enters [i] = UtilString.demanaEnterValid(Entrada.readLine()); 
        }
        
        System.out.println(UtilString.entreComes(enters, separador));
  
    }
}
