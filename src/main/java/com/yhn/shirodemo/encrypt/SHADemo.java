package com.yhn.shirodemo.encrypt;

import java.security.MessageDigest;

public class SHADemo {
    public static void main(String[] args) throws Exception{
        sha1("你好");
    }

    public static void sha1(String msg) throws Exception{
        MessageDigest sha = MessageDigest.getInstance("SHA");
        byte[] digest = sha.digest(msg.getBytes());
        sha.update(msg.getBytes("UTF-8"));
        System.out.println("sha---------"+new String(digest));
        byte[] digest1 = sha.digest(msg.getBytes());
        System.out.println("sha---------"+new String(digest1));
    }


}
