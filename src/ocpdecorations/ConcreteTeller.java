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
public class ConcreteTeller extends Teller {

    @Override
    public String say(int i) {
        if (activated) return "";
        return ""+i;
    }
    
}
