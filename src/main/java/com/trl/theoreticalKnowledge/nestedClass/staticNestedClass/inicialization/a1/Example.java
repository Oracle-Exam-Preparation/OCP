package com.trl.theoreticalKnowledge.nestedClass.staticNestedClass.inicialization.a1;

public class Example {
    public static void main(String[] args) {
        SNC snc_0 = new SNC();
        SNC.SNC_1 snc_1 = new SNC.SNC_1();
        SNC.SNC_1.SNC_2 snc_2 = new SNC.SNC_1.SNC_2();
        SNC.SNC_1.SNC_2.SNC_3 snc_3 = new SNC.SNC_1.SNC_2.SNC_3();
        SNC.SNC_1.SNC_2.SNC_3.SNC_4 snc_4 = new SNC.SNC_1.SNC_2.SNC_3.SNC_4();
        SNC.SNC_1.SNC_2.SNC_3.SNC_4.SNC_5 snc_5 = new SNC.SNC_1.SNC_2.SNC_3.SNC_4.SNC_5();
        SNC.SNC_1.SNC_2.SNC_3.SNC_4.SNC_5.SNC_6 snc_6 = new SNC.SNC_1.SNC_2.SNC_3.SNC_4.SNC_5.SNC_6();
        SNC.SNC_1.SNC_2.SNC_3.SNC_4.SNC_5.SNC_6.SNC_7 snc_7 = new SNC.SNC_1.SNC_2.SNC_3.SNC_4.SNC_5.SNC_6.SNC_7();
    }
}

class SNC {

    static class SNC_1 {

        static class SNC_2 {

            static class SNC_3 {

                static class SNC_4 {

                    static class SNC_5 {

                        static class SNC_6 {

                            static class SNC_7 {

                                // ...
                            }
                        }
                    }
                }
            }
        }
    }
}
