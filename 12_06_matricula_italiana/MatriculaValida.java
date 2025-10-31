/*
 *Kilian Fernández - 28/10/2025
 * Aquest programa rep una entrada de text i retorna si és una matricula vàlida.
 */
 
public class MatriculaValida {
    public static void main(String[] args) {
        
        //Demana text
        System.out.println("Introduïu una matrícula");
        String matricula = Entrada.readLine();
        
        matricula = matricula.toUpperCase(); //convierte en mayuscula
        
        //confirma si té llargada minima
        boolean teLlargadaMinima = (matricula.length() == 6);
        
        boolean esCorrecte = false;
        
        
        if (teLlargadaMinima) {
        //confirma si les posicions dels números ho son
        boolean sonNumero = Character.isDigit(matricula.charAt(2)) && Character.isDigit(matricula.charAt(2)) && Character.isDigit(matricula.charAt(2));
            
        //confirma si les posicions de les lletres ho son
        boolean sonLletra = Character.isLetter(matricula.charAt(0)) && Character.isLetter(matricula.charAt(1)) && Character.isLetter(matricula.charAt(5)) && Character.isLetter(matricula.charAt(6));
            
        //confirma si les lletres son caracters no permesos
        boolean esExcepcio = ( 
            (matricula.charAt(0) == 'I' || matricula.charAt(0) == 'O' || matricula.charAt(0) == 'Q' || matricula.charAt(0) == 'U') || 
            (matricula.charAt(1) == 'I' || matricula.charAt(1) == 'O' || matricula.charAt(1) == 'Q' || matricula.charAt(1) == 'U') || 
            (matricula.charAt(5) == 'I' || matricula.charAt(5) == 'O' || matricula.charAt(5) == 'Q' || matricula.charAt(5) == 'U') || 
            (matricula.charAt(6) == 'I' || matricula.charAt(6) == 'O' || matricula.charAt(6) == 'Q' || matricula.charAt(6) == 'U')
            );

            if (teLlargadaMinima && sonLletra && sonNumero && !(esExcepcio)) {
            esCorrecte = true;
            }
       }
       
       //envia missatge
       if (esCorrecte) {
            System.out.println("És una matrícula italiana vàlida");
            
       } else {
            System.out.println("No és una matrícula italiana vàlida");
       }
    
   }
}
