/*
 * Aquest programa simula un metge virtual. Pregunta al usuari si té una serie de simptomes i retorna una resposta.
 */
public class Metge {
    public static void main(String[] args) {
    
        //Demana valors
        System.out.println("Esternuts? (sí o no)");
        String esternuts = Entrada.readLine();
        
        boolean preguntarTos = false;

        
        //valora esternuts
        if (esternuts.equals("sí")) {
            System.out.println("Mal de cap? (sí o no)");
            String malCap = Entrada.readLine();
            
            //sí esternuts + valora mal de cap
            if (malCap.equals("sí")) {
            System.out.println("Problemes d'estómac? (sí o no)");
            String estomac = Entrada.readLine();
            
                //sí esternuts i mal de cap + valora problemes estomac
                if (estomac.equals("sí")) {
                    System.out.println("Pren paracetamol");
                } else {
                    System.out.println("Pren una aspirina");
                }
                
            //si estornuts i no mal cap + valora tos
            } else if (malCap.equals("no")) {
                preguntarTos = true;
            }
       
       //no esternuts + valora tos     
        } else if (esternuts.equals("no"))
            preguntarTos = true;
            
       //valora tos
       if (preguntarTos) {
            System.out.println("Tos? (sí o no)");
            String tos = Entrada.readLine();
                
                if (tos.equals("sí")) {
                   
                    //si tos + valora edat
                    System.out.println("Edat");
                    int edat = Integer.parseInt(Entrada.readLine());
                    
                    if (edat >=12){
                        System.out.println("Pren un carmel d'eucaliptus");
                    } else {
                        System.out.println("Pren un carmel de mel");
                    }
                    
                } else 
                    System.out.println("Vine a la consulta");
       }
        
    }   
}
