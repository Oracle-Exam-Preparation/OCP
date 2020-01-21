package com.trl._tests._instanceOf.t2;

import java.util.ArrayList;
import java.util.LinkedList;

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
Which is a true statement about the following code? (Choose all that apply.)

import java.util. *;
public class IsItFurry {
  static class Chipmunk { }
  public static void main(String[] args) {
    Chipmunk c = new Chipmunk();
    ArrayList <Chipmunk> l = new ArrayList<>();
    Runnable r = new Thread();
    int result = 0;
    if (c instanceof Chipmunk) result += 1;
    if (l instanceof Chipmunk) result += 2;
    if (r instanceof Chipmunk) result += 4;
    System.out.println(result);
} }

A. The code compiles, and the output is 0.
B. The code compiles, and the output is 3.
C. The code compiles, and the output is 7.
D. c instanceof Chipmunk does not compile.
E. l instanceof Chipmunk does not compile.
F. r instanceof Chipmunk does not compile.

E. Code involving instanceof does not compile when there is no way for it to evaluate true. D not only compiles but it
is always true. E does not compile because ArrayList is a concrete class that does not extend Chipmunk. F does compile
because Runnable is an interface. In theory, someone could subclass Chipmunk and have the subclass implement Runnable.
*/

class IsItFurry {
    static class Chipmunk { }
    public static void main(String[] args) {
        Chipmunk c = new Chipmunk();
        ArrayList<Chipmunk> l_1 = new ArrayList<>();
        ArrayList l_2 = new ArrayList<>();
        LinkedList l_3 = new LinkedList();
        Runnable r = new Thread();
        int result = 0;
        if (c instanceof Chipmunk) result += 1;
//        if (l_1 instanceof Chipmunk) result += 2;                                             // Compilation ERROR !!!
//        if (l_2 instanceof Chipmunk) result += 2;                                             // Compilation ERROR !!!
//        if (l_3 instanceof Chipmunk) result += 2;                                             // Compilation ERROR !!!
        if (r instanceof Chipmunk) result += 4;
        System.out.println(result);
    }
}