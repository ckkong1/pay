package com.pay.paas.common.utils;

import org.springframework.util.DigestUtils;

public class MD5Util {

    public static String toMD5(String str) {
        return DigestUtils.md5DigestAsHex(str.getBytes());
    }
}
