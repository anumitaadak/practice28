package com.learning;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
        String PATH = "src/com/learning/file.txt";

        try{
            File file = new File(PATH);
            file.createNewFile();
            if(file.exists()){
                FileWriter fileWriter = new FileWriter(PATH,true);
                fileWriter.write("\n name : Raj,Contact no : 798965544");
                fileWriter.write("\n name : Rohini,Contact no : 977645453");
                fileWriter.write("\n name : Reba,Contact no : 977564434");
                fileWriter.write("\nname : Aastha,Contact no : 978665453");
                fileWriter.flush();
            } else {
                System.out.println("File not available");
            }
        } catch (IOException message){
            System.out.println(message);
        }
    }
}
