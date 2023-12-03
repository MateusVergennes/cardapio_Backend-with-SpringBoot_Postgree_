# 🌐🍔Aplicação Spring Boot com Postgree de um cardapio digital🍕🌟

Este repositório contém uma aplicação desenvolvida em Java Spring Boot que utiliza os métodos HTTP GET e POST para interação com um banco de dados PostgreSQL. A aplicação atua como backend, fornecendo endpoints para consulta e manipulação dos dados, enquanto o frontend consome essa API para exibição e interação com os dados.

## Configuração do Projeto

### Spring Boot e PostgreSQL 🛠️🐘

A configuração do Spring Boot e do banco de dados PostgreSQL pode ser encontrada no diretório [`/config`](/config). Nesse diretório, você encontrará os arquivos de configuração necessários para a aplicação se comunicar com o banco de dados.

### Frontend🌐

O frontend que consome esta API está localizado no repositório [![GitHub last commit](https://img.shields.io/github/last-commit/MateusVergennes/cardapio_Frontend-with-ReactVite_Axios_TypeScript)](https://github.com/MateusVergennes/cardapio_Frontend-with-ReactVite_Axios_TypeScript). Certifique-se de conferir o repositório do frontend para obter mais informações sobre a interface do usuário e como ela interage com este backend.


## Utilização da API

A API fornece endpoints para acessar e manipular dados no banco de dados PostgreSQL. Abaixo estão alguns exemplos de como usar os principais métodos:

### Método GET 📤

- **Endpoint:** `/food`
- **Descrição:** Recupera todos os dados do banco de dados.
- **Exemplo de Requisição:**
  ```bash
  curl -X GET http://localhost:8080/food
  ```
  ### Método POST📥

  - **Endpoint:** `/food`
  - **Descrição:** Adiciona novos dados ao banco de dados.
  - **Exemplo de Requisição:**
    ```bash
    curl -X POST -H "Content-Type: application/json"
    {
        "price": 35,
        "title": "pizza",
        "image": "https://fotos.com/pizza.png"
    }
    ```
## Contribuição🤝

Sinta-se à vontade para contribuir para este projeto. Se você encontrar problemas ou tiver sugestões, por favor, abra uma issue. Estamos ansiosos para receber seu feedback!

## Licença📜

Este projeto está licenciado sob a [Licença MIT](LICENSE).
