/*
* Kilian Fernández - 14/11/2025
* Programa que rep un numero enter positiu i compta des del número rebut fins arribar a 1
*
*/
public class NaturalsDecreixents {
    public static void main(String[] args) {
    
    //valor inicial 
    int i = Integer.parseInt(args[0]);
    
    if (i<1) { //si és menor que 1
        System.out.println("Cap valor decreixent entre " + i + " i 1");  
    
    } else {
        
        int comptador = i;

        while (comptador != 1) { //mentres el comptador no arribi a 1
            System.out.println(comptador);
            --comptador;
        }
    //imprimeix valor final
    System.out.println(1);
    
    }
    
    }
}
