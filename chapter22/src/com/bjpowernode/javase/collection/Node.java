package com.bjpowernode.javase.collection;

public class Node {
    Node node;
    Object obj;

    public Node() {
    }

    public Node(Node next, Object obj) {
        this.node = next;
        this.obj = obj;
    }
}
