package com.certification.io;

import java.io.File;

public class FileSample {
    public static void main(String[] args) {
        File file = new File("/home/smith/data/zoo.txt");
        System.out.println(file.exists());
    }
}