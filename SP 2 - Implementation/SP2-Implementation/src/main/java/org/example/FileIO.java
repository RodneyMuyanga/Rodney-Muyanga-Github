package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class FileIO {

    public ArrayList<String> readCarData(String path) {
        ArrayList<String> data = new ArrayList<>();
        File file = new File(path);
        try {
            Scanner scan = new Scanner(file);
            scan.nextLine(); //Skip header
            while (scan.hasNextLine()) {
                String s = scan.nextLine();// Hele linjen vil stå i én string   ==>  "Egon, 200"
                data.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("car not found");
        }
        return data;
    }
}