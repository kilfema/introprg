/*
 * Aquest programa demana el nombre de fills que tens i et retorna un missatge
 */
 
public class Fills {
    public static void main(String[] args) {
    
        //demana nombre de fills
    
        System.out.println("Quants fills tens?");
        int nombre = Integer.parseInt(Entrada.readLine());

        //condicionals
        if (nombre < 0) {
            System.out.println("No pots tenir menys de 0 fills!");
            
        } else if (nombre == 0) {
            System.out.println("Tot el que t'has estalviat en bolquers!");
            
        } else if (nombre == 1) {
            System.out.println("Compte de no mimar-lo massa!");
            
        } else if (nombre > 1 && nombre < 5) {
            System.out.println("No t'avorreixes a casa, eh?");
            
        } else {
            System.out.println("Tu sí fas país!");
        }
       
        
    }
}
