package com.zmannotes.spring.domain;

public class HomeResponse {
    /** 响应码 */
    private int code;
    /** 响应信息 */
    private String message;

    public HomeResponse(int code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
