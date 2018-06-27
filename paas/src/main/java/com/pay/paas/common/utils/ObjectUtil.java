package com.pay.paas.common.utils;

import java.lang.reflect.InvocationTargetException;

public class ObjectUtil {

    public void copyAttribute(Object source, Object dest)  {
        try {
            org.apache.commons.beanutils.BeanUtils.copyProperties(dest, source);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}