/*
* Kilian Fernández - 6/11/2025
* Programa que demana valors indefinidament
*
*/
public class EndevinaNombre {
    public static void main(String[] args) {
    
    //valor pensat
    int valorPensat = Integer.parseInt(args[0]);
    
    String valorActual = " ";
    
    boolean haEncertat = false;
    
    System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
    
    while (!haEncertat) {
    
        //demanaValor   
        System.out.println("Introdueix un valor");
        valorActual = Entrada.readLine();
        
        //comprova si està vuit
        if (valorActual.isBlank()) {
            System.out.println("Cancel·lat!");
            haEncertat = true;
            
        } else {
            //transforma a int  
            int valorActualInt = Integer.parseInt(valorActual);
            
            //si menor de 1
            if (valorActualInt < 1) {
                System.out.println("Com a mínim 1");
            
            //si menor de 100    
            } else if (valorActualInt > 100) {
                System.out.println("Com a màxim 100");
            
            //compara amb valor pensat i dona pista
            } else {
                
                if (valorActualInt < valorPensat) {
                System.out.println("És més gran que " + valorActual);
                
                } else if (valorActualInt > valorPensat) {
                    System.out.println("És més petit que " + valorActual);  
                    
                } else {
                    System.out.println("Has encertat!");
                    haEncertat = true;
                }
            }
        }      
    } 
   

    }
}
