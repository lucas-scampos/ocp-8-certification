package com.certification.advanced_class_design;

public class LocalInnerClass {
}

class OuterLocalInner {
    private int length = 5;

    public void calculate() {
        final int width = 20;
        class Inner {
            public void multiply() {
                System.out.println(length * width);
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        OuterLocalInner outer = new OuterLocalInner();
        outer.calculate();
    }
}