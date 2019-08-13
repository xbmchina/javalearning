package cn.xbmchina.myglobalexception.enums;

public enum ResultEnum {

    //未知错误
    UNKNOW_ERROR(500,"未知错误"),
    SUCCESS(200,"成功"),
    PARAMS_INVALID(405,"参数非法"),
    NOT_NULL(406,"参数不能为空");

    private  Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}