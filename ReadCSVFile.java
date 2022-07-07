package com.learning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
    public static void main(String[] args) {
        String PATH = "src/com/learning/file.csv";
        String line;
        String split = " ,";
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH));
            while((line = bufferedReader.readLine())!= null){
                String[] contactList = line.split(split);    // use comma as separator
                System.out.println("ContactList [ Name=" + contactList[0] + ", city=" + contactList[0]  +"]");
            }
        } catch (IOException message){
            System.out.println(message);
        }
    }
}
