/*
*Kilian Fernández - 7/10/2025
*Exercici per treballar amb la precedència dels operadors lògics i relacionals
*/
public class PrecedenciaOperadors {
    public static void main(String[] args) {
    
        //cas 1 -> 5 + 4 * 3
        
        int primerCas = 5 + (4*3);
        
        //cas 2 -> -5 * 4 + -3
        
        int segonCas = (-5 * 4) + (-3);
        
        //cas 3 -> true && false || ! true
        
        boolean tercerCas = (true && false) || !(true);
        
        //cas 4 -> false && (10 > 3) || ! (4 > 5)
        
        boolean cuartCas = (false && (10 > 3)) || !(4 > 5);
        
        //cas 5 -> (false == (5 > 4)) && (false == ! true) || (false != true)
        
        boolean cinqueCas = ((false == (5 > 4)) && (false == (! true))) || (false != true);
        
        //cas 6 -> 10 - 2 * 3 + 4 / 2

        int siseCas = (10 - (2 * 3)) + (4 / 2);
        
        //cas 7 -> !(5 > 3) || (2 + 2 == 4 && 3 != 1)

        boolean seteCas = (!(5 > 3)) || ((2 + 2 == 4) && (3 != 1));
        
    }
}    
