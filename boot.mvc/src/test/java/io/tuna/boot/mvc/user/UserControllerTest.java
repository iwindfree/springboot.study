package io.tuna.boot.mvc.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {
    @Autowired
    MockMvc mockMvc;
    @Test
    public void hello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string( "hello"));

    }
    @Test
    public void createUser_JSON() throws Exception {
        String userJson="{\"username\":\"knamkim\",\"password\":\"1234\"}";
        mockMvc.perform(post("/users/create")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON) // 응답을 json 으로 받겠다.
                .content(userJson)) // 여기까지 요청을 만들고 이후부터 응답을 확인
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.username",
                        is(equalTo("knamkim"))));
    }

    @Test
    public void createUser_XML() throws Exception {
        String userJson="{\"username\":\"knamkim\",\"password\":\"1234\"}";
        mockMvc.perform(post("/users/create")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_XML) // 응답을 xml 로 받겠다.
                .content(userJson)) // 여기까지 요청을 만들고 이후부터 응답을 확인
                 .andExpect(status().isOk())
                .andExpect(xpath("/User/username").string("knamkim"));

    }

}
