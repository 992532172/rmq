package com.wehotel.rmq.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liang.zhang on 2017/7/26.
 */
@Service
public class TestProducerImpl implements TestProducer {
    @Autowired
    private AmqpTemplate testTemplate;

    @Override
    public void sendMessage(String queue, String msg) {
        testTemplate.convertAndSend(msg);
    }
}
