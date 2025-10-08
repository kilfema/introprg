/*
 * Kilian Fernández - 8/10/2025
 * Aquest programa distingueix quin dia de la setmana és quan l'usuari indica un número i retorna el valor assignat. Utilitza Switch EXpression
 */
 
public class DiaSetmanaSwitchExpression {
    public static void main(String[] args) {
        
        //número que indica l'usuari
        int numero = Integer.parseInt(args[0]);
        
        //switch expression
        String dia = switch (numero) {
            case 1 -> "Dilluns";
            
            case 2 -> "Dimarts";
            
            case 3 -> "Dimecres";
            
            case 4 -> "Dijous";
            
            case 5 -> "Divendres";
            
            case 6 -> "Dissabte";
            
            case 7 -> "Diumenge";
            
            default -> "Error";
        };
        
        //Mostra resultat
        System.out.println(dia);
        
    }
}
