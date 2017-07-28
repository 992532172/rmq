package com.wehotel.rmq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

/**
 * Created by liang.zhang on 2017/7/26.
 */
@Component("testQueueListenter")
public class TestQueueListener {
    private Logger logger = LoggerFactory.getLogger(TestQueueListener.class);

    public void onMessage(String message) throws Exception {
        logger.info(message);
        throw new Exception();
    }
}
