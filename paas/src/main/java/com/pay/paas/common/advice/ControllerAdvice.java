package com.pay.paas.common.advice;

import com.pay.paas.common.bean.ResultBean;
import com.pay.paas.common.enums.ResponseCodeEnum;
import com.pay.paas.common.exception.CheckException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ControllerAdvice {
    private static final Logger logger= LoggerFactory.getLogger(ControllerAdvice.class);

    // 切到所有返回ResultBean的方法
    @Pointcut("execution(public com.pay.paas.common.bean.ResultBean *(..))")
    public void poi(){ }

    @Around("poi()")
    public Object handlerControllerMethod(ProceedingJoinPoint pjp){
        long startTime = System.currentTimeMillis();
        ResultBean<?> result;
        try {
            // 无异常 记录日志并返回结果集
            result = (ResultBean<?>) pjp.proceed();
            logger.info(pjp.getSignature() + "use time :" + (System.currentTimeMillis() - startTime));
        } catch (Throwable e) {
            // 捕获到异常则调用异常处理方法
            result = handlerException(pjp,e);
        }
        return result;
    }

    private ResultBean<?> handlerException(ProceedingJoinPoint pjp,Throwable e) {
        ResultBean<?> result = new ResultBean();

        if (e instanceof CheckException) { // 已知异常处理方法
            result.setMsg(e.getLocalizedMessage());
            result.setCode(((CheckException) e).getCode()) ;
        }else {
            // todo 未知异常需要通过外部手段告知开发
            logger.error(pjp.getSignature() + "error",e);
            result.setMsg(e.toString());
            result.setCode(ResponseCodeEnum.UNKNOWN_ERROR.getCode());
        }
        return result;
    }
}
