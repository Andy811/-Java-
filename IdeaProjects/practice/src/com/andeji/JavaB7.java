package com.andeji;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaB7 {
    /*Java-B7
    	請建立一個代表2003/11/10 20:00:00的Calendar物件，
        並印出其自1970年1月1日經過的milli-seconds。
	*/
    Calendar cal1 = Calendar.getInstance();

    Date date2, date1;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");


    public void b7() throws ParseException {

        date1 = sdf.parse("1970/1/1 00:00:00");
      //  System.out.println(sdf.format(cal1.getTime()));
      //  System.out.println(sdf.format(date1));
        cal1.set(2003, 11, 10, 20, 00, 00);
        date2 = cal1.getTime();
        System.out.println(date2.getTime()-date1.getTime());

        /*
        Date date = new Date();
        cal1.setTime(date);
        cal1.add(Calendar.MONTH,-1);
        System.out.println(sdf.format(cal1.getTime()));
        */

    }

}
