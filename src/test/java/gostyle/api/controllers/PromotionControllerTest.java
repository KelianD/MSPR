package gostyle.api.controllers;

import gostyle.api.services.PromotionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = PromotionController.class)
public class PromotionControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private PromotionService service;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAllPromotion() throws Exception {
        mvc.perform(get("http://msprapiepsi.herokuapp.com/promotion/all"))
                .andExpect(status().isOk());
    }

    @Test
    void getOne() throws Exception {
        mvc.perform(get("http://msprapiepsi.herokuapp.com/promotion/1"))
                .andExpect(status().isOk());
    }
}
