package com.andeji;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaB5 {
/*
使用SimpleDateFormat，將執行當下的時間印在Console
範例：2003-11-10 20:18:23 之格式。
        */
    public void b5(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date date = new Date();
        String now = sdf.format(date);
        System.out.println(now);
    }
}
