package com.trl._tests._imports._static.t1;

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
Which of the following statements can be inserted to make FootballGame compile?

package my.sports;
public class Football {
  public static final int TEAM_SIZE = 11;
}

package my.apps;
// INSERT CODE HERE
public class FootballGame {
  public int getTeamSize() { return TEAM_SIZE; }
}

A. import my.sports.Football;
B. import static my.sports.*;
C. import static my.sports.Football;
D. import static my.sports.Football.*;
E. static import my.sports.*;
F. static import my.sports.Football;
G. static import my.sports.Football.*;

D. FootballGame is trying to refer to a static variable in another class. It needs a static import to do so. The correct
syntax is import static and not static import. B is incorrect because * does not import classes in a package. C is
incorrect because it does not refer to a static member.
*/