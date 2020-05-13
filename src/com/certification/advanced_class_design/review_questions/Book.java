package com.certification.advanced_class_design.review_questions;

/* Question 10
* */
public class Book {
    private int pageNumber;

    private class BookReader {
        public int getPage() {
            return pageNumber;
        }
    }
}