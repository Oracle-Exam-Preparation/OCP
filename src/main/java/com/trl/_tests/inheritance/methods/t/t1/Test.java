package com.trl._tests.inheritance.methods.t.t1;

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

1: public interface CanClimb {
2:   public abstract void climb();
3: }
4: public interface CanClimbTrees extends CanClimb {}
5: public abstract class Chipmunk implements CanClimbTrees {
6:   public abstract void chew();
7: }
8: public class EasternChipmunk extends Chipmunk {
9:   public void chew() { System.out.println("Eastern Chipmunk is Chewing"); }
10: }

A. It compiles and runs without issue.
B. The code will not compile because of line 2.
C. The code will not compile because of line 4.
D. The code will not compile because of line 5.
E. The code will not compile because of line 8.
F. It compiles but throws an exception at runtime

E. The code does not compile because EasternChipmunk inherits the abstract method climb() but does not implement it,
therefore the correct answer is E. B, C, and D are incorrect as they compile for various reasons. Line 2 compiles,
as non-static and no-ndefault interface methods are assumed to have the abstract modifier. Line 4 compiles without issue
as an interface can extend another interface. Line 5 compiles without issue as an abstract class can implement an
interface without implementing any of the abstract methods. F is incorrect, as Line 8 does not compile.
*/