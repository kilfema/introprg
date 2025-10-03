/*
 * Programa que demana el radi i les unitats,
 * calcula l'àrea d'un cercle i mostra el resultat.
 */

public class CalculaArea {
    public static void main(String[] args) {
        System.out.println("Càlcul de l'àrea d'un cercle");
        
        //Obté radi
        System.out.println("Introduïu el radi:");
        String linia = Entrada.readLine();
        
        //Obté unitats
        System.out.println("Introduïu les unitats (ex. cm)");
        String unitats = Entrada.readLine();
        
        //Calcula àrea
        float radi = Float.parseFloat(linia);
        float area =  (float)Math.PI * radi * radi;
        
        //Mostra resultat
        System.out.println("L'àrea és " + area + " " + unitats + "^2");
    }
}
