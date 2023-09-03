package org.example1;

public class MediumHead extends Head {
    MediumHead() {
        type = HeadTypes.MEDIUM;
    }

    void repair() {
        System.out.println(this + " repair!");
    }

    @Override
    public String toString() {
        return "MediumHead_N" + number;
    }
}
