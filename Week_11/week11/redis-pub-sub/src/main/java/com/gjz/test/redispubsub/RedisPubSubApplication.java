package com.gjz.test.redispubsub;

import com.gjz.test.redispubsub.receivers.ReceiverInterface;
import com.gjz.test.redispubsub.service.RedisSubscribeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

@SpringBootApplication
public class RedisPubSubApplication {

    private static Logger logger = LoggerFactory.getLogger(RedisPubSubApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RedisPubSubApplication.class, args);
        RedisSubscribeService redisSubscribeService = context.getBean("redisSubscribeService", RedisSubscribeService.class);
        redisSubscribeService.subscribe("chat", new ReceiverInterface<String>() {
            /**
             * 接收消息
             *
             * @param message
             */
            @Override
            public void receiveMessage(String message) {
                logger.info("接收到消息啦。。。。。");
                logger.info("消息内容：{}", message);
            }

        });
    }

}