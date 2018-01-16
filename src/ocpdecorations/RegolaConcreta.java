/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocpdecorations;

/**
 *
 * @author piffy
 */
public class RegolaConcreta extends Checker {
    int divisore;
    String parola;
    Teller t;

    public RegolaConcreta(Teller t,int divisore, String parola) {
        this.divisore = divisore;
        this.t = t;
        this.parola = parola;
    }
    
    

    @Override
    public String say(int i) {
        if (i%divisore==0)
           {
            return parola;
           }
                    else   
        return t.say(i);
        }

   
       
}
