package com.trl._tests.equals_hashCode.t1;

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

public class Employee {

    public int employeeId;
    public String firstName, lastName;
    public int yearStarted;

    @Override public int hashCode() {
        return employeeId;
    }

    public boolean equals(Employee e) {
        return this.employeeId == e.employeeId;
    }

    public static void main(String[] args) {
        Employee one = new Employee();
        one.employeeId = 101;
        Employee two = new Employee();
        two.employeeId = 101;
        if (one.equals(two)) System.out.println("Success");
        else System.out.println("Failure");
    }
}

A. Success
B. Failure
C. The hashCode() method fails to compile.
D. The equals() method fails to compile.
E. Another line of code fails to compile.
F. A runtime exception is thrown.

A. Based on the equals() method in the code, objects are equal if they have the same employeeId. The hashCode() method
correctly overrides the one from Object. The equals() method is an overload of the one from Object and not an override.
It would be better to pass Object since an override would be better to use here. It is odd to override hashCode() and
not equals().
*/