package com.sniperfuchs.servicebroker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.PRECONDITION_FAILED)
public class ApiVersionMissingException extends RuntimeException
{
    public ApiVersionMissingException(String message) {
        super(message);
    }
}
