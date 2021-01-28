package com.andeji;


import java.util.Scanner;
public class JavaB1 {


    public void b1() {
        String a = "我是誰";
        System.out.println(a);

        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入字串:");

        String str1 = scanner.nextLine();
        System.out.print("輸入的字串為: " + str1 + "  ");
        if (a.indexOf(str1) != -1) {
            System.out.println("字串中有你輸入的字串");
        } else {
            System.out.println("字串中沒有你輸入的字串");
        }
    }
}


