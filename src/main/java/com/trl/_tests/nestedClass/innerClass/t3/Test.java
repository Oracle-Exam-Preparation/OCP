package com.trl._tests.nestedClass.innerClass.t3;

public class Test {
}

/*
Which of the following can be inserted in main?

public class Outer {
  class Inner { }

  public static void main(String[] args) {
    // INSERT CODE HERE
} }

A. Inner in = new Inner();
B. Inner in = Outer.new Inner();
C. Outer.Inner in = new Outer.Inner();
D. Outer.Inner in = new Outer().Inner();
E. Outer.Inner in = new Outer().new Inner();
F. Outer.Inner in = Outer.new Inner();

In this case this answer is wrong.
        E. This is a member inner class. It needs to be created using an instance of the outer class. The syntax looks
        weird, but it creates an object of the outer class and then an object of the inner class from it.

Correct answer is: A and E. This example have problems with "static" but not initialization.
Example: src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/initialization/c/c1/Example.java
*/

/*
Which of the following can be inserted in main?

public class Outer {
  class Inner { }
}

class Main {
  public static void main(String[] args) {
    // INSERT CODE HERE
}}

A. Inner in = new Inner();
B. Inner in = Outer.new Inner();
C. Outer.Inner in = new Outer.Inner();
D. Outer.Inner in = new Outer().Inner();
E. Outer.Inner in = new Outer().new Inner();
F. Outer.Inner in = Outer.new Inner();

In this case this answer is correct.
E. This is a member inner class. It needs to be created using an instance of the outer class. The syntax looks weird,
but it creates an object of the outer class and then an object of the inner class from it.
*/