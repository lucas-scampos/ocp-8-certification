package com.certification.exceptions_and_assertions;

public class TurkeyCage implements AutoCloseable {
    public void close() {
        System.out.println("Close gate");
    }

    public static void main(String[] args) {
        try (TurkeyCage t = new TurkeyCage()) {
            System.out.println("put turkeys in");
        }
    }
}