//package com.andeji;

public class JavaB8 {



    public void b8() {
        int[] a = {1, 2, 3, 4};
        String arg[] = Main.arg;
        try {
            if (arg[0].equals("-a")&&arg.length==1) {
                throw new Exception("Argument2 is aquired");
            } else {
                for(String str:arg) {
                    System.out.println(str);
                }
            }
        } catch (Exception e) {
            //    System.out.println("Exception: "+e.getMessage());
            e.printStackTrace();
        }
    }

}
