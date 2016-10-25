package CodeKamp;

import java.io.*;
import java.util.Scanner;

/**
 * Created by cerebro on 24/10/16.
 */
public class Demo {
    public static void main(String[] args) {

        try {
            FileInputStream reader = new FileInputStream("/Users/cerebro/IdeaProjects/java_september/FileHandlingDemo/src/CodeKamp/abcd.txt");

            while (true) {
                int x = reader.read();
                if(x == -1) {
                    break;
                }
                System.out.println((char) x);
            }

            reader.close();
            System.out.println("File read completed");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream writer = new FileOutputStream("/Users/cerebro/IdeaProjects/java_september/FileHandlingDemo/src/CodeKamp/abcd.txt");
            writer.write(97);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



        File file1 = new File("/Users/cerebro/IdeaProjects/java_september/FileHandlingDemo/src/CodeKamp/");

        String[] fileNames = file1.list();

        for(String fileName:fileNames) {
            System.out.println(fileName);
        }


        try {
            RandomAccessFile file = new RandomAccessFile("/Users/cerebro/IdeaProjects/java_september/FileHandlingDemo/src/CodeKamp/abcd.txt", "rw");

            file.seek(file.length());
            file.writeChars("I love Programming!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        if(scanner.hasNextInt()) {
            int userEnteredValue = scanner.nextInt();
            System.out.println("the age you entered is " + userEnteredValue);
        }
    }
}
