package com.spring.boot.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author 没个破名怎活
 * @date 2022/6/28
 * 拦截器方法中的执行顺序 preHandle->controller里的接口方法->postHandle->afterCompletion
 * 只有preHandle返回true才会执行，否则拦截，停止执行该端口
 **/
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        log.info("前置处理方法执行了");
        if ("/getbook".equals(request.getRequestURI())){
            response.setContentType("text/json;charset=UTF-8");
            PrintWriter printWriter = response.getWriter();
            printWriter.println("不通过此方法，拦截!接收到的name: "+request.getParameter("name"));
            return false;
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           @Nullable ModelAndView modelAndView) throws Exception {
        log.info("后置处理方法执行了");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                @Nullable Exception ex) throws Exception {
        log.info("完成处理方法执行了");
    }

}
