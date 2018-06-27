package com.pay.paas.common.exception;

public class CheckException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private int code;

    public CheckException() {
    }

    public CheckException(int code, String message) {
        super(message);
        this.code = code;
    }

    public CheckException(int code, Throwable cause) {
        super(cause);
        this.code = code;
    }

    public CheckException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public CheckException(int code, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
