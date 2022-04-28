/**
 * author : padmaja eknarayan
 */
package com.bridgelabz.assignment;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

/**
 * Adding class for finding maximum of three
 */
class Generic {

    static Logger log = Logger.getLogger(Generic.class);

    // implementing method to get maximum of three integer numbers
    public static <E> int testMaximum(int... num) {
        int max = 0;
        for ( int x : num) {
            if(max <= x) {
                max = x;
            }
        }
        log.info("maximum number of given " + num.length+ " integer numbers = " +max);
        return max;
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        log.info("Welcome to generics !");

        Scanner sc = new Scanner(System.in);
        Generic.testMaximum(2, 4, 55);
        }
}
