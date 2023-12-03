package com.example.cardapio.food;
//utilizamos dados do tipo record para representar dados estaticos
public record FoodResponseDTO(Long id, String title, String image, Integer price) {//assim ja consigo representar o record
    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}