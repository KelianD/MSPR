package gostyle.api.services;


import gostyle.api.entities.Promotion;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class PromotionServiceImplTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    private final static Logger log = LoggerFactory.getLogger(PromotionServiceImplTest.class);

    @Mock
    @Autowired
    private PromotionService service;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @BeforeEach
    void setUp() {
        log.trace("PromotionService présent");
        assertNotNull(service, "ERREUR PromotionService manquant");
        log.trace("PromotionService Ok");
    }

    @Test
    void getAll() {
        var lst = service.getAll();
        lst.forEach(a -> log.trace("{}",a));
        log.trace("nombre de promotions :{}",lst.size());
    }

    @Test
    void getOne() {
        Mockito.when(service.getOne(1L)).thenReturn(new Promotion());
        Promotion promotion = service.getOne(1L);
        assertEquals("test", promotion);
    }

    @Test
    void create() {
    }
}
