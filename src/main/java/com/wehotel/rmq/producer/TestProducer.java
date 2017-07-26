package com.wehotel.rmq.producer;

/**
 * Created by liang.zhang on 2017/7/26.
 */
public interface TestProducer {
    void sendMessage(String queue, String msg);
}
