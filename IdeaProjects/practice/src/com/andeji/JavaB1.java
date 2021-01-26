package com.andeji;

import java.util.Scanner;

public class JavaB1 {
    public void b1(){
         /* 請提供判斷a字串內是否包含b字串的程式片斷
        1.  a = "我是誰" b = "是誰" 所以a 包含 b
        2.  a = "我是誰" b = "誰是" 所以a 不包含b*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入字串:");
        String a = "我是誰";
        String str1 = scanner.nextLine();
        System.out.print("輸入的字串為: "+str1+"  ");
        if(a.indexOf(str1)!=-1){
            System.out.println("a字串中有你輸入的字串");
        }else {
            System.out.println("a字串中沒有你輸入的字串");
        }
    }
}
