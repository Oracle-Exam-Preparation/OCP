package com.trl.nestedClass.staticNestedClass.a.a1;

public class Example {

    {
        Example nc_0 = new Example();
        Example.NC_1 nc_1 = new Example.NC_1();
        Example.NC_1.NC_2 nc_2 = new Example.NC_1.NC_2();
        Example.NC_1.NC_2.NC_3 nc_3 = new Example.NC_1.NC_2.NC_3();
        Example.NC_1.NC_2.NC_3.NC_4 nc_4 = new Example.NC_1.NC_2.NC_3.NC_4();
        Example.NC_1.NC_2.NC_3.NC_4.NC_5 nc_5 = new Example.NC_1.NC_2.NC_3.NC_4.NC_5();
        Example.NC_1.NC_2.NC_3.NC_4.NC_5.NC_6 nc_6 = new Example.NC_1.NC_2.NC_3.NC_4.NC_5.NC_6();
        Example.NC_1.NC_2.NC_3.NC_4.NC_5.NC_6.NC_7 nc_7 = new Example.NC_1.NC_2.NC_3.NC_4.NC_5.NC_6.NC_7();
    }

    static class NC_1 {

        static class NC_2 {

            static class NC_3 {

                static class NC_4 {

                    static class NC_5 {

                        static class NC_6 {

                            static class NC_7 {

                                // ...
                            }
                        }
                    }
                }
            }
        }
    }
}
