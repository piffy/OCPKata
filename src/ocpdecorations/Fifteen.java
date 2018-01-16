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
public class Fifteen extends Checker {

    Teller t;

    public Fifteen(Teller t) {
        this.t = t;
    }
    
    

    @Override
    public String say(int i) {
        if (i%15==0)
           {
            t.activated=true;
            return "FizzBuzz";
           }
                    else   
        return t.say(i);
        }

   
       
}
