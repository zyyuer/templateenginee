package cn.tangue.templateenginee.config.event;

import org.springframework.context.ApplicationEvent;
//定义事件
public class MyEvent extends ApplicationEvent {
    //传递事件源
    public MyEvent(Object source) {
        super(source);
    }
}
