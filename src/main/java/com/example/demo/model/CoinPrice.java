package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CoinPrice {

@JsonProperty("id")
private String id;
@JsonProperty("symbol")
private String symbol;
@JsonProperty("name")
private String name;


}