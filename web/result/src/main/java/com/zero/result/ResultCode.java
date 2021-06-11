package com.zero.result;

public enum ResultCode {
    REQUEST_SUCCESS(200, "成功"),
    REQUEST_FAIL(202, "失败");

    private Integer code;

    private String info;

    ResultCode(Integer code, String info) {
        this.code = code;
        this.info = info;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
