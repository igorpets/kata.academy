package org.example1;

public class BigHead extends Head {

    BigHead() {
        type = HeadTypes.BIG;
    }

    void attack() {
        System.out.println(this + " attack!");
    }

    @Override
    public String toString() {
        return "BigHead_N" + number;
    }
}
