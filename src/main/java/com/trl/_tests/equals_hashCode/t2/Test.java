package com.trl._tests.equals_hashCode.t2;

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
What is the result of compiling the following class?

public class Book {

    private int ISBN;
    private String title, author;
    private int pageCount;

    public int hashCode() {
        return ISBN;
    }

    @Override public boolean equals(Object obj) {
        if ( !(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return this.ISBN == other.ISBN;
    }
    // imagine getters and setters are here
}

A. The code compiles.
B. The code does not compile because hashCode() is incorrect.
C. The code does not compile because equals() does not override the parent method correctly.
D. The code does not compile because equals() tries to refer to a private field.
E. The code does not compile because the ClassCastException is not handled or declared.
F. The code does not compile for another reason.

A. hashCode() is correct and perfectly reasonable given that equals() also checks that field. ClassCastException is a
runtime exception and therefore does not need to be handled or declared. The override in equals() is correct. It is
common for equals() to refer to a private instance variable. This is legal because it is within the same class, even if
it is referring to a different object of the same class.
*/