package projeto.projeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Api")
public class testcontroller {
  
  @GetMapping("/primeiroProjeto")
  public String test() {
    return "Meu primeior teste com Spring Boot!";
  }
}
