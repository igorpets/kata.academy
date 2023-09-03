package org.example1;

public class Robot<HeadT extends Head, BodyT extends Body> {
    static private int number_index=0;
    private int number;
    HeadT head;
    BodyT body;

    Robot(HeadT head, BodyT body) {
        this.head = head;
        this.body = body;
        number = ++number_index;
    }

    @Override
    public String toString() {
        return "Robot{" + head + body + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Robot<?, ?> robot = (Robot<?, ?>) o;

        if (!head.equals(robot.head)) return false;
        return body.equals(robot.body);
    }

    @Override
    public int hashCode() {
        int result = head.hashCode();
        result = 31 * result + body.hashCode();
        return result;
    }

    public HeadT getHead() {
        return head;
    }

    public void setHead(HeadT head) {
        this.head = head;
    }

    public BodyT getBody() {
        return body;
    }

    public void setBody(BodyT body) {
        this.body = body;
    }
}
