/*
* Kilian Fernández - 14/11/2025
* Programa que rep un numero enter positiu i compta des de l'1 fins arribar al número rebut
*
*/
public class Naturals {
    public static void main(String[] args) {
    
    //valor inicial 
    int i = Integer.parseInt(args[0]);
    
    if (i<1) { //si és menor que 1
        System.out.println("Cap valor creixent entre 1 i " + i);  
    
    } else {
        
        int comptador = 1;

        while (comptador != i) { //mentres el comptador no arribi a l'index, mostra en pantalla i suma 1
            System.out.println(comptador);
            ++comptador;
        }
    //imprimeix valor final
    System.out.println(comptador);
    
    }
    
    }
}
