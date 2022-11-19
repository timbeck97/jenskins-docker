package docker.jenkins.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String helloWorld(){
        return "<h1>HELLO WORLD!!!</h1><br/><h1>TEXTO ALTERADO JENKINS E DOCKER FUNCIONANDO</h1>";
    }
}
