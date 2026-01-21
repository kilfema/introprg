/*
 *Kilian Fernández - 21/01/2026
 * 
 * Programa que rep valors per la línia de comandes i retorna si són enters o no cadascún d'ells.
 *
 */
 
public class SumaEnters {
    public static void main(String[] args) {
    
    System.out.println(sumaEnters(filtraEnters(args)));
    
    }


    public static int quantsEnters(String[] valors) {
    
        int count = 0;
    
        for(int i=0; i < valors.length; i++) {
        
            if (UtilString.esEnter(valors[i])) count++;
        }
        
    return count;
    }
    
    
    
    public static int[] filtraEnters(String[] valors) {
    
    int [] enters = new int [quantsEnters(valors)];
    int countElements = 0;
    
    for (int i=0; i < valors.length; i++) {
        
         if (UtilString.esEnter(valors[i])) {
         
            enters[countElements] = Integer.parseInt(valors[i]);
            countElements++;
         }
    }
    
    return enters;
    }
    
    public static int sumaEnters(int[] valors) {
    
    int suma = 0;
    
    for (int i=0; i < valors.length; i++) {
    
        suma+= valors[i];
    }
    
    return suma;
    }
}
