package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    Integer quantidadeGets = 0;
    Integer quantidadePost = 0;
    Integer quantidadePut = 0;
    Integer quantidadeDelete = 0;

    public Integer quantidadeGets(){
        return quantidadeGets++;
    }

    public Integer quantidadePost(){
        return quantidadePost++;
    }

    public Integer quantidadePut(){
        return quantidadePut++;
    }

    public Integer quantidadeDelete(){
        return quantidadeDelete++;
    }
}
