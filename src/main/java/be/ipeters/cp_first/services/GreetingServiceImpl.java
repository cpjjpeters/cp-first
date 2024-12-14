package be.ipeters.cp_first.services;

import org.springframework.stereotype.Service;

/* carlpeters created on 14/12/2024 inside the package - be.ipeters.cp_first.services */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello everyone from baseService";
    }
}
