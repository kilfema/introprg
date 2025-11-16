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
    
    int valorSuma = primerEntrada;
    int valorFinal = segonEntrada;
    
    if (primerEntrada > segonEntrada) {
        valorSuma = segonEntrada;
        valorFinal = primerEntrada;
    }

    int resultat = 0;
    
    System.out.println(valorSuma);
    
    for (int i = 0; valorSuma <= valorFinal; resultat = valorSuma + i) {
        
        resultat = valorSuma + i;
        
        System.out.println(i + " + " +  valorSuma + " = " + resultat);
        
        i = resultat;
        
        valorSuma++;
    }
        
        
    }
}
