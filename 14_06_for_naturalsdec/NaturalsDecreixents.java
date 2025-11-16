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
        
        for (int comptador = i; comptador >= 1; --comptador) {
            System.out.println(comptador);
        }
    
    
    }
    
    }
}
