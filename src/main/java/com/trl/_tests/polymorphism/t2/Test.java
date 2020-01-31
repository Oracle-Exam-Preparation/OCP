package com.trl._tests.polymorphism.t2;

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
Which of the following statements about polymorphism are true? (Choose all that apply.)

A. A reference to an object may be cast to a subclass of the object without an explicit cast.
B. If a method takes a class that is the superclass of three different object references, then any of those objects may
   be passed as a parameter to the method.
C. A reference to an object may be cast to a superclass of the object without an explicit cast.
D. All cast exceptions can be detected at compile time.
E. By defining a public instance method in the superclass, you guarantee that the specific method will be called in the
   parent class at runtime.

B, C.
A reference to an object requires an explicit cast if referenced with a subclass, so A is incorrect. If the cast is to a
superclass reference, then an explicit cast is not required, so C is correct. If a method takes the superclass of an
object as a parameter, then any subclass references may be used without a cast, so B is correct. Some cast exceptions
can be detected as errors at compile-time, but others can only be detected at runtime, so D is incorrect. Due to the nature
of polymorphism, a public instance method can be overridden in a subclass and calls to it will be replaced even in the
superclass in which it was defined, so E is incorrect.
*/