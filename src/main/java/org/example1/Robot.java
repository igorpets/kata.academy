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
}
