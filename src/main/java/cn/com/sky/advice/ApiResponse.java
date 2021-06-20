package cn.com.sky.advice;


/**
 * 统一返回响应体
 */
public class ApiResponse<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    /**
     * 业务数据
     */
    private T data;

    //-------------------------------------

    public ApiResponse() {
        this.code = ErrorCode.SUCCESS.getCode();
        this.msg = ErrorCode.SUCCESS.getMsg();
    }

    public static <T> ApiResponse<T> success() {
        return new ApiResponse(ErrorCode.SUCCESS.getCode(), ErrorCode.SUCCESS.getMsg());
    }

    public static <T> ApiResponse<T> error(int errorCode, String errorMsg) {
        return new ApiResponse(errorCode, errorMsg);
    }

    public static <T> ApiResponse<T> error(ErrorCode resultStatus) {
        return new ApiResponse(resultStatus.getCode(), resultStatus.getMsg());
    }


    public static <T> ApiResponse<T> data(T data) {
        return new ApiResponse(ErrorCode.SUCCESS.getCode(), ErrorCode.SUCCESS.getMsg(), data);
    }


    private ApiResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private ApiResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private ApiResponse(ErrorCode resultStatus) {
        this.code = resultStatus.getCode();
        this.msg = resultStatus.getMsg();
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static enum ResponseCode {

        SUCCESS(0,"调用成功"),
        FAILURE(1,"访问失败"),
        NO_LOGIN(401,"未登入"),
        NO_AUTHORITY(403,"无权限");

        private int code;
        private String msg;

        ResponseCode(int code, String msg) {
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

}