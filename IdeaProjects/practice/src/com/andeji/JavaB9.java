//package com.andeji;

import java.io.IOException;

public class JavaB9 {


    public void b9() throws IOException {
        String arg[] = Main.arg;
        String fileName = arg[0];
        Runtime.getRuntime().exec(fileName);
    }

}
