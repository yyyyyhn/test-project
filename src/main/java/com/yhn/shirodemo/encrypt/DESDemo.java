package com.yhn.shirodemo.encrypt;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class DESDemo {
    public static void main(String[] args) throws Exception {
        des("你好");
    }

//    关于keyGenerator,KeyPairGenerator,SecretKeyFactory的解析
//            Java加密的常用的加密算法类型有三种
//
//      1单向加密：也就是不可逆的加密，例如MD5,SHA,HMAC
//
//      2对称加密：也就是加密方和解密方利用同一个秘钥对数据进行加密和解密，例如DES，PBE等等
//
//      3非对称加密：非对称加密分为公钥和秘钥，二者是非对称的，例如用私钥加密的内容需要使用公钥来解密，使用公钥加密的内容需要用私钥来解密，DSA，RSA...
//
//    而keyGenerator,KeyPairGenerator,SecretKeyFactory的三种使用方法刚好和这三种加密算法类型对上
//
//    keyGenerator：秘钥生成器，也就是更具算法类型随机生成一个秘钥，例如HMAC，所以这个大部分用在非可逆的算法中
//
//    SecretKeyFactory：秘密秘钥工厂，言外之意就是需要根据一个秘密（password）去生成一个秘钥,例如DES，PBE，所以大部分使用在对称加密中
//
//    KeyPairGenerator:秘钥对生成器，也就是可以生成一对秘钥，也就是公钥和私钥，所以大部分使用在非对称加密中
    public static void des(String msg) throws Exception{
        KeyGenerator kg = KeyGenerator.getInstance("DESede");
        SecretKey key = kg.generateKey();//生成密匙，可用多种方法来保存密匙
        Cipher cp = Cipher.getInstance("DESede"); //创建密码器   

        cp.init(Cipher.ENCRYPT_MODE,key); //初始化 第一个参数:为1时为加密,为2时为解密  

        byte[] ptext = msg.getBytes("UTF-8");

        byte[] ctext = cp.doFinal(ptext);//加密 

        System.out.println("密钥是:"+new String(key.getEncoded(),"UTF-8"));

        System.out.println("密文是:"+new String(ctext,"UTF-8"));

        cp.init(Cipher.DECRYPT_MODE,key); //初始化 第一个参数:为1时为加密,为2时为解密

        byte[] mtext = cp.doFinal(ctext); //解密   

        String result =  new String(mtext,"UTF-8");

        System.out.println("明文是:"+result);

    }
}
