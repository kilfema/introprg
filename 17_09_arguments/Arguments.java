/*
 *Kilian Fernández - 21/01/2026
 * 
 * Programa que rep valors per la línia de comandes i retorna si són enters o no cadascún d'ells.
 *
 */
 
public class Arguments {
    public static void main(String[] args) {
    
    if (args.length == 0) {
        System.out.println("Cap argument");
        return;
    }
    
    boolean esEnter = false;
    
    for (int i=0; i < args.length; i++) {
        
        if (UtilString.esEnter(args[i])) {
            System.out.println("[" + i + "] \"" + args[i] + "\": és enter");
            
        } else {
            System.out.println("[" + i + "] \"" + args[i] + "\": no és enter");
        }
        
    }
    }
}
