package com.andeji;


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

/*
        System.out.println("選擇要執行的題目");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        switch (num){
            case 1:
                b1.b1();
                break;
            case 2:
                b2.b2();
                break;
            case 3:
                b3.b3();
                break;
            case 4:
                b4.b4();
                break;
            case 5:
                b5.b5();
                break;
        }*

       // b6.b6();
        /*try {
            b7.b7();
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
       // b8.b8();
        /*try {
            b9.b9();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
            b10.b10();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}


