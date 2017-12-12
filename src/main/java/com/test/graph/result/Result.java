package com.test.graph.result;

/**
 * Created by cjh on 2017/12/5.
 */
public class Result {
    private String code;
    private String desc;
    private Object result;
    public Result(String code,String desc,Object result){
        this.code = code;
        this.desc = desc;
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
