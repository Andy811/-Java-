package com.andeji;

import java.io.*;

public class JavaB10 {

    public void b10() throws IOException {
        String arg[] = Main.arg;
        StringBuffer sb = new StringBuffer("");
        FileReader reader = null;
        BufferedReader br = null;
        try {

            // FileReader reader = new FileReader("C://Hello.txt");
            reader = new FileReader(arg[0]);
            br = new BufferedReader(reader);
            String str = null;
            while ((str = br.readLine()) != null) {
                sb.append(str + "\n");
                System.out.println(str);
            }
            br.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("找不到檔案");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if( reader != null ) {
                try {
                    reader.close();
                } catch( IOException ioe ) {
                    ioe.printStackTrace();
                }
            }
            if( br != null ) {
                try {
                    br.close();
                } catch( IOException ioe ) {
                    ioe.printStackTrace();
                }
            }
            System.out.println("檔案已關閉");
        }
    }


}
