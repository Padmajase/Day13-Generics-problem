/**
 * author : padmaja eknarayan
 */
package com.bridgelabz.assignment;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Adding class for finding maximum of three
 */
public class TestMaximum {
    static Logger log = Logger.getLogger(TestMaximum.class);

    // implementing method to get maximum of three integer numbers
    public static int getThreeIntegerNumbers(Integer[] num) {
        int max = 0;
        for (int i=0; i<3; i++) {
            if(max <= num[i]) {
                max = num[i];
            }
        }
        log.info("maximun number of given three numbers = " +max);
        return max;
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        log.info("Welcome to generics !");

        TestMaximum generics = new TestMaximum();
        Integer[] a = {5, 3, 4 };
        generics.getThreeIntegerNumbers(a);
    }
}
