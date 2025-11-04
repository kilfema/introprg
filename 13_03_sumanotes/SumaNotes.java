/*
* Kilian Fernández - 4/11/2025
* Aquest programa demana notes del 0 al 100 i les suma fins que apareix un valor no vàlid. Retorna el total sumat
*/
public class SumaNotes {
    public static void main(String[] args) {

        
        int suma = 0;   
        
        int valor;

        
        System.out.println("Introdueix una nota");
        valor = Integer.parseInt(Entrada.readLine());
        while (valor >= 0 && valor <= 100) {
            suma = suma + valor;
            System.out.println("Introdueix una nota");
            valor = Integer.parseInt(Entrada.readLine());
        }
        
        // mostrem el resultat
        System.out.println("La suma de les notes vàlides és " + suma);
    }
}
