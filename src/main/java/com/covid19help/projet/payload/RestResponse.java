package com.covid19help.projet.payload;

import org.springframework.http.HttpStatus;

public class RestResponse {

    private Object data;
    private String message;
    private HttpStatus status;
    private Integer code;

    public RestResponse() {
    }

    public RestResponse(String message, HttpStatus status, Integer code) {
        this.message = message;
        this.status = status;
        this.code = code;
    }

    public RestResponse(Object data, String message, HttpStatus status, Integer code) {
        this.data = data;
        this.message = message;
        this.status = status;
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
