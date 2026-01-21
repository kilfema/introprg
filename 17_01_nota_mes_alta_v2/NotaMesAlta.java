/*
 *Kilian Fernández - 20/01/2026
 * Programa que llegeix notes enteres d’estudiants (valors entre 1 i 10) fins que s’introdueix un valor
 * negatiu, comprova que s’han introduït com a mínim dues notes i mostra la nota més alta; si no n’hi 
 * ha prou, informa que calen almenys dues notes.
 */
 
 public class NotaMesAlta {
    public static void main(String[] args) {
    
    System.out.println("Introdueix les notes (-1 per finalitzar)");
    int notaMesAlta = 0;
    int count = 0;
    
    while (true) {
    
        int entrada = Integer.parseInt(Entrada.readLine());
        
        if (entrada < 0) break;
        
        count++;
        
        if (entrada > notaMesAlta) notaMesAlta = entrada;
    
    }
    
    if (count < 2) {
        System.out.println("Com a mínim calen dues notes");
        return;
    } 
    
     System.out.println("La nota més alta és " + notaMesAlta);        
    
    }
 }
