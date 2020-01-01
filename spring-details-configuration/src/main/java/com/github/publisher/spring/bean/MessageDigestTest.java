package com.github.publisher.spring.bean;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestTest {
    public static void main(String args[]) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
    }
}
