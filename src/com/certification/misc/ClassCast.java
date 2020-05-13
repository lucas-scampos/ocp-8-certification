package com.certification.misc;

/* An object is automatically upcasted to its super class type. You need not to mention class type explicitly.
 But, when an object is supposed to be downcasted to its sub class type, then you have to mention class type explicitly.
 In such case, there is a possibility of occurring class cast exception.
 In most of time, it occurs when you are trying to downcast an object explicitly to its sub class type.
*
*
*
* */
class A {
    int i = 10;
}

class B extends A {
    int j = 20;
}

class C extends B {
    int k = 30;
}

public class ClassCast {

    public static void main(String[] args) {
        A a = new B();   //B type is auto up casted to A type
        B b = (B) a;     //A type is explicitly down casted to B type.
        C c = (C) b;    //Here, you will get class cast exception
        System.out.println(c.k);
    }
}
