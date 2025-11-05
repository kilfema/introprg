/*
* Kilian Fernández - 5/11/2025
* Aquest programa demana un enter indefinidament fins que rep un valor negatiu. Retorna el valor més gran que s'ha introduït
*/
public class TrobaMaxim {
    public static void main(String[] args) {

        int valorActual = 0; //inicialitza valor amb el que es treballa
        
        int valorMaxim = 0; //inicialitza variable on es guarda el valor més gran
 
        while (valorActual >= 0) { // mentres no sigui menor que 0
            
            //demana valor
            System.out.println("Introdueix un valor");
            valorActual = Integer.parseInt(Entrada.readLine());
            
            if (valorActual > valorMaxim) { //si el valor actual introduït es major al valor màxim actual
                    valorMaxim = valorActual;          
            }
        }

        // acaba el bucle i es despedeix
        System.out.println("El màxim és " + valorMaxim);
    }
}
