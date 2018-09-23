package com.heqin.learnssm.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomExceptionResolver implements HandlerExceptionResolver {
    // 处理自定义异常

    /**
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @return
     */
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                         Exception ex) {
        CustomException customException;
        if(ex instanceof  CustomException) {
            customException = (CustomException)ex;
        }else {
            customException = new CustomException("新的错误!");
        }

        // 错误信息
        String message = customException.getMessage();

        ModelAndView view = new ModelAndView();

        // 将错误信息传到页面
        view.addObject("message", message);

        // 指向错误页面
        view.setViewName("error");

        return view;
    }
}
