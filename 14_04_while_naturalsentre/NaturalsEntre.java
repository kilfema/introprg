/*
* Kilian Fernández - 14/11/2025
*
* Programa que demana tres enters no negatius (inici, final i salt),
* en valida l’ordre i els valors, i si són correctes mostra tots els
* nombres entre inici i final avançant segons el salt. Si algun valor
* no és vàlid, mostra "Valor no vàlid" i acaba.
*
*/
public class NaturalsEntre {
    public static void main(String[] args) {
    
    System.out.println("Valor inicial?");
    int valorInicial = Integer.parseInt(Entrada.readLine());
    String error = "Valor no vàlid"; //missatge d'error
    
        if (valorInicial >= 0) { //comprova que el primer valor no sigui negatiu
            
            //demana valor final
            System.out.println("Valor final?");
            int valorFinal = Integer.parseInt(Entrada.readLine());
            
            if (valorFinal >= valorInicial) {
            
            //demana salt
            System.out.println("Salt?");
            int salt = Integer.parseInt(Entrada.readLine());
            
                if (salt > 0) {
                
                System.out.println(valorInicial);
                int comptador = valorInicial + salt;
                
                    while (comptador < valorFinal) {
                    
                        System.out.println(comptador);
                        comptador += salt;
                    }
                    
                } else {System.out.println(error);}
            
            } else {System.out.println(error);}
            
        } else {System.out.println(error);} 
    }
}
