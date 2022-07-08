package cn.tangue.templateenginee.config.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
//定义监听器用于监听事件MyEvent
public class MyListener3 implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info(String.format("%s监听到事件源：%s.",
                MyListener3.class.getName(),
                event.getSource()));
    }
}
