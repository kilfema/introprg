/*
* Kilian Fernández - 14/11/2025
*
*Programa que demana dos enters i suma tots els valors entre ells (incloent-los), mostrant cada pas del càlcul. *Comença sempre pel nombre més petit i acumula la suma fins al més gran.
*
*/

public class LletresInterval {
    public static void main(String[] args) {
    
    System.out.println("lletra?");
    String entradaString = Entrada.readLine();
    char lletra = entradaString.charAt(0);
    
    if (entradaString.length() > 1) {
        System.out.println("ERROR: cal especificar una única lletra.");
        
        if ((lletra < 'a' && lletra > 'z') || lletra < 'A' && lletra > 'Z') {
            System.out.println("Error"); 
        
    } else {
        
    System.out.println("quantes?");
    int numero = Integer.parseInt(Entrada.readLine());

        if (numero < 1) {
            System.out.println("Error");
        
        } else {
        
        int acabaAmb = lletra + numero;

        for (char i = lletra; i < acabaAmb; i++) {

            System.out.print((char) i);
            
            if (i == 'Z' || i == 'z') {
                
                int saltsRealitzats = i - lletra;    
                int saltsRestants = numero - saltsRealitzats;
                
                if (i == 'z') {
                i = 96;
                acabaAmb = 'a' + (saltsRestants - 1);
                
                } else if (i == 'Z') {
                i = 64;
                acabaAmb = 'A' + (saltsRestants - 1);
                }
            }
        }
        }
        }
    }
    
    }    
}
