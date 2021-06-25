package com.zero.backend.utils;

public class StringsUtils {

    public static Boolean isEmpty(String data) {
        if (data == null || "".equals(data)) {
            return true;
        }
        return false;
    }

}
