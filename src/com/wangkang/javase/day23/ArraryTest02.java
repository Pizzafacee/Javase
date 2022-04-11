package com.wangkang.javase.day23;

public class ArraryTest02 {
    private Object[] elements;
    Animal animal;


    public ArraryTest02() {
        elements = new Object[4];
        elements[2] = new Animal();
        elements[3] = new Object();
        elements[1] = 2;
        elements[0] = "ssss";
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public static void main(String[] args) {
        ArraryTest02 at = new ArraryTest02();

        for (int i = 0; i < at.elements.length; i++) {
            System.out.println(at.elements[i]);

        }


    }
}

class Animal {

}

