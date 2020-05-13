package com.certification.io;

import java.io.*;

/* Low level stream: connects directly with the source of data, such as file, an array or String
 *  Low level stream process the raw data or resource and are accessed in a direct and unfiltered manner
 *
 *  High level stream is built on top of another stream using wrapping. Wrapping is the process by which an instance
 * is passed to the constructor of another class and operations on the resulting instance are filtered and applied to the original
 * instance.
 *
 * */
public class LowLevelVsHighLevelStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("zoo-data.txt"))) {
            System.out.println(bufferedReader.readLine());

            try (ObjectInputStream objectStream = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("zoo-data.txt")))) {
                System.out.println(objectStream.readObject());
            }
        }
    }
}
