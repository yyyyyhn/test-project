package com.yhn.shirodemo.encrypt;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * RSA 非对称加密
 */
public class RSADemo {
    public static void main(String[] args) {

        try{
            KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA"); //创建‘密匙对’生成器

            KeyPair kp = kpg.genKeyPair();
            PublicKey public_key = kp.getPublic(); //获得公匙
            PrivateKey private_key = kp.getPrivate(); //获得私匙
            Cipher cp  =  Cipher.getInstance("RSA");  //创建密码器
            cp.init(Cipher.ENCRYPT_MODE,  public_key);  //初始化 第一个参数:为1时为加密,为2时为解密 
            String  str  =  "RSA非对称密码体系"; 
            byte  []  ptext  =  str.getBytes("UTF-8"); 
            byte  []  ctext  =  cp.doFinal(ptext); //加密
            
            cp.init(Cipher.DECRYPT_MODE,  private_key); //初始化 第一个参数:为1时为加密,为2时为解密 
            byte  []  mtext  =  cp.doFinal(ctext);  //解密 
            System.out.println("公钥是:"+new String(public_key.getEncoded(),"UTF-8"));
            System.out.println("私钥是:"+new String(private_key.getEncoded(),"UTF-8"));
            System.out.println("秘文是:"+new String(ctext,"UTF-8"));
            String  result  =  new  String(mtext,  "UTF-8"); 
            
            System.out.println("明文是:"+result);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
