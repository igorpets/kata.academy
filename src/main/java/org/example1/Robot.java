package org.example1;

public class Robot {
    Head head;
    Body body;

    Robot(Body body, Head head) {
        this.body = body;
        this.head = head;
    }

    public Head getHead() {
        return head;
    }

    public Body getBody() {
        return body;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Robot robot = (Robot) o;

        if (head != null ? !head.equals(robot.head) : robot.head != null) return false;
        return body != null ? body.equals(robot.body) : robot.body == null;
    }

    @Override
    public int hashCode() {
        int result = head != null ? head.hashCode() : 0;
        result = 31 * result + (body != null ? body.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Robot{" + head + body + '}';
    }
}
