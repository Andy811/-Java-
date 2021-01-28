package com.andeji;

import java.io.*;

public class JavaB10 {

    public void b10() throws IOException {
        String arg[] = Main.arg;
        StringBuffer sb = new StringBuffer("");
        FileReader reader=null;
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
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
            br.close();
            System.out.println("檔案已關閉");
        }
    }


}
