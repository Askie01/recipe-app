package com.askie01.recipeapp.response;

public interface Response<Code, Message> {
    Code getCode();

    void setCode(Code code);

    Message getMessage();

    void setMessage(Message message);
}
