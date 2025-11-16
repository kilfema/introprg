/*
* Kilian Fernández - 14/11/2025
* Programa que rep un numero enter positiu i compta els números parells fins arribar al número donat
*
*/
public class NaturalsParells {
    public static void main(String[] args) {
    
    //valor inicial 
    int i = Integer.parseInt(args[0]);
    
        if (i<1) { //si és menor que 1
            System.out.println("Cap valor parell creixent entre 1 i " + i);  
        
        } else if (i==1) {
            
        } else {    

        for (int comptador = 2; comptador < i; comptador+=2) {
            System.out.println(comptador);
        }

        //imprimeix valor final
        System.out.println(i);
        
        }
    
    }
}
