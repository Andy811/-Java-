package com.andeji;

import java.util.Calendar;
import java.util.Date;

public class JavaB7 {
    /*Java-B7
    	請建立一個代表2003/11/10 20:00:00的Calendar物件，
        並印出其自1970年1月1日經過的milli-seconds。
	*/
    Calendar cal = Calendar.getInstance();
    Date date = new Date();


    public void b7(){
       // date.setTime(20031110);
        // cal.setTime(date);
        cal.set(2003,11,10,20,00,00);
        System.out.println(cal);
    }
}
