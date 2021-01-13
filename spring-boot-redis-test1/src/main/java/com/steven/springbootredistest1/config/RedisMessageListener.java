/**
 * @Author： supconit
 * @Date： 2021/1/11
 * @Description：
 */
package com.steven.springbootredistest1.config;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class RedisMessageListener  implements MessageListener {

    @Override
    public void onMessage(Message message, byte[] pattern) {
        String messageStr = new String(message.getBody());
        String topic = new String (pattern);
        System.out.println("message:" + messageStr);
        System.out.println("topic: " + topic);
    }
}
