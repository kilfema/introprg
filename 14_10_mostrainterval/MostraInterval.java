/*
* Kilian Fernández - 14/11/2025
*
*Programa que demana dos enters i suma tots els valors entre ells (incloent-los), mostrant cada pas del càlcul. *Comença sempre pel nombre més petit i acumula la suma fins al més gran.
*
*/

public class MostraInterval {
    public static void main(String[] args) {
    
    System.out.println("inici?");
    int primer = Integer.parseInt(Entrada.readLine());
    
    System.out.println("final?");
    int segon = Integer.parseInt(Entrada.readLine());
    
    if (primer < segon) {
        
        for (int i=primer; i <= segon ; i++) {
            System.out.println(i);
        }
        
    } else {
    
        for (int i=primer; i >= segon; i--) {
            System.out.println(i);
        }
    }
        
    }
}
