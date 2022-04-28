/**
 * author : padmaja eknarayan
 */
package com.bridgelabz.assignment;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Adding class for finding maximum of three
 */
class Generic<T extends Comparable <T>> {

    static Logger log = Logger.getLogger(Generic.class);

    // declaring parameter constructor
    Generic(T[] a) {
        log.info("parameterized constructor is called");
    }

    // implementing method to get maximum of three integer numbers
    public static int testMaximum(Integer[] num) {
        int max = 0;
        for (int i=0; i<3; i++) {
            if(max <= num[i]) {
                max = num[i];
            }
        }
        log.info("maximun number of given three integer numbers = " +max);
        return max;
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        log.info("Welcome to generics !");

        Integer[] a = {5, 3, 4 };
        Generic generics = new Generic(a);
        Generic.testMaximum(a);
        }
}
