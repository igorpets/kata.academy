package org.example1;

public class SmallHead extends Head {
    SmallHead() {
        type = HeadTypes.SMALL;
    }

    void defence() {
        System.out.println(this + " defence!");
    }

    @Override
    public String toString() {
        return "SmallHead_N" + number;
    }
}
