package cn.tangue.templateenginee.config.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
//定义监听器用于监听事件MyEvent
public class MyListener4 {
//注册自定义监听器写代码注册自定义监听器方式4
    @EventListener
    public void listener(MyEvent event) {
        log.info(String.format("%s监听到事件源：%s.",
                MyListener4.class.getName(),
                event.getSource()));
    }
}
