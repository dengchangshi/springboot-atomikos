package com.gitee.taven;

import com.gitee.taven.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ClassName: 类名
 * Description: 描述信息
 *
 * @Author: dengchangshi
 * @Date: 2021/4/23 11:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTests {

    @Autowired
    private TestService testService;

    @Test
    public void contextLoads() {
        testService.testJTA();
    }
}
