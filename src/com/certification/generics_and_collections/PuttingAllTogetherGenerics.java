package com.certification.generics_and_collections;

import java.util.ArrayList;
import java.util.List;

class A {
}

class B extends A {
}

class C extends B {
}

public class PuttingAllTogetherGenerics {

    public static void main(String[] args) {
        List<?> list1 = new ArrayList<A>();
        List<? extends A> list2 = new ArrayList<A>(); // Could be A,B,C
        List<? extends B> list3 = new ArrayList<C>(); //could B / could not be A
        List<? super A> list4 = new ArrayList<A>(); // The lowest type you can have is A, thats why can not be B or C
//        List<? extends B> list5 = new ArrayList<A>(); Does not compile, needs to extend B, (C or B)
        List<? super B> list6 = new ArrayList<A>();
//        List<?> list7 = new ArrayList<? extends A>() Needs to know which type will be instantiated

    }

    void test() {
        String one = method1(new ArrayList<>()); // T = String
    }

    <T> T method1(List<? extends T> list) {
        return list.get(0);
    }

//   <T> <? extends T> method2(List<? extends T> list) {
//        // DOES NOT COMPILE return list.get(0); needs to know which type to instantiate, <? extends T> is not a type
//    }

//    <B extends A> B method3(List<B> list) {
//        return new B(); // DOES NOT COMPILE - the type parameter B conflicts with class name B
//    }

    void method4(List<? super B> list) { // COmpiles fine
    }

//    <X> void method5(List<X super B> list) { <X super B> does not compile, cant mix type params with upper/lower bounds
//        // DOES NOT COMPILE }
//    }
}



