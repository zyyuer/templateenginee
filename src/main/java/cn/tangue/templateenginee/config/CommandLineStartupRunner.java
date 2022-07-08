package cn.tangue.templateenginee.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Component//使用@component方式配置runner
public class CommandLineStartupRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        log.info("CommandLineRunner传入参数：{}", Arrays.toString(args));
    }
}
