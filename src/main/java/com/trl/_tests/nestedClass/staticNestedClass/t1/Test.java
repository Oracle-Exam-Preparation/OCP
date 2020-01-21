package com.trl._tests.nestedClass.staticNestedClass.t1;

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

public class Browsers {
  static class Browser {
    public void go() {
      System.out.println("Inside Browser");
    }
  }
  static class Firefox extends Browser {
    public void go() {
      System.out.println("Inside Firefox");
    }
  }
  static class IE extends Browser {
    @Override public void go() {
      System.out.println("Inside IE");
    }
  }
  public static void main(String[] args) {
    Browser b = new Firefox();
    IE e = (IE) b;
    e.go();
  }
}

A. Inside Browser
B. Inside Firefox
C. Inside IE
D. The code does not compile.
E. A runtime exception is thrown.

E. The main method tries to cast a Firefox instance to IE. Since IE is not a subclass of Firefox, this throws a ClassCastException.
*/

class Browsers {
    static class Browser {
        public void go() {
            System.out.println("Inside Browser");
        }
    }
    static class Firefox extends Browser {
        public void go() {
            System.out.println("Inside Firefox");
        }
    }
    static class IE extends Browser {
        @Override public void go() {
            System.out.println("Inside IE");
        }
    }
    public static void main(String[] args) {
        Browser b = new Firefox();
        IE e = (IE) b;
        e.go();
    }
}