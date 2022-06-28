package com.poming.boot.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 没个破名怎活
 * @date 2022/6/28
 **/
@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(value = {MaxUploadSizeExceededException.class})
    public void uploadException(MaxUploadSizeExceededException e, HttpServletResponse resp)
            throws MaxUploadSizeExceededException, IOException {
        resp.setContentType("text/json;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("上传文件大小受限制!");
        writer.flush();
        writer.close();
    }

}
