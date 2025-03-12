package com.adapp.ai.mock.test.demos.handler;

import com.adapp.ai.mock.test.demos.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result handleGlobalException(Exception ex) {
        return new Result(-1, ex.getMessage(), null);
    }
}