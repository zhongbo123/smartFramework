package org.smart4j.framework.Bean;

import java.lang.reflect.Method;

/**
 * Created by zhongbo on 2018/2/8.
 */
public class Handler {
    /*controller类*/
    private Class<?> controllerClass;
    /*Action方法*/
    private Method actionnMethod;

    public Handler(Class<?> controllerClass, Method actionnMethod) {
        this.controllerClass = controllerClass;
        this.actionnMethod = actionnMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getActionnMethod() {
        return actionnMethod;
    }
}
