package com.trl._tests._enum.t1;

/**
 * This test is taken from the book:         OCP: Oracle ®
 *                                       Certified Professional
 *                                      Java® SE 8 Programmer II
 *                                 by Scott Selikoff, Jeanne Boyarsky
 *                                       Released December 2015
 *                                        Publisher(s): Wiley
 *                                        ISBN: 9781119067900
 *
 * @link https://www.oreilly.com/library/view/ocp-oracle-certified/9781119067900/
 */
public class Test {
}

/*
What is the result of the following code?

public class FlavorsEnum {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY
    }
    public static void main(String[] args) {
        System.out.println(Flavors.CHOCOLATE.ordinal());
    }
}

A. 0
B. 1
C. 9
D. CHOCOLATE
E. The code does not compile due to a missing semicolon.
F. The code does not compile for a different reason.

B. The ordinal() method of an enum returns its corresponding int value. Like arrays, enums are zero based. Remember that
the index of an enum may change when you recompile the code and should not be used for comparison.
*/