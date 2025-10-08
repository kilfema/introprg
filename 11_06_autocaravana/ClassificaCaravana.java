/*
 * Kilian Fernández - 8/10/2025
 * Aquest programa categoritza les caravanes bassant-se en el seu preu. Per fer-ho, utilitza condicionals
 */
 
public class ClassificaCaravana {
    public static void main(String[] args) {
        
        //Demana valor
        int preu = Integer.parseInt(args[0]);
        
        //Si val menys de 50.000
        if (preu <50000) {
            System.out.println("Econòmica");
            
        //si val entre 50.000 i 175.000
        } else if ((preu >=50000) && (preu <=175000)) {
            System.out.println("General");
            
        //si val més de 175.000
        } else {
            System.out.println("Luxe");
        }
    }
}
