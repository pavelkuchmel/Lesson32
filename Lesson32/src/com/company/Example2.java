package com.company;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example2 {
    public static void main(String[] args) {
        final String inputFileName = "lines.txt";
        final String outputFileName = "line2.txt";
        try (FileReader fr = new FileReader(inputFileName);
             FileWriter fw = new FileWriter(outputFileName, false);){

            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ( (line = br.readLine()) != null){
                char[] buffer = new char[line.length()];
                line.getChars(0, line.length(), buffer, 0);
                for (char c : buffer){
                    if(c == 'e'){
                        fw.write('E');
                    }
                    else {
                        fw.write(c);
                    }
                }
                fw.write(System.getProperty("line.separator"));
            }

        }catch (FileNotFoundException e){
            Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, e);
        }
        catch (IOException e){
            Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
