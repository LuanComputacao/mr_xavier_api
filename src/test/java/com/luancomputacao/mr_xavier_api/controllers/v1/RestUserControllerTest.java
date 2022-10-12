package com.luancomputacao.mr_xavier_api.controllers.v1;

import com.luancomputacao.mr_xavier_api.api.v1.model.UserDTO;
import com.luancomputacao.mr_xavier_api.controllers.UserController;
import com.luancomputacao.mr_xavier_api.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


class UserRestControllerTest extends AbstractRestControllerTest {

    public static final String NAME = "Luan";

    @Mock
    UserService userService;

    @InjectMocks
    UserController userController;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(userController)
                .setControllerAdvice(new RestResponseEntityExceptionHandler())
                .build();
    }

    @Test
    public void testListUsers() throws Exception {
        UserDTO userDTO1 = new UserDTO();
        userDTO1.setId(1L);
        userDTO1.setName(NAME);

        UserDTO userDTO2 = new UserDTO();
        userDTO2.setId(1L);
        userDTO2.setName(NAME);

        List<UserDTO> userDTOS = Arrays.asList(userDTO1, userDTO2);

        when(userService.findAllDto()).thenReturn(userDTOS);

        mockMvc.perform(get(UserRestController.BASE_URL).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) jsonPath("$.users", hasSize(2)));
    }
}