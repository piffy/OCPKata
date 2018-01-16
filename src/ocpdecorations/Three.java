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
public class Three extends Checker {

    Teller t;

    public Three(Teller t) {
        this.t = t;
    }
    
    

    @Override
    public String say(int i) {
        if (i%3==0)
           {
            t.activated=true;
            return "Fizz"+t.say(i);
           }
                    else   
        return t.say(i);
        }

   
       
}
