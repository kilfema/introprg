/*
 *Kilian Fernández - 28/10/2025
 * Aquest programa rep una entrada de text i una posició, i retorna el caràcter corresponent.
 */
 
public class AnalitzaCaracter {
    public static void main(String[] args) {
        
        //Demana text
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        //text vuit?
        if (text.isBlank() || text.isEmpty()) {
            System.out.println("Text buit");
            
        } else {
            //demana posició           
            System.out.println("Posició?");
            int pos = Integer.parseInt(Entrada.readLine());
            
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
}
