/*
* Kilian Fernández - 6/11/2025
* Programa que demana valors indefinidament
*
*/
public class EndevinaNombre {
    public static void main(String[] args) {
    
    //valor pensat
    int valorPensat = Integer.parseInt(args[0]);
    
    System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat\nIntrodueix un valor");

    int valorActual = Integer.parseInt(Entrada.readLine());
    
    boolean haEncertat = valorPensat == valorActual;
    
    while (!haEncertat) {
    
        //si menor de 1
        if (valorActual<1) {
            System.out.println("Com a mínim 1");
        
        //si menor de 100    
        } else if (valorActual>100) {
            System.out.println("Com a màxim 100");
        
        } else {
            
            if (valorActual < valorPensat) {
            System.out.println("És més gran que " + valorActual);
            
            } else if (valorActual > valorPensat) {
                System.out.println("És més petit que " + valorActual);  
            }
        }
    
    //torna a demanar valor    
    System.out.println("Introdueix un valor");
    valorActual = Integer.parseInt(Entrada.readLine());
        
    } 
    
    System.out.println("Has encertat!");

    }
}
