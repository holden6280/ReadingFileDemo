package org.yup.filereaderdemo;

        import java.io.*;
        import java.io.FileReader;
        import java.nio.Buffer;
        import java.util.Scanner;

public class FileReaderAppB {

    public static void main(String[] args) {


        try {

            //makes the file available from the file system to the java application
            FileReader theFileWeWantToWorkWith = new FileReader("employees.csv");
            BufferedReader theFileFromTheHDD = new BufferedReader(theFileWeWantToWorkWith);

            //Read the first line to throw it away because it's the header row that describes the columns
            theFileFromTheHDD.readLine();

            String theLine;
            //while there are lines in the file we have not processed keep looping over the lines in the file
            while ( ( theLine = theFileFromTheHDD.readLine()) != null ) {

                String[] linePieces = theLine.split("\\|");

                if(linePieces[0].equals("id")){
                    continue;
                }

                Person thePerson = new Person(linePieces[1]);

                System.out.printf("id: %d - name %s - pay rate: $%.2f\n", Integer.parseInt (linePieces[0]), thePerson.getName(), Float.parseFloat(linePieces[3]));


                //print out each line
                //System.out.println(thePerson.getName() + " has employee id " + linepieces[0] + " and they work " + linepieces[2] + " hours this week.");

            }

            //close the file
            theFileFromTheHDD.close();


        } catch (IOException e){
            System.out.println("Sorry but we couldn't find that file on the computer.");
            e.printStackTrace();
        }
    }
}