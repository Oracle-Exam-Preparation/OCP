package com.trl._tests.equals_hashCode.t4;

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
What is true about the following code? You may assume city and mascot are never null.

public class BaseballTeam {

    private String city, mascot;
    private int numberOfPlayers;

    public boolean equals(Object obj) {
        if ( !(obj instanceof BaseballTeam))
        return false;
        BaseballTeam other = (BaseballTeam) obj;
        return (city.equals(other.city) && mascot.equals(other.mascot));
    }

    public int hashCode() {
        return numberOfPlayers;
    }

    // imagine getters and setters are here
}

A. The class does not compile.
B. The class compiles but has an improper equals() method.
C. The class compiles but has an improper hashCode() method.
D. The class compiles and has proper equals() and hashCode() methods.

C. The equals() method is correct. You are allowed to use any business logic that you want in determining equality.
The hashCode() method is not correct. It violates the rule that two objects that return true for equals() must return
the same hashCode(). It is also a bad idea for the hash code to contain values that could change.
*/
