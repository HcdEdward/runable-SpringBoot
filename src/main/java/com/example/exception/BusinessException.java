package com.example.exception;
/*
* 描述：业务异常
* @author huang.cd
* @date 2018-08-08
* */
public class BusinessException extends RuntimeException {
    public BusinessException () {}

    public BusinessException (String message) {
        super(message);
    }

}
