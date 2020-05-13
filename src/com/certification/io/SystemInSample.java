package com.certification.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Old way of getting input
public class SystemInSample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String userInput = reader.readLine();
        System.out.println("You entered the following: " + userInput);
    }
}