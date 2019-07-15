package com.example.hp.myapplication.data;

public class Responce {

    private String ResponseCode;

    private ResponseData ResponseData;

    private String ResponseMessage;

    public String getResponseCode ()
    {
        return ResponseCode;
    }

    public void setResponseCode (String ResponseCode)
    {
        this.ResponseCode = ResponseCode;
    }

    public ResponseData getResponseData ()
    {
        return ResponseData;
    }

    public void setResponseData (ResponseData ResponseData)
    {
        this.ResponseData = ResponseData;
    }

    public String getResponseMessage ()
    {
        return ResponseMessage;
    }

    public void setResponseMessage (String ResponseMessage)
    {
        this.ResponseMessage = ResponseMessage;
    }

}
