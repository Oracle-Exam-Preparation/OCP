package com.trl._tests._interface.t1;

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
Which of the following are true of interfaces? (Choose all that apply.)

A. They can extend other classes.
B. They cannot be extended.
C. They enable classes to have multiple inheritance.
D. They can only contain abstract methods.
E. They can be declared final.
F. All members of an interface are public.

C, F.
A and B are both incorrect as interfaces can extend other interfaces, although not classes.
C is correct since a class may implement multiple interfaces.
D is incorrect as interfaces have static and default methods, as well as static final variables.
E is incorrect as interfaces are assumed to be abstract, and abstract and final can never be used together.
F is correct as interface methods and variables are each assumed public.
*/