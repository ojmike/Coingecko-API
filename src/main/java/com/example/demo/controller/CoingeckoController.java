package com.example.demo.controller;

import com.example.demo.model.CoinPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@RestController
public class CoingeckoController {
    @Autowired
    WebClient webClient;

    @GetMapping(value = "/getcoinlist")
    public Flux<CoinPrice> getAllCoin(){
        return webClient.get()
                .uri("/coins/list")
                .retrieve()
                .bodyToFlux(CoinPrice.class);

    }
}
