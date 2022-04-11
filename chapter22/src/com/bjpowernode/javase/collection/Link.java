package com.bjpowernode.javase.collection;

public class Link {
    Node header;

    public void add(Object obj) {
        if (header == null) {
            header = new Node(null, obj);
        } else {
            Node currentLastNode = findLast(header);
            currentLastNode.node = new Node(null, obj);

        }


    }

    private Node findLast(Node node) {
        if (node.node == null) {
            return node;

        }
        return findLast(node.node);
    }
}
