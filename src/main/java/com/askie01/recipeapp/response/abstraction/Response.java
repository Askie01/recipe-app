package com.askie01.recipeapp.response.abstraction;

public interface Response<Code, Message> {
    Code getCode();

    void setCode(Code code);

    Message getMessage();

    void setMessage(Message message);
}
