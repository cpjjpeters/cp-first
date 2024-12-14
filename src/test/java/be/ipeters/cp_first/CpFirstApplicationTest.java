package be.ipeters.cp_first;

import be.ipeters.cp_first.web.controller.CpRestController;
import be.ipeters.cp_first.web.controller.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CpFirstApplicationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void contextLoads() {
        assertNotNull(applicationContext);
    }

}