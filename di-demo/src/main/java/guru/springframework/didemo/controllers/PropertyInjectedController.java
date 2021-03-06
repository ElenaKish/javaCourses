package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingService greetingService;

    public String sayHello() {
        return getGreetingService().sayGreeting();
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
}
