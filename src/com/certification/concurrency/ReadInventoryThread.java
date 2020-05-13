package com.certification.concurrency;

public class ReadInventoryThread extends Thread {
    public void run() {
        System.out.println("Printing zoo inventory");
    }

    public static void main(String[] args) {
//        (new ReadInventoryThread()).start();
        System.out.println("begin");
        (new ReadInventoryThread()).start();
        (new Thread(new PrintData())).start();
        (new ReadInventoryThread()).start();
        System.out.println("end");

//        new PrintData().run();
//        (new Thread(new PrintData())).run();
//        (new ReadInventoryThread()).run();


    }
}