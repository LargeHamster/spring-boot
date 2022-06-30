package com.poming.boot.handler;

import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 没个破名怎活
 * @date 2022/6/30
 * Validation配合全局异常返回数据
 **/
@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(value = BindException.class)
    public List<String> validate(BindException e){
        BindingResult result;
        List<String> errors=new ArrayList<>();
        result=e.getBindingResult();
        if (result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError error : allErrors) {
                errors.add(error.getDefaultMessage());
            }
        }
        return errors;
    }

}
