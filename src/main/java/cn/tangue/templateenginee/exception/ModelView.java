package cn.tangue.templateenginee.exception;

import java.lang.annotation.*;

//在标记该注解的controller方法上发生异常跳转到error页面
//其余的没有标记注解的 接口及restful等直接返回AjaxResponse
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})//只能在方法上使用此注解
public @interface ModelView {

}