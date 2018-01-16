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
public class Five extends Checker {
    
    Teller t;

    public Five(Teller t) {
        this.t = t;
    }

    @Override
    public String say(int i) {
        if (i%5==0)
            return "Buzz";
                    else
        return t.say(i);
        }
    
    
    
}
