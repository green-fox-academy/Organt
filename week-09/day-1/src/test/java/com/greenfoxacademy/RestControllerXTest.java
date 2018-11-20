package com.greenfoxacademy;

import com.greenfoxacademy.controller.RestControllerX;
import com.greenfoxacademy.model.UntilNumber;
import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.nio.charset.Charset;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(RestControllerX.class)

public class RestControllerXTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void doubling_succesful() throws Exception {
        mockMvc.perform(get("/doubling?input=15"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.received", is(15)))
                .andExpect(jsonPath("$.result", is(30)))
                .andExpect(jsonPath("$.error").doesNotExist());
    }

    @Test
    public void greeter_succesful() throws Exception {
        mockMvc.perform(get("/greeter?name=Petike&title=student"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petike, my dear student!")));
    }

    @Test
    public void appenda_succesful() throws Exception {
        mockMvc.perform(get("/appenda/kuty"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.appended", is("kutya")));
    }

    @Test
    public void appenda_notSuccesful() throws Exception {
        mockMvc.perform(get("/appenda"))
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void dountil_succesful() throws Exception {
        MockHttpServletRequestBuilder builder =
                MockMvcRequestBuilders.post("/dountil/sum")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"until\" : 5}");
        this.mockMvc.perform(builder)
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(15)));
    }

    @Test
    public void arraySum_succesful() throws Exception {
        MockHttpServletRequestBuilder builder =
                MockMvcRequestBuilders.post("/arrays")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"what\": \"sum\", \"numbers\": [1,2,5,10]}");
        this.mockMvc.perform(builder)
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(18)));
    }

    @Test
    public void arrayMultiply_succesful() throws Exception {
        MockHttpServletRequestBuilder builder =
                MockMvcRequestBuilders.post("/arrays")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"what\": \"multiply\", \"numbers\": [1,2,5,10]}");
        this.mockMvc.perform(builder)
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(100)));
    }

    @Test
    public void arrayDouble_succesful() throws Exception {
        MockHttpServletRequestBuilder builder =
                MockMvcRequestBuilders.post("/arrays")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"what\": \"double\", \"numbers\": [1,2,5,10]}");
        this.mockMvc.perform(builder)
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", IsEqual.equalTo(Arrays.asList(2,4,10,20))));


    }
}