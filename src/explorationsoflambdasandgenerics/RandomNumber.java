/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorationsoflambdasandgenerics;

import java.util.Random;

/**
 *Generates a random number range to return
 * @author montr
 */
public class RandomNumber implements FancyMath {

    @Override
    public Integer involutence(Integer x) {
          Random r = new Random();
          return r.nextInt(x);
    }

   
}
