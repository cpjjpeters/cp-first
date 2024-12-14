package be.ipeters.cp_first.web.controller;

import org.springframework.stereotype.Controller;

/* carlpeters created on 14/12/2024 inside the package - be.ipeters.cp_first.web.controller */
@Controller
public class MyController {

    public String sayHello(){
        System.out.println("I'm in the controller");

        return  "Hello everyone";
    }
}
