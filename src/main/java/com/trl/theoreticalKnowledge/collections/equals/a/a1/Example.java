package com.trl.theoreticalKnowledge.collections.equals.a.a1;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<PointWithoutEquals> list = new ArrayList<>();
        list.add(new PointWithoutEquals(1, 1));
        System.out.println(list.contains(new PointWithoutEquals(1, 1)));                                // false

        PointWithoutEquals point = new PointWithoutEquals(1, 1);
        List<PointWithoutEquals> list_2 = new ArrayList<>();
        list_2.add(point);
        System.out.println(list_2.contains(point));                                                              // true

        List<PointWithEquals> list_3 = new ArrayList<>();
        list_3.add(new PointWithEquals(1, 1));
        System.out.println(list_3.contains(new PointWithEquals(1, 1)));                                  // true

        PointWithEquals pointA = new PointWithEquals(1, 1);
        List<PointWithEquals> list_4 = new ArrayList<>();
        list_4.add(pointA);
        System.out.println(list_4.contains(pointA));                                                             // true
    }
}

class PointWithoutEquals {

    private int x;
    private int y;

    public PointWithoutEquals(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class PointWithEquals {

    private int x;
    private int y;

    public PointWithEquals(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointWithEquals point_2 = (PointWithEquals) o;
        return x == point_2.x &&
                y == point_2.y;
    }
}