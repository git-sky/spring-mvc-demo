package cn.com.sky.advice;

/**
 * 错误码定义
 */
public enum ErrorCode {

    /**
     * 正常返回
     */
    SUCCESS(0, "ok"),

    NO_LOGIN(401, "未登入"),
    NO_AUTHORITY(403, "无权限");


    private Integer code;
    private String msg;

    ErrorCode() {
    }

    ErrorCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
