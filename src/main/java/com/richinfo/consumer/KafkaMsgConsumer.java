package com.richinfo.consumer;

import com.richinfo.domain.Student;
import com.richinfo.utils.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * kafka消息消费者例子
 *
 * @author yexuce
 * @date 2019-05-14
 */
@Component
public class KafkaMsgConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaMsgConsumer.class);

    @KafkaListener(topics = {"${spring.kafka.consumer.topic}"})
    public void receive(@Payload String message, @Headers MessageHeaders headers) {
        // logger.info("KafkaMessageConsumer 接收到消息："+message);
        // Student student = JSONObject.parseObject(message, Student.class);
        // List<Student> list = JsonUtils.string2Obj(message, List.class);
        // Student student = JsonUtils.string2Obj(message, Student.class);
        /*LOGGER.info("消费的消息数据是:" + student);
        System.out.println(student);*/
        //headers.keySet().forEach(key->logger.info("{}: {}",key,headers.get(key)));

        System.out.println("消费的消息是:" + message);
    }
}
