/*
* Kilian Fernández - 6/11/2025
* Programa que demana una àncora i després un conjunt de valors enters positius.
* Mostra quin valor és més pròxim a l’àncora, escollint el més petit en cas d’empat.
* Finalitza si l’àncora no és positiva o no s’introdueix cap valor vàlid.
*
*/
public class TrobaMesProxim {
    public static void main(String[] args) {
    
    System.out.println("Introdueix l'àncora"); 
    int ancora = Integer.parseInt(Entrada.readLine());
    
    //si l'ancora és menor a 0 --> no valid
    if (ancora < 0) {
        System.out.println("Àncora no vàlida");
    
    } else {
        //demana primer valor
        System.out.println("Introdueix un valor");
        int valorDonat = Integer.parseInt(Entrada.readLine());
        
        //mentre primer valor no sigui positiu o 0, error i segueix demanant un valor
        if (valorDonat < 0) {
            System.out.println("No s'ha introduït cap valor positiu");
            
        } else {
        
            int distanciaAncora = Math.abs(ancora - valorDonat); //proximitat entre ancora i valor donat
            int valorMesProxim = valorDonat; // quin és el valor més próxim, s'utilitzará per mostras el valor final
            int distanciaMesProxim = distanciaAncora; //quina es la distancia més propera dels números donats, s'utilitza per comparar amb els seguents números.
           
            while (valorDonat >= 0) {

                if (distanciaAncora < distanciaMesProxim) {
                    valorMesProxim = valorDonat;
                    distanciaMesProxim = distanciaAncora;
                
                } else if (distanciaAncora == distanciaMesProxim && valorDonat < valorMesProxim) {
                    valorMesProxim = valorDonat;
                }
                
            System.out.println("Introdueix un valor");
            valorDonat = Integer.parseInt(Entrada.readLine());
            distanciaAncora = Math.abs(ancora - valorDonat);
            }
            
            System.out.println("El valor introduït més pròxim a " + ancora + " és " + valorMesProxim);
        }
    }
    
    
    }
}
