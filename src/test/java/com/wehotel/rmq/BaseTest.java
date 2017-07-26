package com.wehotel.rmq;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by liang.zhang on 2017/7/26.
 */
@ContextConfiguration(locations = {
        "classpath:/spring/config-rabbitmq.xml"
})
public class BaseTest extends AbstractJUnit4SpringContextTests {

}
