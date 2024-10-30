package com.askie01.recipeapp.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ResponseMessage {
    public static String OK = "Request processed successfully.";
    public static String CREATED = "Create request processed successfully.";
    public static String ACCEPTED = "Request accepted for processing, yet to complete";
    public static String NO_CONTENT = "Request successful, no content in response.";
    public static String BAD_REQUEST = "Server couldn't process due to client error.";
    public static String UNAUTHORIZED = "Authentication required to access resource.";
    public static String NOT_FOUND = "Request method is not supported for this resource.";
    public static String METHOD_NOT_ALLOWED = "Request method is not supported for this resource.";
    public static String INTERNAL_SERVER_ERROR = "The server encountered an unexpected issue.";
    public static String BAD_GATEWAY = "Server received an invalid response upstream.";
}
