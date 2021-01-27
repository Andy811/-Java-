//package com.andeji;

//import java.io.IOException;
//import java.text.ParseException;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
        import java.util.*;

public class Main {
    public static String arg[];

    public static void main(String[] args) { //throws ParseException, IOException {

        arg = args;

        JavaB1 b1 = new JavaB1();
        JavaB2 b2 = new JavaB2();
        JavaB3 b3 = new JavaB3();
        JavaB4 b4 = new JavaB4();
        JavaB5 b5 = new JavaB5();
        JavaB6 b6 = new JavaB6();
        JavaB7 b7 = new JavaB7();
        JavaB8 b8 = new JavaB8();
        JavaB9 b9 = new JavaB9();
        JavaB10 b10 = new JavaB10();

        b1.b1();
        b2.b2();
        b3.b3();
        b4.b4();
        b5.b5();
        b6.b6();
     //   b7.b7();
        b8.b8();
      //  b9.b9();
     //   b10.b10();

    }
/*
    public void b1() {
          請提供判斷a字串內是否包含b字串的程式片斷
        1.  a = "我是誰" b = "是誰" 所以a 包含 b
        2.  a = "我是誰" b = "誰是" 所以a 不包含b
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入字串:");
        String a = "我是誰";
        String str1 = scanner.nextLine();
        System.out.print("輸入的字串為: " + str1 + "  ");
        if (a.indexOf(str1) != -1) {
            System.out.println("a字串中有你輸入的字串");
        } else {
            System.out.println("a字串中沒有你輸入的字串");
        }
    }

    public void b2() {
        StringBuffer sb = new StringBuffer("select * from abc ");
        sb.append("where id=2");
        System.out.println(sb);
    }
    public void b3(){
        HashMap map = new HashMap();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three",3);
        System.out.println(map.get("two"));
    }
    public void b4(){
        Map map = new HashMap();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        System.out.println(map);
    }
    public void b5() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date date = new Date();
        String now = sdf.format(date);
        System.out.println(now);
    }
    public void b6(){
        System.out.println(Integer.parseInt(arg[0]) + 10);
    }
    public void b7() throws ParseException {
        Calendar cal1 = Calendar.getInstance();
        Date date2, date1;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        date1 = sdf.parse("1970/1/1 00:00:00");

        cal1.set(2003, 11, 10, 20, 00, 00);
        date2 = cal1.getTime();
        System.out.println(date2.getTime()-date1.getTime());

    }
    public void b8() {
        int[] a = {1, 2, 3, 4};
        String arg[] = Main.arg;
        try {
            if (arg[0].equals("-a")&&arg.length==1) {
                throw new Exception("Argument2 is aquired");
            } else {
                for(String str:arg) {
                    System.out.println(str);
                }
            }
        } catch (Exception e) {
            //    System.out.println("Exception: "+e.getMessage());
            e.printStackTrace();
        }
    }
    public void b9() throws IOException {
        String arg[] = Main.arg;
        String fileName = arg[0];
        Runtime.getRuntime().exec(fileName);
    }
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
            System.out.println("哭哭饅頭");
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
            System.out.println("finally");
            reader.close();
            br.close();
            System.out.println("關了");
        }
    }*/
}


