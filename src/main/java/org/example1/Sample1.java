package org.example1;

import org.example2.Sample2;
import org.example3.Sample3;

/**
 * @author Rajesh Dwivedi
 * Date: 6/22/20
 */
public class Sample1 {
    public static void main(String[] args) {
        final Sample2 sample2 = new Sample2();
        final Sample3 sample3 = new Sample3();
        sample2.sayHello();
        sample3.sayHello();
    }
}
