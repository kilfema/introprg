/*
*Exercici per treballar amb els operadors lògics
*/

public class operadorsLogics{
    public static void main(String[] args) {
    
    //la Clara és més jove que tu
    
    int edatClara = 18;
    int edatMeva = 22;
    
    boolean claraMesJove = edatClara < edatMeva;
    
    //la Clara i el Marc són més joves que tu

    int edatMarc = 20;
    
    boolean claraMarcMesJoves = edatClara < edatMeva && edatMarc < edatMeva;
    
    //la Clara és més jove que tu i tu ets més jove que el Marc
    
    boolean claraJoMesJovesQueMarc = (edatClara < edatMeva) && (edatMarc > edatMeva);
    
    //la Clara no és més jove que el Marc
    
    boolean claraNoMesJove = !(edatClara > edatMarc);
    
    //no és cert que el Marc sigui més jove que la Clara
    
    boolean marcNoMesJove = !(edatMarc < edatClara);
    
    //Ni el Marc és més jove que la Clara ni tu ets més jove que el Marc
    
    boolean ninguMesJoveQueMarc = !(edatMarc < edatClara) && !(edatMeva < edatMarc);
    
    //Tu ets més gran que la Clara i el Marc junts o bé la Clara i el Marc tenen la mateixa edat
    
    boolean joMesGran = edatMeva > edatClara + edatMarc || edatClara == edatMarc;
    
    }
}    
