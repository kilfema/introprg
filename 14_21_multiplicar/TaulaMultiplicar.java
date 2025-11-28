/*
 *Kilian Fernández - 28/10/2025
 * Aquest programa genera taules de multiplicar personalitzades a partir de quatre valors numèrics introduïts per l'usuari: dos per als primers operands i dos per als segons operands.
Si algun valor inicial és més gran que el valor final corresponent, el programa intercanvia els valors i treballa sempre en ordre creixent.
A continuació mostra totes les multiplicacions possibles entre el rang dels primers operands i el rang dels segons operands.
 */
 
public class TaulaMultiplicar {
    public static void main(String[] args) {
        
    //inicialitar valors donats
    int primer = Integer.parseInt(args[0]);
    int segon = Integer.parseInt(args[1]);
    int tercer = Integer.parseInt(args[2]);
    int quart = Integer.parseInt(args[3]);
    
    //ordena valors de més petits a més grans
    //primers operands    
    if (primer > segon) {
        primer = Integer.parseInt(args[1]);
        segon = Integer.parseInt(args[0]);
    }
        
    //segons operands
    if (tercer > quart) {
        tercer = Integer.parseInt(args[3]);
        quart = Integer.parseInt(args[2]);
    }
    
    for (int i = primer; i <= segon; i++) {
        for (int j = tercer; j <= quart; j++)
        System.out.println(i + " x " + j + " = " + i * j);
    
    }
        
        
    }
}
