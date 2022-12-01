package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example3 {
    public static void main(String[] args) {
        final String inputFileName = "lines1251.txt";
        final String outputFileName = "line3.txt";

        try(

                FileInputStream fis = new FileInputStream(inputFileName);
                InputStreamReader isr = new InputStreamReader(fis, "windows-1251");

                FileOutputStream fos = new FileOutputStream(outputFileName);
                OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

                ){

            int c;

            while ( (c = isr.read()) != -1){
                System.out.print((char) c);
                osw.write(c);
            }
        }catch (IOException e){

        }
    }
}
