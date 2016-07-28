package com.yhy.mvcproject.response;

/**
 * 作者 : YangHaoyi on 2016/6/23.
 * 邮箱 ：yanghaoyi@neusoft.com
 */
public abstract class ResponseDataBean {
    protected int code;
    protected String description;
    protected String lastUpdateTime;

    protected  CODE codeMsg;

    public CODE getCodeMsg() {
        return CODE.get(code);
    }

    public void setCodeMsg(CODE codeMsg) {
        this.codeMsg = codeMsg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public enum CODE{
        SUCCESS(0),NOTFIND(-4);
        private int value;
        CODE(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static CODE get(int value){
            for(CODE color : CODE.values()){
                if(color.getValue() == value){
                    return color;
                }
            }
            return null;
        }
    }
}
