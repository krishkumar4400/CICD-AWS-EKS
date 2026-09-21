package com.hello.dto;

public class Data {
    private String message;
    private boolean success;
    private int statusCode;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Data(String message, int statusCode, boolean success) {
        this.message = message;
        this.success = success;
        this.statusCode = statusCode;

    }

}
