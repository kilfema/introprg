/*

 *  Kilian Fernández  28/01/2026
 
 * Simulació de tres en ratlla amb arrays bidimensionals

 */


public class TresEnRatlla {

    public static void main(String[] args){
        
        // declaració del tauler

        char[][] taulell = new char[3][3];


        // inicialització de l'array
        
        for (int fila=0; fila<3; fila++) {
            for (int columna=0; columna<3; columna++) {
                taulell[fila][columna] = '·';
            }
        }
        
        System.out.println("Comença el joc");     
        
        while (true) {
            
            
            mostraTaulell(taulell);
            
            char jugador; 
            String entrada = "";
            int posLin = 0;
            int posCol = 0;
            
            while (true) { 
                
                jugador = 'X';
                //Torn de X
                System.out.println("X?");
                entrada = Entrada.readLine();
            
                if (entrada.equalsIgnoreCase("a")) {
                    System.out.println("Cancel·lat");
                    return;
                }
                
                if (coordenadaValida(entrada)) {
                
                    posLin = Integer.parseInt(String.valueOf(entrada.charAt(0)));
                    posCol = Integer.parseInt(String.valueOf(entrada.charAt(1)));
                    
                    if (casellaOcupada(taulell, posLin, posCol)) {
                        
                        System.out.println("Posició ocupada");
                        continue;
                        
                    } else if (hiHaEmpat(taulell)) {
                                           
                            System.out.println("No es poden fer més moviments");
                            return; 
                            
                    } else {
                    
                        taulell[posLin][posCol] = 'X';
                        mostraTaulell(taulell);
                        
                        if (jugadorGuanya(taulell, jugador)) {
                        
                            System.out.println(jugador + " Guanya");
                            return;
                        }                      
                    }
                                        
                } else {
                
                    System.out.println("Coordenades incorrectes");
                    continue;
                }
                
            break;
            } 
            
            while (true) { 
                
                jugador = 'Y';
                //Torn de Y
                System.out.println("Y?");
                entrada = Entrada.readLine();
            
                if (entrada.equalsIgnoreCase("a")) {
                    System.out.println("Cancel·lat");
                    return;
                }
                
                if (coordenadaValida(entrada)) {
                
                    posLin = Integer.parseInt(String.valueOf(entrada.charAt(0)));
                    posCol = Integer.parseInt(String.valueOf(entrada.charAt(1)));
                    
                    if (casellaOcupada(taulell, posLin, posCol)) {
                        
                        System.out.println("Posició ocupada");
                        continue;
                        
                    } else if (hiHaEmpat(taulell)) {
                        
                            System.out.println("No es poden fer més moviments");
                            return; 
                            
                    } else {
                    
                        taulell[posLin][posCol] = 'Y';
                        mostraTaulell(taulell);
                        
                        if (jugadorGuanya(taulell, jugador)) {
                        
                            System.out.println(jugador + " Guanya");
                            return;
                        }                      
                    }
                                        
                } else {
                
                    System.out.println("Coordenades incorrectes");
                    continue;
                }
                
            break;
            }            
        }
    }


    // mostra el contingut de la fila per sortida estàndard
    
    public static void mostraTaulell(char[][] taulell) {
        
        for (int fila=0; fila<3; fila++) {
            
            for (int columna=0; columna<3; columna++) {
                System.out.print(taulell[fila][columna]);
            }
            
            System.out.println();
        }

    }
    
    public static boolean coordenadaValida(String entrada) {
    
        String coord = "012";
        int count = 0;
        
        for (int i= 0; i < 2; i++) {
            
            char caracter= entrada.charAt(i);
            
            for (int j=0; j<coord.length(); j++) {
                
                if (caracter == coord.charAt(j)) {
                    count++;
                    break;
                }
            }
        
            if (count == 2) return true;
        }
        
    return false;
    }
    
    public static boolean casellaOcupada(char[][] taulell, int fila, int columna) {
        
        if (!(taulell[fila][columna] == '·')) {
            return true;
            
        }
        
    return false;
    }
    
    public static boolean jugadorGuanya(char taulell[][], char jugador) {
        
        //Comprobar linia
        for (int i=0; i<3; i++) {
            int count = 0;
            
            for (int j=0; j<3; j++) {
                
                if (taulell[i][j] == jugador) {
                    count++;
                
                    if (count==3) return true;
                }
            }
        }
        
        //Comprobar columna
        for (int i=0; i<3; i++) {
            int count = 0;
            
            for (int j=0; j<3; j++) {
                
                if (taulell[j][i] == jugador) {
                    count++;
                    
                    if (count==3) return true;
                }
            }
        }
        
        // comprobar creu
        if (taulell[1][1] == jugador) {
            
            if ((taulell[0][0] == jugador && taulell[2][2] == jugador) ||
                (taulell[0][2] == jugador && taulell[2][0] == jugador)) 
                return true;
        }
    
    return false;
    }
    
    public static boolean hiHaEmpat(char taulell[][]) {
        
        for (int i=0; i<3; i++) {
           
            for (int j=0; j<3; j++) {
                
                if (taulell[i][j] == '·') return false;
            }
        }
        
    return true;
    }
}


