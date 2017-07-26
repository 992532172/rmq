package com.wehotel.rmq.producer;

import com.wehotel.rmq.BaseTest;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.springframework.beans.factory.annotation.Autowired;
import com.wehotel.rmq.producer.TestProducerImpl;

/**
 * TestProducerImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>07/26/2017</pre>
 */
public class TestProducerImplTest extends BaseTest {
    @Autowired
    private TestProducerImpl testProducer;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: sendMessage(String queue, String msg)
     */
    @Test
    public void testSendMessage() throws Exception {
        testProducer.sendMessage("", "{\"name\":\"liang.zhang\"}");
    }


} 
