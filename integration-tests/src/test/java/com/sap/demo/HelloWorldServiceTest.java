package com.sap.demo;

import org.apache.commons.io.IOUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.sap.cloud.sdk.cloudplatform.servlet.Executable;
import com.sap.cloud.sdk.testutil.MockUtil;

import static java.lang.Thread.currentThread;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.charset.StandardCharsets;

@RunWith( SpringRunner.class )
@WebMvcTest
public class HelloWorldServiceTest
{
    private static final MockUtil mockUtil = new MockUtil();

    @Autowired
    private MockMvc mvc;

    @BeforeClass
    public static void beforeClass()
    {
        mockUtil.mockDefaults();
    }

    @Test
    public void test() throws Exception
    {
        mockUtil.requestContextExecutor().execute(new Executable()
        {
            @Override
            public void execute() throws Exception
            {
                mvc.perform(MockMvcRequestBuilders.get("/hello"))
                    .andExpect(status().isOk())
                    .andExpect(content().json(
                        IOUtils.toString(
                            currentThread().getContextClassLoader().getResourceAsStream("expected.json"), StandardCharsets.UTF_8)));
            }
        });
    }
}
