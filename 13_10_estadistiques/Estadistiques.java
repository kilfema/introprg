/*
* Kilian Fernández - 6/11/2025
* Programa que demana un número enter positiu indefinidament fins que rep un número negatiu. Retorna el valor màxim donat, el valor mínima i la mitjana de tots els introduïts.
*
* Al haver de contemplar l'opció que l'usuari introdueixi 0 com a valor, se m'ha complicat el codi més del que esperava i he agut d'afegir un parell de comprobacions extra: un booleà, un if anidat...
*/
public class Estadistiques {
    public static void main(String[] args) {
    
    System.out.println("Introdueix un valor");
    int valorActual = Integer.parseInt(Entrada.readLine());
    
    int valorMaxim = valorActual;
    int valorMinim = valorActual;
    
    int sumaValors = 0;
    int quantitatValors = 0;
        
        while (valorActual >= 0) { 
            
            sumaValors = sumaValors + valorActual;
            quantitatValors = quantitatValors + 1;
            
            if (valorActual > valorMaxim) {
                valorMaxim = valorActual; //actualiza valor Maximo
                
            } else if (valorActual < valorMinim) {
                     valorMinim = valorActual;//actualiza valor Minimo
            }
            
            System.out.println("Introdueix un valor");
            valorActual = Integer.parseInt(Entrada.readLine());       
        }
        
        double mitjana = 0.0;
        
        
        //si la suma de valores és mayor que 0 -- evita dividir por 0
        if (sumaValors > 0) {
            mitjana = sumaValors / quantitatValors;  //calcula media 
            System.out.println(String.format("El mínim és: %d\nLa mitjana és: %f\nEl màxim és: %d", valorMinim, mitjana, valorMaxim)); 
            
        } else if (valorActual < 0) {
            System.out.println("Cap valor vàlid introduït");
        }

    }
}
