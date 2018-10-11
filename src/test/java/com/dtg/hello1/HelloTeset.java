package com.dtg.hello1;

import com.dtg.hello1.web.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@SpringBootTest
public class HelloTeset {
    private MockMvc mvc;

    @Before
    public void init(){
        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void hellTest(){
        try {
            mvc.perform(MockMvcRequestBuilders.post("/hello").accept(MediaType.APPLICATION_JSON_UTF8)).andDo(print());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
