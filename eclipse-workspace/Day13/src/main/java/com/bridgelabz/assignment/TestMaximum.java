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

//    // implementing method to get maximum of three integer numbers
//    public static int getThreeIntegerNumbers(Integer[] num) {
//        int max = 0;
//        for (int i=0; i<3; i++) {
//            if(max <= num[i]) {
//                max = num[i];
//            }
//        }
//        log.info("maximun number of given three integer numbers = " +max);
//        return max;
//    }
//
//    // implementing method to get maximum of three float numbers
//    public void getThreeFloatNumbers(Float[] floats) {
//        float max = 0;
//        for (int i=1; i<3; i++) {
//            if(max <= floats[i]) {
//                max = floats[i];
//            }
//        }
//        log.info("maximun number of given three float numbers = " + max);
//    }

    // implementing method to get string of maximum length
    public <E> void getAllItems(E[] item) {
        int l = 0;
        E max = item[0];
        max.compaeTo(item);
//        for (int i=0; i<3; i++) {
//            if(max <= item[i]) {
//                max = item[i].length();
//                l = i;
//            }
//        }
        log.info("maximun string of given three strings = " + string[l]);
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        log.info("Welcome to generics !");

        TestMaximum generics = new TestMaximum();
        Integer[] a = {5, 3, 4 };
        Float[] f = {1.2f, 1.9f, 1.3f};
        String[] s = {"Apple", "Peach", "Banana"};

        generics.getAllItems(a);
        generics.getAllItems(f);
        generics.getAllItems(s);
    }
}
