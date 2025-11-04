/*
* Kilian Fernández - 4/11/2025
* Aquest programa demana un text. Si té contingut, el repeteix. Sinó, es despedeix i acaba el programa.
*/
public class Lloro {
    public static void main(String[] args) {

        boolean estaBuida = false;
 
        while (estaBuida == false) { // mentres no sigui un string vuit
            
            //demana valor
            System.out.println("El lloro espera paraula:");
            String text = Entrada.readLine();
 
            //si text està vuit
            if (text.isEmpty() || text.isBlank()) {
                estaBuida = true;     
                       
            } else {
                System.out.println("El lloro repeteix: " + text);
            
            }
        }

        // acaba el bucle i es despedeix
        System.out.println("Adéu");
    }
}
