/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorationsoflambdasandgenerics;

/**
 *A function where if you use it on the input in succession you will 
 * revert back to your original input
 * @author montr
 */
public class Involutence implements FancyMath {

    @Override
    public Integer involutence(Integer x) {
        return -1*(x);
    }

   
    
    
}
