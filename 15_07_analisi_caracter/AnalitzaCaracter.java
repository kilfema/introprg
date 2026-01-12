/*Kilian Fernández - 12/01/2025
** Programa modular que analitza un caracter en una posició i retorna quin tipus és.
**
*/

public class AnalitzaCaracter {
    public static void main(String[] args) {
        
        //demana text
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        if (text.isEmpty()) {
            System.out.println("Text vuit");
            return;
        }
        
        //demana posicio
        System.out.println("Posició?");
        int pos = Integer.parseInt(Entrada.readLine());
        
        //extreu caracter
        int llarg = text.length();
            
        int posicioCaracter = 0;
            
        //es negatiu?
        if (pos < 0) {
            posicioCaracter = ((pos % llarg) + llarg) % llarg;    
        
        //es més llarg que length?
        } else if (pos >= llarg) {
            posicioCaracter = (pos % llarg);
                
        } else  {
            posicioCaracter = pos;
        }
            
        char caracter = text.charAt(posicioCaracter);
        
        analitzaCaracter(caracter);
    }
    
    public static void analitzaCaracter(char caracter) {
    
    String tipusCaracter = "";
            
            if (Character.isLetter(caracter) && Character.isUpperCase(caracter)) {
                tipusCaracter = "una lletra majúscula";
                
            } else if (Character.isLetter(caracter) && Character.isLowerCase(caracter)) {
                tipusCaracter = "una lletra minúscula"; 
            
            } else if (Character.isDigit(caracter)) {
                tipusCaracter = "un dígit";
                
            } else {
                tipusCaracter = "una altra cosa";
            }
               
            System.out.println(String.format("\'%c\' és %s", caracter, tipusCaracter));
    }
}
