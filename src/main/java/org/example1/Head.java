package org.example1;

public class Head {
    protected HeadTypes type;
    protected int number;
    private static int number_index=0;

    public Head() {
        number = ++number_index;
    }

    @Override
    public String toString() {
        return "Head[" + type+"."+number +"]";
    }
}
