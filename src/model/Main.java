package model;

import java.math.BigInteger;

public class Main {
    static public void main(String[] args){
        int N = 37; // valeur fixe
        RSA key = new RSA(N);
        System.out.println(key);

        String s = "test";
        byte[] bytes = s.getBytes();
        BigInteger message = new BigInteger(bytes);

        BigInteger encrypt = key.encrypt(message);
        BigInteger decrypt = key.decrypt(encrypt);
        System.out.println("message in int  : " + message);
        System.out.println("message in string : "+ new String(message.toByteArray()));
        System.out.println("encrypted in int = " + encrypt);
        System.out.println("encrypted in string = " + new String(encrypt.toByteArray()));
        System.out.println("decrypted in int = " + decrypt);
        System.out.println("decrypted in string = " + new String(decrypt.toByteArray()));
    }
}
