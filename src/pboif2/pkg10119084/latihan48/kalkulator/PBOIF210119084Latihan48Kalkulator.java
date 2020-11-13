/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan48.kalkulator;

/**
 *
 * @author MERDEFI
 */
public class PBOIF210119084Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        kalkulator.setValue1(7);
        kalkulator.setValue2(5);
        
        double val1 = kalkulator.getValue1();
        double val2 = kalkulator.getValue2();
        
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you how to manage method in java");
        
        System.out.println("Result Add is = " + kalkulator.add(val1, val2));
        System.out.println("Result Minus is = " + kalkulator.minus(val1, val2));
        System.out.println("Result Multiple is = " + kalkulator.multiplication(val1, val2));
        System.out.println("Result Division is = " + kalkulator.division(val1, val2));
    }
    
}
