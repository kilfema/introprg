/*
*Kilian Fernández - 7/10/2025
*Exercici per treballar les taules de veritat
*/
public class taulesVeritat {
    public static void main(String[] args) {
    
        /* ===============================
        * CAS 1
        * la Clara és major d’edat o bé la Clara és més jove que el Marc
        * A = edatClara >= 18
        * B = edatClara < edatMarc
        * A || B
        *  ===============================
        */
    
        System.out.println("CAS 1");
        
        System.out.println("""
        Num   A    B   A || B
        1     T    T     T
        2     T    F     T
        3     F    T     T
        4     F    F     F
        """);

        /* ===============================
         * CAS 2
         * Al menys un de vosaltres, la Clara, el Marc o tu, és major d’edat
         * A = Clara és major d’edat
         * B = Marc és major d’edat
         * C = Tu ets major d’edat
         * A || B || C
         * ===============================
         */

        
        System.out.println("CAS 2");
        
        System.out.println("""
        Num   A    B    C   A || B || C
        1     T    T    T      T
        2     T    T    F      T
        3     T    F    T      T
        4     T    F    F      T
        5     F    T    T      T
        6     F    T    F      T
        7     F    F    T      T
        8     F    F    F      F
        """);

        /* ===============================
         * CAS 3
         * la Clara és major d’edat, i tu ets més gran que el Marc però no més gran que la Clara
         * A = edatClara >= 18
         * B = edatMeva > edatMarc
         * C = edatMeva > edatClara
         * A && B && !C
         * ===============================
         */

        System.out.println("CAS 3");
        
        System.out.println("""
        Num   A    B    C   !C   A && B && !C
        1     T    T    T    F        F
        2     T    T    F    T        T
        3     T    F    T    F        F
        4     T    F    F    T        F
        5     F    T    T    F        F
        6     F    T    F    T        F
        7     F    F    T    F        F
        8     F    F    F    T        F
        """);  
        
    }
}    
