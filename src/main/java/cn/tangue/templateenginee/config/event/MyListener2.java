package cn.tangue.templateenginee.config.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//加上了@Component 就完成了事件监听的注册，不用在入口中注册
// 注册自定义监听器写代码注册自定义监听器方式2
@Component
@Slf4j
//定义监听器用于监听事件MyEvent
public class MyListener2 implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info(String.format("%s监听到事件源：%s.",
                MyListener2.class.getName(),
                event.getSource()));
    }
}
