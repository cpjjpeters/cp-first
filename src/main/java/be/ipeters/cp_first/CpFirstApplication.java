package be.ipeters.cp_first;

import be.ipeters.cp_first.web.controller.CpRestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.UUID;

@SpringBootApplication
public class CpFirstApplication {

	public static void main(String[] args) {

SpringApplication.run(CpFirstApplication.class, args);

//		ApplicationContext ctx = SpringApplication.run(CpFirstApplication.class, args);
//		CpRestController cpRestController = ctx.getBean(CpRestController.class);
//		System.out.println(" In main method");
//		System.out.println(cpRestController.getCpById(UUID.randomUUID()));

	}

}
