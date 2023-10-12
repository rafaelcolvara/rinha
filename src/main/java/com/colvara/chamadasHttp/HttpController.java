package com.colvara.chamadasHttp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HttpController {

    @GetMapping("/teste")
    public @ResponseBody ResponseEntity<String> getTest(){
        System.out.println("Entrou no teste");
        return new ResponseEntity<String>("Resposta do metodo", HttpStatus.OK);
    }
}
