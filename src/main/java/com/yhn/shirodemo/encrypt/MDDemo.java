package com.yhn.shirodemo.encrypt;

import java.security.MessageDigest;

/**
 * 消息摘要算法 - MD
 */
public class MDDemo {
    public static void main(String[] args) throws Exception {
        md2("你好");
        md5("你好");
    }

    public static void md2(String msg) throws Exception{
        MessageDigest md2 = MessageDigest.getInstance("MD2");
        byte[] digest = md2.digest(msg.getBytes());
        String s = new String(digest);
        System.out.println("MD2-----"+s);
    }
    public static void md5(String msg) throws Exception{
        MessageDigest md2 = MessageDigest.getInstance("MD5");
        byte[] digest = md2.digest(msg.getBytes());
        String s = new String(digest);
        System.out.println(s);
        System.out.println("MD5------------------"+s);
    }
}
