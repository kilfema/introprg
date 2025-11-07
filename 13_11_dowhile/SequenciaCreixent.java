/*
* Kilian Fernández - 6/11/2025
* Programa que demana valors indefinidament
*
*/
public class SequenciaCreixent {
    public static void main(String[] args) {
    
    System.out.println("Introdueix un valor:");
    int valorActual = Integer.parseInt(Entrada.readLine());
    
    int valorMaxim = 0;
    
    int count = 0;
    
        do {
            
            count ++;
            valorMaxim = valorActual;
            
            System.out.println("Introdueix un valor:");
            valorActual = Integer.parseInt(Entrada.readLine());
               
        } while (valorActual > valorMaxim);
    
    System.out.println("La longitud de la secüència creixent: " + count);
    
    }
}
