/*
* Kilian Fernández - 4/11/2025
* Aquest programa demana un número enter indefinidament, quan rep un de negatiu, finalitza el programa i indica la cuantitat de números parells s'han donat.
*/
public class QuantsParells {
    public static void main(String[] args) {

        
        int valor = 0;   
        
        int quantitatParells = 0;

 
        while (valor >= 0) { // mentres el valor és igual o major que cero
            
            //demana valor
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
 
            //si el valor és parell
            if (valor % 2 == 0 && valor >= 0) {
                quantitatParells = quantitatParells + 1;            
            }
        }
        
        // mostrem el resultat
        System.out.println("Nombre de parells introduïts: " + quantitatParells);
    }
}
