package com.interface21.webmvc.servlet.mvc.tobe;

import com.interface21.webmvc.servlet.ModelAndView;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

public class HandlerExecution {

    private final Method method;
    private final Object controllerInstance;

    public HandlerExecution(Method method, Object controllerInstance) {
        this.method = method;
        this.controllerInstance = controllerInstance;
    }

    public ModelAndView handle(final HttpServletRequest request, final HttpServletResponse response) throws Exception {
        return (ModelAndView) method.invoke(controllerInstance, request, response);
    }
}
