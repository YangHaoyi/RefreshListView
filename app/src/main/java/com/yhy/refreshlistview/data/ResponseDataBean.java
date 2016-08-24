package com.yhy.refreshlistview.data;

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
        SUCCESS(0,""),NOTFIND(-4,""),LATE(4152,""),HAVEORDER(4153,""),MAINTENANCE(5103,""),DISABLE(4156,""),SERVERERROR(500,""),ERROR(9999,"");
        private int value;
        private String msg;
        CODE(int value,String msg) {
            this.value = value;
            this.msg=msg;
        }

        public int getValue() {
            return value;
        }

        public static CODE get(int value){
            for(CODE item : CODE.values()){
                if(item.getValue() == value){
                    return item;
                }
            }
            return ERROR;
        }
    }
}
