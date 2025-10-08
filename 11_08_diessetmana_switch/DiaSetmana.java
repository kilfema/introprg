/*
 * Kilian Fernández - 8/10/2025
 * Aquest programa distingueix quin dia de la setmana és quan l'usuari indica un número. Utilitza switch en comptes d'un condicional
 */
 
public class DiaSetmana {
    public static void main(String[] args) {
        
        //número que indica l'usuari
        int numero = Integer.parseInt(args[0]);
        
        //switch
      
        switch (numero) {
        
        case 1: System.out.println("Dilluns");
            break;
        
        case 2: System.out.println("Dimarts");
            break;
            
        case 3: System.out.println("Dimecres");
            break;
            
        case 4: System.out.println("Dijous");
            break;
            
        case 5: System.out.println("Divendres");
            break;
            
        case 6: System.out.println("Dissabte");
            break;
            
        case 7: System.out.println("Diumenge");
            break;                  
        
        default: System.out.println("Error");
            break;
        }
    }
}
