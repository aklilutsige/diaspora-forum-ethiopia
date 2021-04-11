package et.ethiopia_info.administrative_divisions.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControllers {
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello ethiopia !";
    }
}
