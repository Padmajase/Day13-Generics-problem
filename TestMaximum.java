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
    public static <E extends Comparable<E>> E testMaximum(E... num) {
        E max = num[0];
        for (E n : num) {
            System.out.println(n.compareTo(max));
            if (n.compareTo(max) > 0) {
                max = n;
            }
        }
        log.info("maximum number of " + num.length +" integers is : " +max);
        return max;
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        log.info("Welcome to generics !");

        String[] a = {"padmaja", "sunil", "eknarayan"};

        Generic.testMaximum(a);
        Generic.testMaximum(2, 4, 1);
        }
}
