package com.trl._tests.nestedClass.innerClass.t2;

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
The following code appears in a file named Book.java. What is the result of compiling the source file?

1: public class Book {
2:   private int pageNumber;
3:   private class BookReader {
4:     public int getPage() {
5:       return pageNumber;
6: } } }

A. The code compiles successfully, and one bytecode file is generated: Book.class.
B. The code compiles successfully, and two bytecode files are generated: Book.class and BookReader.class.
C. The code compiles successfully, and two bytecode files are generated: Book.class and Book$BookReader.class.
D. A compiler error occurs on line 3.
E. A compiler error occurs on line 5.
*/