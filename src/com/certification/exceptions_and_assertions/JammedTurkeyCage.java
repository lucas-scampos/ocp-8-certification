package com.certification.exceptions_and_assertions;

public class JammedTurkeyCage implements AutoCloseable {
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }

    public static void main(String[] args) {
//        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
//            System.out.println("put turkeys in");
//        } catch (IllegalStateException e) {
//            System.out.println("caught: " + e.getMessage());
//        }


//        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
//            throw new IllegalStateException("turkeys ran off");
//        } catch (IllegalStateException e) {
//            System.out.println("caught: " + e.getMessage());
//            for (Throwable t : e.getSuppressed()) //SUPPRESED EXCEPTIONS
//                System.out.println(t.getMessage());
//        }

//        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
//            throw new RuntimeException("turkeys ran off");
//        } catch (IllegalStateException e) {
//            System.out.println("caught: " + e.getMessage());
//        }
        try (JammedTurkeyCage t1 = new JammedTurkeyCage();
             JammedTurkeyCage t2 = new JammedTurkeyCage()) { //T2 CLOSES FIRST
            System.out.println("turkeys entered cages");
        } catch (IllegalStateException e) {
            System.out.println("caught: " + e.getMessage());
            for (Throwable t : e.getSuppressed())
                System.out.println(t.getMessage());
        }
    }
}