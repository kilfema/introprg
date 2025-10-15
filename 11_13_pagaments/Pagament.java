/*
 * AQuest programa demana una quantitat que s'ha de pagar i la quantitat que s'ingressa, i retorna el faltant o sobrant, si n'hi ha.
 */
public class Pagament {
    public static void main(String[] args) {
    
        //demana valors
        System.out.println("Preu?");
        int preu = Integer.parseInt(Entrada.readLine());
        System.out.println("Paga?");
        int cuantia = Integer.parseInt(Entrada.readLine());
       
        if (preu < cuantia) {
            int diferenciaPositiva = cuantia - preu;
            System.out.println("Sobren " + diferenciaPositiva + "€");
        } else if (preu > cuantia) {
            int diferenciaNegativa = preu - cuantia;
            System.out.println("Falten " + diferenciaNegativa + "€");
        } else {
            System.out.println("Ni sobra ni falta res");
        }
        
    }
}
