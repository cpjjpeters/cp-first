package be.ipeters.cp_first.web.controller;

import be.ipeters.cp_first.services.GreetingService;
import be.ipeters.cp_first.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

/* carlpeters created on 14/12/2024 inside the package - be.ipeters.cp_first.web.controller */
@Controller
public class PropertyInjectedController {

    GreetingService greetingService;


    public String sayHello(){
        System.out.println("I'm in the  PropertyInjected controller");

//        return  "Hello everyone";
        return greetingService.sayGreeting();
    }
}
