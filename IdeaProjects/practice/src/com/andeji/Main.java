package com.andeji;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static String arg[];

    public static void main(String[] args) throws ParseException, IOException {
        arg= args;
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
        System.out.println("Program arguments:");

        System.out.println("args: "+args[0]);

        b10.b10();
        }


    }


