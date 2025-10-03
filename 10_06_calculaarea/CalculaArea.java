/*
Descripción
*/

public class CalculaArea {
    public static void main(String[] args) {
        System.out.println("Càlcul de l'àrea d'un cercle");
        
        //Obté radi
        System.out.println("Indica el radi:");
        String linia = Entrada.readLine();
        
        //Obté unitats
        System.out.println("Indica les unitats (ex. cm)");
        String unitats = Entrada.readLine();
        
        //Calcula àrea
        float radi = Float.parseFloat(linia);
        float area =  (float)Math.PI * radi * radi;
        
        //Mostra resultat
        System.out.println("L'àrea és " + area + " " + unitats + "²");
    }
}
