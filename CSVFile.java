package com.learning;

import au.com.bytecode.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFile {
    public static void main(String[] args) {
        String PATH = "src/com/learning/file.csv";
            File file = new File(PATH);

            try{
                FileWriter fileWriter = new FileWriter(file);
                CSVWriter csvWriter = new CSVWriter(fileWriter,',');
                List<String[]> contactList = new ArrayList<>();
                contactList.add(new String[]{"name","city"});
                contactList.add(new String[]{"Aastha","Nagpur"});
                contactList.add(new String[]{"Jiya","Indore"});
                contactList.add(new String[]{"Namya","Jaipur"});

                csvWriter.writeAll(contactList);
                csvWriter.flush();
            } catch (IOException message){
                System.out.println(message);
            }
    }
}
