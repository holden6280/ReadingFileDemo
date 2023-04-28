/*package org.yup.filereaderdemo;

import java.io.*;
import java.util.Scanner;

public class FileReaderApp {

    public static void main(String[] args) {

        try {

            //makes the file readable from the file system to the java application
            FileInputStream theFileWeWantToWorkWith = new FileInputStream("demo");

            //hand the file to the scanner, so we can read the lines
            Scanner myScanner = new Scanner(theFileWeWantToWorkWith);

            //while there are lines in the file we have not processed keep looping over the lines in the file
            while (myScanner.hasNextLine()) {

                System.out.println(myScanner.nextLine());

            }

            //close the file
            myScanner.close();


        } catch (IOException e){
            System.out.println("Sorry but we couldn't find that file on the computer.");
            e.printStackTrace();
        }
    }
}*/