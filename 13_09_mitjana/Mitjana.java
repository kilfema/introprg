/*
* Kilian Fernández - 5/11/2025
* Aquest programa demana un enter indefinidament fins que rep un valor negatiu. Retorna la mitjana dels valors introduits.
*/
public class Mitjana {
    public static void main(String[] args) {

        int valorActual = 0; //inicialitza valor amb el que es treballa
        
        int sumaValors = 0; //inicialitza variable on es guarda la suma de valors
        
        int quantitatValors = 0; //variable on es guarda el total de valors positius introduïts
 
        while (valorActual >= 0) { // mentres no sigui menor que 0
            
            //demana valor
            System.out.println("Introdueix un valor");
            valorActual = Integer.parseInt(Entrada.readLine());
            
            if (valorActual >= 0) { //si el valor actual introduït es major o igual a 0
                    sumaValors = sumaValors + valorActual; //suma valor actual a la suma de valors
                    
                    quantitatValors = quantitatValors + 1; //suma 1 al total de valors introduits          
            }
        }
        
        double mitjana = 0;
        
        if (quantitatValors == 0) {
            System.out.println("Cap nota vàlida introduïda");
            
        } else if (sumaValors >= 0) {
            mitjana = sumaValors / quantitatValors;
            System.out.println("La mitjana de les notes vàlides és " + mitjana);
        }
    }
}
