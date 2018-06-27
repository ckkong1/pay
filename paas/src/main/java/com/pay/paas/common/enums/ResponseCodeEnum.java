package com.pay.paas.common.enums;

public enum ResponseCodeEnum {
    UNKNOWN_ERROR(-1,"unknown_error"),
    SUCCESS(0,"success"),

    ;

    private int code;
    private String msg;

    ResponseCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
