package explorationsoflambdasandgenerics;


import explorationsoflambdasandgenerics.Utils;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Paul
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Utils.modifyIntegerXTimesTester();
        
        //Utils.testInvolutence();

       ArrayList<Integer>  hello;

      
       // System.out.println(indexOutput);
        Integer y = Utils.modifyIntegerXTimes((Integer x) -> x+2, 0, 4);
        hello=Utils.repeat(y, 8);
        System.out.println(Utils.indexedOutput(hello));
        System.out.println("answer: "+y);
        System.out.println(Utils.repeat(y, 14));
        
        
        //Integer z = Utils.checkInvolutence(new Involutence(),;
    }
    //Estimated time: 3 hours, actual time: 4 hours

}
