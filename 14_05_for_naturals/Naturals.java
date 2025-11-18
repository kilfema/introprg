/*
* Kilian Fernández - 14/11/2025
* Programa que rep un numero enter positiu i compta des de l'1 fins arribar al número rebut
*
*/
public class Naturals {
    public static void main(String[] args) {
    
    //valor inicial 
    int valor = Integer.parseInt(args[0]);
    
    if (valor<1) { //si és menor que 1
        System.out.println("Cap valor creixent entre 1 i " + valor);  
    
    } else {
        

        for (int i = 1; i != valor; i++) {
            System.out.println(i);
        }
        
    //imprimeix valor final
    System.out.println(valor);
    
    }
    
    }
}
