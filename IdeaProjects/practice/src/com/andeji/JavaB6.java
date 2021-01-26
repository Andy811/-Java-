package com.andeji;

public class JavaB6 {
    /*Java-B6
    請寫出一個程式，於執行時帶入第一個參數(非等待使用者輸入System.in)
    ，並將這個參數加10之後印出。(請將此程式編譯後，由cmd執行)
    範例 : 在命令列給的參數值為112 , console印出來的值 122
            1.	你的程式在未加參數時執行是否會有錯誤？可能錯誤的原因是什麼？該如何改善？
            2.	如果傳入的參數不為數字是否會有錯誤？可能錯誤的原因是什麼？該如何改善？
            3.	將數字轉換為字串可以用什麼方法？
*/
    String pa = Main.pa;
    public void b6(){

        System.out.println(Integer.parseInt(pa) + 10);

    }

}
