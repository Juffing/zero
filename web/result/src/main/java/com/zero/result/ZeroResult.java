package com.zero.result;

public class ZeroResult<T> {

    private Boolean success;

    private Integer code;

    private String info;

    private T data;

    public ZeroResult(Boolean success, Integer code, String info, T data) {
        this.success = success;
        this.code = code;
        this.info = info;
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ZeroResult<T> success(ResultCode resultCode, T data) {
        return new ZeroResult<>(true, resultCode.getCode(), resultCode.getInfo(), data);
    }

    public static <T> ZeroResult<T> success(T data) {
        return success(ResultCode.REQUEST_SUCCESS, data);
    }

    public static <T> ZeroResult<T> fail(ResultCode resultCode, T data) {
        return new ZeroResult<>(false, resultCode.getCode(), resultCode.getInfo(), data);
    }

    public static <T> ZeroResult<T> fail(T data) {
        return fail(ResultCode.REQUEST_FAIL, data);
    }

}
