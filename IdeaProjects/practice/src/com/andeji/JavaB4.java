//package com.andeji;

import java.util.HashMap;
import java.util.Map;

public class JavaB4 {
    /*
    Java-B4	熟悉Map Interface的用法及操作	請宣告一個Map型態的變數，並自行放入數個key和value後印出所有的key和value？
    範例: Map裡存在(key,value) 的對應為 ("one",1) ("two",2) ("three",3) 印出所有的key及value (不必照以上順序)
    **/
    public void b4(){
        Map map = new HashMap();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        System.out.println(map);
    }

}
