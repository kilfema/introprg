/*
* Kilian Fernández - 14/11/2025
*
*Programa que demana un nom, edat i any actual. Fa un recorregut indicant l'edat que es tenía en cada any fins arribar a l'actual. En acabar, es despedeix
*
*/

public class HistoricEdats {
    public static void main(String[] args) {
    
    //demana nom
    System.out.println("nom?");
    String nom = Entrada.readLine(); 
    
    //valida que l'entrada no estigui vuida
    if (nom.isBlank()) {
        System.out.println("Entrada incorrecta");
        
    } else {
    
    //demana edat
    System.out.println("edat?");
    int edat = Integer.parseInt(Entrada.readLine());
    
    //comprova que no sigui menor que 0
    if (edat < 0) {
        System.out.println("Entrada incorrecta");
  
    } else {
    
    //demana any actual    
    System.out.println("any actual?");
    int any = Integer.parseInt(Entrada.readLine());
    
    //condició -> és menor de 1971?
    if (any < 1971) {
        System.out.println("Entrada incorrecta");
        
    } else {
    
    //calcula quin és l'any de naixement i assigna a una variable el comptador d'edat
    int anyInicial = any - edat;
    int edatCompt = 0;
    
    //i és any inicial. Mentres l'any inicial sigui menor que l'any actual, seguirà sumant 1 a l'any inicial.
    for (int i = anyInicial; i < any; i++) {
        
        //condicions que modifiquen el missatge de resposta: si l'edat és 0, si és 1, i else.
        if (edatCompt == 0) {
            System.out.println("El " + i + " vau néixer");
            
        } else if (edatCompt == 1) {
            System.out.println("El "+ i + " teníeu " + edatCompt + " any");
            
        } else {
            System.out.println("El " + i + " teníeu " + edatCompt + " anys");
        }
        
    //suma 1 al comptador de l'edat
    edatCompt++;
    
    }
    
    System.out.println("Adéu " + nom);
    
    }    
     
    }
    }
    
    }    
}
