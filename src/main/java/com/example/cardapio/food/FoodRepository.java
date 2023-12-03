package com.example.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;

//essa interface eh so para EXTENDER o Jpa Repository e assim conseguir ter todos os metodos de acesso ao BD
//dessa forma nao precisa fazer mais nenhum tipo de configuracao para consultar os dados no bd
public interface FoodRepository extends JpaRepository<Food, Long> {
}
