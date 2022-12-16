/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.calcularpi;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author PC
 */
public class CalcPI {

     public static void main(String[] args) {
        MathContext mc = new MathContext(10);         
        //meter en el método compute
        BigDecimal pi = new BigDecimal(0);
        BigDecimal limit = new BigDecimal(1).movePointLeft(10);
        boolean stop = false;
        for (int k = 0; !stop; k++) {
            //meter en el método piFunction  
            int k8 = 8 * k;
            BigDecimal val1 = new BigDecimal(4);
            val1 = val1.divide(new BigDecimal(k8 + 1), mc);
            BigDecimal val2 = new BigDecimal(-2);
            val2 = val2.divide(new BigDecimal(k8 + 4), mc);
            BigDecimal val3 = new BigDecimal(-1);
            val3 = val3.divide(new BigDecimal(k8 + 5), mc);
            BigDecimal val4 = new BigDecimal(-1);
            val4 = val4.divide(new BigDecimal(k8 + 6), mc);
            BigDecimal val = val1;
            val = val.add(val2);
            val = val.add(val3);
            val = val.add(val4);
            BigDecimal multiplier = new BigDecimal(16);
            multiplier = multiplier.pow(k);
            BigDecimal one = new BigDecimal(1);
            multiplier = one.divide(multiplier, mc);
            val = val.multiply(multiplier);
            BigDecimal piK = val;
            //meter en el método piFunction                
            pi = pi.add(piK);
            if (piK.compareTo(limit) < 0) {
                stop = true;
            }
        }
        System.out.println(pi.round(mc));
        //meter en el método compute
    }
     
}