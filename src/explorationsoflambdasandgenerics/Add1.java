 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorationsoflambdasandgenerics;

/**
 *Adds 1 to an integer
 * @author montr
 */
public class Add1 implements IntegerModifier  {

/**
 * Adds one
 * @param x an integer
 * @return the integer plus 1
 */
    @Override
    public Integer modify(Integer x) {
       return x+1;
    }
    
}
