package com.yhn.shirodemo.encrypt;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64Demo {
    public static void main(String[] args) throws Exception {
        BASE64Encoder encoder = new BASE64Encoder();
        String msg = encoder.encode("你好".getBytes());
        System.out.println(msg);
        BASE64Decoder decoder = new BASE64Decoder();
        msg = new String(decoder.decodeBuffer(msg));
        System.out.println(msg);
    }
}
