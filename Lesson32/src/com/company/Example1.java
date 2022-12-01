package com.company;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example1 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        final String inputFileName = "lines.txt";
        final String outputFileName = "line1.txt";
        try{
            fr = new FileReader(inputFileName);
            fw = new FileWriter(outputFileName, true);
            BufferedReader br = new BufferedReader(fr);
            int lineCounter = 1;
            String line = null;
            while ( (line = br.readLine()) != null ){
                if (lineCounter++ % 2 != 0){
                    fw.write(line + System.getProperty("line.separator"));
                }
            }
        }catch (FileNotFoundException e){
            Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, e);
        }
        catch (IOException e){
            Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, e);
        }
        finally {
            try{
                fr.close();
                fw.close();
            }catch (IOException e){
                Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}
