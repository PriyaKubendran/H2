package com.example.H2Database;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.stubbing.Stubber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.match.ContentRequestMatchers;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@DataJpaTest

class SnipetControllerTest {

    @Mock SnipetRepository snipetRepository;
    @InjectMocks SnipetService snipetService;

    @Test
    public void getMessage() {


//        @InjectMock SnipetService snipetService
        // Given
//        Snipet message = new Snipet();
//        message.setMessage("test");
//        entityManager.persist(message);
//        entityManager.flush();
//        snipetService.post(message);
//        Snipet test = snipetRepository.Post(message.getMessage());
//        assertThat(test.getMessage()).isEqualTo(message.getMessage());
    }






//    @Mock SnipetService snipetService;
//    @InjectMocks SnipetController snipetController;
//    @Captor
//    ArgumentCaptor argumentCaptor;
//    @Test
//    void getAllMessage() {
//        snipetController.getAllMessages();
//        assertEquals(0, snipetController.getAllMessages().size());
//        Mockito.when(snipetController.getAllMessages().size()).thenReturn(5);
//        assertEquals(5, snipetController.getAllMessages().size());
//
//
//    }
//    @MockBean
//    private SnipetService service;
//    @Autowired
//    private MockMvc mvc;
//    @DisplayName("Testing Display a specific messages")
//    @Test
//    void getAllMessages() throws Exception {
//        // Set up Mock service
//
//        Snipet mockedSnipet = new Snipet();
//        doReturn(mockedSnipet).when(service).getById(1);
//        mvc.perform(MockMvcRequestBuilders.get("/api/message/${id}", 1))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect((ResultMatcher) jsonPath("$id", is(1)))
//                .andExpect((ResultMatcher) jsonPath("$message", is("This is the first message")));
//    }

//    @DisplayName("Testing Message not found")
//    @Test
//    void GetMessageIdNotFound() throws Exception {
//        // Set up mocked service
//        doReturn(Optional.empty()).when(service).getById(1);
//        mvc.perform(MockMvcRequestBuilders.get("/api/message/{id}", 1))
//                .andExpect(status().isNotFound());
//    }

//    @DisplayName("Testing a post message")
//    @Test
//    void postMessage() throws Exception{
        // Set up mocked service
//        String message = "This is a posted message";
//        Snipet mockPost = snip.post(message);
//        doReturn(mockPost).when(service).post(any());
//        mvc.perform(post("/api/message/"))
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect((ResultMatcher) jsonPath("message", is("This is a posted message")))
//                .andExpect(status().isCreated())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect((ResultMatcher) jsonPath("$message", is("This is a posted message")));
// }

}