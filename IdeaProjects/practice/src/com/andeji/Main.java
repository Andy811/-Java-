package com.andeji;

import java.util.Scanner;

public class Main {
    public static String pa;

    public static void main(String[] args) {
        pa= args[0];
        JavaB1 b1 = new JavaB1();
        JavaB2 b2 = new JavaB2();
        JavaB3 b3 = new JavaB3();
        JavaB4 b4 = new JavaB4();
        JavaB5 b5 = new JavaB5();
        JavaB6 b6 = new JavaB6();
        JavaB7 b7 = new JavaB7();
        System.out.println("Program arguments:");

        System.out.println("args: "+args[0]);
        b7.b7();

    }
}
