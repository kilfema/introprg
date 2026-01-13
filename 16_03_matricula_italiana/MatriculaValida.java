/*
 *Kilian Fernández - 28/10/2025
 * Aquest programa rep una entrada de text i retorna si és una matricula vàlida.
 */
 
public class MatriculaValida {
    public static void main(String[] args) {
        
        //Demana text
        System.out.println("Introduïu una matrícula");
        String matricula = Entrada.readLine();
        
        boolean esIncorrecte = false;
        
        //confirma si té llargada minima
        if (!(matricula.length() == 7)) {
            mostraMissatgeIncorrecte();
            return;
        }
        
        //valida si és lletra correcte
        for (int i = 0; i < matricula.length(); i++) {
            //valora només lletres de les posicions indicades
            if (i == 0 || i == 1 || i == 5 || i == 6) {
            //comproba si és lletra vàlida i retorna boolea
            boolean lletraValida = esLletraValidaPerMatriculaItaliana(matricula.charAt(i));
                        
                if (!lletraValida) {
                    mostraMissatgeIncorrecte();
                    return;
                }
            }
            
            boolean posicioCorrecte = esPosicioCorrecte(matricula.charAt(i), i);
            
            if (!posicioCorrecte) {
                mostraMissatgeIncorrecte();
                return;
            }

        }
        System.out.println("És una matrícula italiana vàlida");
    }
        
    public static boolean esLletraValidaPerMatriculaItaliana(char lletra) {
        
        String lletresValides = "ABCDEFGHJKLMNPRSTVWXYZ";
            
        for (int i = 0; i < lletresValides.length(); i++) {

            if (lletresValides.charAt(i) == lletra) return true;
        }
        return false;
     }

 
    public static void mostraMissatgeIncorrecte() {
        System.out.println("No és una matrícula italiana vàlida");
    }
       
    public static boolean esPosicioCorrecte(char caracter, int posicio) {
            
            if (posicio == 0 && Character.isLetter(caracter)) return true;
            
            if (posicio == 1 && Character.isLetter(caracter)) return true;
            
            if (posicio == 2 && Character.isDigit(caracter)) return true;
            
            if (posicio == 3 && Character.isDigit(caracter)) return true;
            
            if (posicio == 4 && Character.isDigit(caracter)) return true;
            
            if (posicio == 5 && Character.isLetter(caracter)) return true;
            
            if (posicio == 6 && Character.isLetter(caracter)) return true;
            
            return false;
    }
}
