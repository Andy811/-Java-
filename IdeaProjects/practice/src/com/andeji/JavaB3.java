package com.andeji;

import java.util.HashMap;

public class JavaB3 {
    /*
    寫出在一個HashMap放入以下key及對應的value的程式片段:
    (key,value) 的對應為 ("one",1) ("two",2) ("three",3)
    由HashMap裡取出 key為"two"的value值印出來
    */
    public void b3(){
        HashMap map = new HashMap();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three",3);
        System.out.println(map.get("two"));
    }
}
