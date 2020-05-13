package com.certification.advanced_class_design.review_questions;

/* Question 16
* */
public class Outer2 {

    class Inner {
        public Inner(){
            System.out.println("Inside");
        }
    }

    public static void main(String[] args) {
        Inner inner = new Outer2().new Inner();
        Outer2.Inner outerInner = new Outer2().new Inner();
    }
}
