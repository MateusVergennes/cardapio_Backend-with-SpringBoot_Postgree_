package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

//para dizer que eh uma classe repository
@Table(name = "foods")//estou passando o nome da tabela no database
@Entity(name = "foods")//nome da entidade
@Getter
@NoArgsConstructor//constructor sem argumentos
@AllArgsConstructor//um constructor com argumentos
@EqualsAndHashCode(of = "id")//id eh a representacao unica da tabela 'food'
public class Food {
    //declaracao de colunas dentro da tabela
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//eh a PRIMARY KEY e gerada automaticamente com uma estrategia
    private Long id;
    private String title;
    private String image;
    private Integer price;

    //constructor p/ receber informacoes do tipo DTO
    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }
}
