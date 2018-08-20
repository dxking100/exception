package com.duideduo.exception;

public class ResultMsg {
    public enum Code{
        Success,Error
    }

    Code state;
    Object result;
    String msg;

    public ResultMsg(Code state, Object result, String msg) {
        this.state = state;
        this.result = result;
        this.msg = msg;
    }

    public Code getState() {
        return state;
    }

    public void setState(Code state) {
        this.state = state;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
