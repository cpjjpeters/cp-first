package be.ipeters.cp_first;

import be.ipeters.cp_first.web.controller.CpRestController;
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

    @Autowired
    CpRestController   cpRestController;

    @Test
    void contextLoads() {
        assertNotNull(applicationContext);
    }

    @Test
    void testControllerFromCtx(){
        		CpRestController cpRestController = applicationContext.getBean(CpRestController.class);
//		System.out.println(" In main method");
		System.out.println(cpRestController.getCpById(UUID.randomUUID()));
    }
    @Test
    void testAutowiredController (){
        System.out.println(cpRestController.sayHello());
    }
}