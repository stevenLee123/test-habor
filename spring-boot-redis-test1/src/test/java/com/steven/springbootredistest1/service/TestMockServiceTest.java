/**
 * @Author： supconit
 * @Date： 2021/1/14
 * @Description：
 */
package com.steven.springbootredistest1.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMockServiceTest {

    @MockBean
    private TestMockService testMockService;

    @Test
    public void testMock(){
        BDDMockito.given(this.testMockService.getSomething())
                .willReturn("hello world");
        String result = testMockService.getSomething();
        Assert.assertTrue(result.equals(result));
    }
}
