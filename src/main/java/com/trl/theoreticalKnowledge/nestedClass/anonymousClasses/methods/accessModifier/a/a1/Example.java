package com.trl.theoreticalKnowledge.nestedClass.anonymousClasses.methods.accessModifier.a.a1;

public class Example {
    public static void main(String[] args) {

        SomeClass anonymousClass = new SomeClass() {

            @Override
            public void someMethod_1() {
                System.out.println("AC1");
            }

            @Override
            protected void someMethod_2() {
                System.out.println("AC1");
            }

            @Override
            void someMethod_3() {
                System.out.println("AC1");
            }

//            @Override                                                                         // Compilation ERROR !!!
//            private void someMethod_4() {
//                System.out.println("AC1");
//            }
        };

        anonymousClass.someMethod_1();
        anonymousClass.someMethod_2();
        anonymousClass.someMethod_3();
    }
}

class SomeClass {
    public void someMethod_1() {
        System.out.println("PM1");
    }

    protected void someMethod_2() {
        System.out.println("PM2");
    }

    void someMethod_3() {
        System.out.println("PM3");
    }

    private void someMethod_4() {
        System.out.println("PM4");
    }
}