package com.certification.exceptions_and_assertions.review_questions;

public class Q12 {

    static class SneezeException extends Exception {
    }

    static class SniffleException extends SneezeException {
    }

    public static void main(String[] args) throws SneezeException {
        try {
            throw new SneezeException();
        } catch (SneezeException e) {
            Exception x = new SneezeException();
            SniffleException g = (SniffleException) new SneezeException(); //class cast
            throw e;
        }
    }
}
