package cn.tangue.templateenginee.exception;

import java.lang.annotation.*;
//可以不要了
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
public @interface ResponseResult {
}
