package gostyle.api.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PromotionRepositoryTest {

    private final static Logger log = LoggerFactory.getLogger(PromotionRepositoryTest.class);

    @Autowired
    PromotionRepository repository ;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void findAll(){
        repository.findAll().forEach(a->log.trace("{}",a));
    }
}