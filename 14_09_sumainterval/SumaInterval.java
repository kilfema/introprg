/*
* Kilian Fernández - 14/11/2025
*
*Programa que demana dos enters i suma tots els valors entre ells (incloent-los), mostrant cada pas del càlcul. *Comença sempre pel nombre més petit i acumula la suma fins al més gran.
*
*/

public class SumaInterval {
    public static void main(String[] args) {
    
    System.out.println("primer?");
    int primerEntrada = Integer.parseInt(Entrada.readLine());
    
    System.out.println("segon?");
    int segonEntrada = Integer.parseInt(Entrada.readLine());
    
    int inici = primerEntrada;
    int vfinal = segonEntrada;
    
    if (primerEntrada > segonEntrada) {
        inici = segonEntrada;
        vfinal = primerEntrada;
    }

    int suma = 0;
    
    for (int i = inici; i <= vfinal; i++) {
        System.out.println(suma + " + " + i + " = " + (suma+i));
        suma+= i; 
    }
        
        
    }
}
