package com.trl._tests.designPrinciplesAndDesignPatterns.designPatterns.singleton.t1;

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
What are some of the properties of using the singleton pattern? (Choose all that apply.)

A. Singleton object can be replaced with encapsulated setter method.
B. Requires constructor of singleton class to be private.
C. Singleton object must be named instance.
D. Singleton object may be private or protected.
E. Ensures that there is only one instance of an object in memory.
F. Requires a public static method to retrieve the instance of the singleton.

B, E, F.
A is incorrect, as any method that changes the singleton breaks the singleton pattern.
B is correct, as the constructor of the singleton class must be private, else other classes would be able to instantiate
it, breaking the singleton pattern.
C is incorrect, as the name of the object itself, as well as the method to retrieve the singleton, is not defined in the pattern.
D is incorrect, as the object must be marked private. If it was marked protected, it would not be properly encapsulated
and other classes would have access to it.
E is correct, as the purpose of a singleton is to ensure that all threads share the same instance of the object in memory.
F is correct, as a public static method is required for all threads to access the same singleton.
*/