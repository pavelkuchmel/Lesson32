package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example4 {
    public static void main(String[] args) {
        final String inputFileName = "lines1251.txt";
        final String outputFileName = "line4.txt";

        try(

                FileInputStream fis = new FileInputStream(inputFileName);
                InputStreamReader isr = new InputStreamReader(fis, "windows-1251");

                FileOutputStream fos = new FileOutputStream(outputFileName);
                OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

                BufferedReader br = new BufferedReader(isr);
                BufferedWriter bw = new BufferedWriter(osw);

        ){

            String line = "";

            while ( (line = br.readLine()) != null){
                System.out.print(line);
                bw.write(line + System.getProperty("line.separator"));
                bw.flush();
            }

        }catch (IOException e){

        }

    }
}
