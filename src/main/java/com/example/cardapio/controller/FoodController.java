package com.example.cardapio.controller;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRequestDTO;
import com.example.cardapio.food.FoodResponseDTO;
import com.example.cardapio.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//para dizer que eh um controller
@RequestMapping("food")//aqui estou dizendo o diretorio da api a ser requisitada
public class FoodController {

    @Autowired//inidicacao ao spring que ele que vai fazer a injecao de dependencia no meu FoodController
    //entao dizemos que quando ele for instanciar a FoodControler, ele injeta essa dependencia
    private FoodRepository repository;//criando uma instancia do repository de Food(a estrutura com as funcoes do bd)
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){//indicando ao Spring q no body da aplicacao que esta os parametros p/ serem injetados

        //pro response transformamos a entidade no DTO agr o contrario, o DTO na entidade, temos q pegar o Food Request DTO p/ entidade
        Food foodData = new Food(data);

        repository.save(foodData);
        return;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll(){//retornar direto o objeto como uma lista n eh uma boa pratica, entao criamos um data transfer objetc(dto)
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        //o metodo stream pega tudo que vem do repository com findAll e coloca num funil q com map de cada objeto que vem dentro do funil
        //onde cada objeto eh transferido
        return foodList;
    }
}
