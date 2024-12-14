package be.ipeters.cp_first.web.controller;

import be.ipeters.cp_first.services.GreetingService;
import be.ipeters.cp_first.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

//    public MyController(GreetingService greetingService) {
    public MyController( ) {
//        this.greetingService = greetingService;
        this.greetingService = new GreetingServiceImpl();
    }


    public String sayHello(){
        System.out.println("I'm in the controller");

//        return  "Hello everyone";
        return greetingService.sayGreeting();
    }
}
