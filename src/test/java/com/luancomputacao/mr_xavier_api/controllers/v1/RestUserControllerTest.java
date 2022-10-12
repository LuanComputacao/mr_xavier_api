package com.luancomputacao.mr_xavier_api.controllers.v1;

import com.luancomputacao.mr_xavier_api.api.v1.model.UserDTO;
import com.luancomputacao.mr_xavier_api.controllers.UserController;
import com.luancomputacao.mr_xavier_api.services.UserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


class RestUserControllerTest extends AbstractRestControllerTest {

    public static final String NAME = "Luan";

    @Mock
    UserService userService;

    @InjectMocks
    RestUserController restUserController;

    MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(restUserController)
                .setControllerAdvice(new RestResponseEntityExceptionHandler())
                .build();
    }

    @Test
    public void testListUsers() throws Exception {
        //given
        UserDTO user1 = new UserDTO();
        user1.setName("Michale");
        user1.setUserUrl(UserController.BASE_URL + "/1");

        UserDTO user2 = new UserDTO();
        user2.setName("Sam");
        user2.setUserUrl(UserController.BASE_URL + "/2");

        when(userService.findAllDto()).thenReturn(Arrays.asList(user1, user2));

        mockMvc.perform(get(UserController.BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.customers", hasSize(2)));
    }
}