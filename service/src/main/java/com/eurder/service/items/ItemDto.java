package com.eurder.service.items;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import item.Item;


public class ItemDto {
    @JsonView(View.Public.class)
    private String name;
    @JsonView(View.PublicWithSummary.class)
    private String description;
    @JsonView(View.Public.class)
    private int numberInStock;
    @JsonView(View.Restricted.class)
    private double price;


    @JsonCreator
    public ItemDto(@JsonProperty("name") String name, @JsonProperty("description") String description
            , @JsonProperty("numberInStock") int numberInStock, @JsonProperty("price") double price) {
        this.name = name;
        this.description = description;
        this.numberInStock = numberInStock;
        this.price = price;
    }


    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    public int getNumberInStock() {
        return numberInStock;
    }


    public double getPrice() {
        return price;
    }

}
