package com.trl.theoreticalKnowledge.nestedClass.innerClass.inicialization.a.a1;

public class Example {

    {
        Example nc_0 = new Example();
        Example.NC_1 nc_1 = new Example.NC_1();
        Example.NC_1.NC_2 nc_2 = nc_1.new NC_2();
        Example.NC_1.NC_2.NC_3 nc_3 = nc_2.new NC_3();
        Example.NC_1.NC_2.NC_3.NC_4 nc_4 = nc_3.new NC_4();
        Example.NC_1.NC_2.NC_3.NC_4.NC_5 nc_5 = nc_4.new NC_5();
        Example.NC_1.NC_2.NC_3.NC_4.NC_5.NC_6 nc_6 = nc_5.new NC_6();
        Example.NC_1.NC_2.NC_3.NC_4.NC_5.NC_6.NC_7 nc_7 = nc_6.new NC_7();

        Example nc_10 = new Example();
        Example.NC_1 nc_11 = new Example().new NC_1();
        Example.NC_1.NC_2 nc_12 = new Example().new NC_1().new NC_2();
        Example.NC_1.NC_2.NC_3 nc_13 = new Example().new NC_1().new NC_2().new NC_3();
        Example.NC_1.NC_2.NC_3.NC_4 nc_14 = new Example().new NC_1().new NC_2().new NC_3().new NC_4();
        Example.NC_1.NC_2.NC_3.NC_4.NC_5 nc_15 = new Example().new NC_1().new NC_2().new NC_3().new NC_4().new NC_5();
        Example.NC_1.NC_2.NC_3.NC_4.NC_5.NC_6 nc_16 = new Example().new NC_1().new NC_2().new NC_3().new NC_4().new NC_5().new NC_6();
        Example.NC_1.NC_2.NC_3.NC_4.NC_5.NC_6.NC_7 nc_17 = new Example().new NC_1().new NC_2().new NC_3().new NC_4().new NC_5().new NC_6().new NC_7();
    }

    class NC_1 {

        class NC_2 {

            class NC_3 {

                class NC_4 {

                    class NC_5 {

                        class NC_6 {

                            class NC_7 {

                                // ...
                            }
                        }
                    }
                }
            }
        }
    }
}
