package gostyle.api.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PromotionServiceImplTest {

    private final static Logger log = LoggerFactory.getLogger(PromotionServiceImplTest.class);

    @Autowired
    private PromotionService service;

    @BeforeEach
    void setUp() {
        log.trace("PromotionService présent");
        assertNotNull(service, "ERREUR PromotionService manquant");
        log.trace("PromotionService Ok");
    }

    // test la récupération de toutes les promotions
    @Test
    void getAll() {
        var lst = service.getAll();
        lst.forEach(a -> log.trace("{}",a));
        log.trace("nombre de promotions :{}",lst.size());
    }


    // test la récupération d'une pormotion
    @Test
    void getOne() {
        var promotion = service.getOne(1L);
        assertEquals(promotion.getId(), 1);
    }
}
