import java.util.Scanner;

public class Gay {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        // Pregunta inicial
        System.out.println("Com tens el penis? Entrempat? O fluxitet?");
        String penis = Entrada.nextLine();

        // Pene erecto
        if (penis.equalsIgnoreCase("entrempat")) {

            // Con quién
            System.out.println("Estàs sol? A. Amb Kil // B. Estic sol // C. Amb el Víctor");
            String sol = Entrada.nextLine();

            if (sol.equalsIgnoreCase("A")) {
                System.out.println("S'ha dutxat? Sí o no");
                String dutxat = Entrada.nextLine();

                if (dutxat.equalsIgnoreCase("sí") || dutxat.equalsIgnoreCase("si")) {
                    System.out.println("Error. Kil no es dutxa");
                } else {
                    System.out.println("Doncs a follar");
                    System.out.println("Qui fa de passiu? Respon amb el nom");
                    String passiu = Entrada.nextLine();

                    if (passiu.equalsIgnoreCase("Kilian")) {
                        System.out.println("Nutella en el penis");
                    } else if (passiu.equalsIgnoreCase("Alexis")) {
                        System.out.println("Atenció, obrint portes!");
                    } else {
                        System.out.println("No conec aquest nom.");
                    }
                }

            } else if (sol.equalsIgnoreCase("B") || sol.equalsIgnoreCase("estic sol")) {
                System.out.println("Paja i a dormir");

            } else if (sol.equalsIgnoreCase("C") || sol.equalsIgnoreCase("amb el victor")) {
                System.out.println("Palizón en arena");

            } else {
                System.out.println("Opció no vàlida.");
            }

        } else if (penis.equalsIgnoreCase("fluxitet")) {
            System.out.println("Tens la cuca petita");
        } else {
            System.out.println("No t'entenc, escriu 'entrempat' o 'fluxitet'");
        }

        Entrada.close();
    }
}
