package com.colvara.chamadasHttp;

import org.springframework.stereotype.Service;

@Service
public class HttpService {

    public String consultaBanco(String teste){
        System.out.println("Consultou no banco");
        return teste;
    }
}
