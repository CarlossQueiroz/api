package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//A anotação @RestController indica que a classe é um Controller e que seus métodos devem retornar diretamente o conteúdo da resposta, sem a necessidade de utilizar uma view. Dessa forma, o Spring consegue mapear corretamente os endpoints e redirecionar as requisições para os métodos adequados.
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String olaMndo(){
        return "Hello World!";
    }
}
