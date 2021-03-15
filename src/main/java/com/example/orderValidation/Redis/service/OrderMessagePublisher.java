package com.example.orderValidation.Redis.service;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;

@Service
public class OrderMessagePublisher {
    private final RedisTemplate<String, Object> redisTemplate;
    private final ChannelTopic topic;
    private ChannelTopic topic2;

    public OrderMessagePublisher(RedisTemplate<String, Object> redisTemplate, ChannelTopic topic){
        this.redisTemplate = redisTemplate;
        this.topic = topic;
    }

    public void publish(String message){
        this.redisTemplate.convertAndSend(topic.getTopic(), message);
    }

    public void publishTrade(String message){
        this.topic2 = ChannelTopic.of("tradeEngineTopic");
        this.redisTemplate.convertAndSend(topic2.getTopic(), message);
    }

}
