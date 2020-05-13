package com.certification.advanced_class_design.review_questions;

/* Question 12
* */
public class Browsers {
    static class Browser {
        public void go() {
            System.out.println("Inside Browser");
        }
    }

    static class Firefox extends Browser {
        public void go() {
            System.out.println("Inside Firefox");
        }
    }

    static class IE extends Browser {
        @Override
        public void go() {
            System.out.println("Inside IE");
        }
    }

    public static void main(String[] args) {
        Browser b = new Firefox();
        Browser e = (IE) b; //Classcast exeception
        e.go();
    }
}