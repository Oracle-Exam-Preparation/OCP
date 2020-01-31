package com.trl._tests.inheritance.t1;

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
Choose the correct statement about the following code:

1: public interface CanFly {
2:    void fly();
3: }

4: interface HasWings {
5:    public abstract Object getWingSpan();
6: }

7: abstract class Falcon implements CanFly, HasWings {
8: }

A. It compiles without issue.
B. The code will not compile because of line 2.
C. The code will not compile because of line 4.
D. The code will not compile because of line 5.
E. The code will not compile because of lines 2 and 5.
F. The code will not compile because the class Falcon doesn’t implement the interface methods.

A. Although the definition of methods on lines 2 and 5 vary, both will be converted to public abstract by the compiler.
Line 4 is fine, because an interface can have public access. Finally, the class Falcon doesn’t need to implement the
interface methods because it is marked as abstract. Therefore, the code will compile without issue.
*/