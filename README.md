# Product Service

## Descrição

Microservice responsável pelo cadastro e consulta de produtos, utilizando MongoDB como camada de persistência.

## Funcionalidades

- Cadastro de produtos
- Consulta de todos os produtos cadastrados
- Persistência de documentos no MongoDB
- Documentação da API com OpenAPI e Swagger
- Monitoramento com Actuator, métricas e Prometheus

## Tecnologias

- **Spring Framework** — Injeção de Dependências, Beans e Configurações
- **Spring Boot** — Autoconfiguração e Actuator
- **Spring Web MVC** — API REST e Controllers
- **Spring Data MongoDB** — Persistência e consultas em documentos
- **MongoDB** — Banco de dados NoSQL
- **Springdoc OpenAPI** — Documentação da API
- **Micrometer e Prometheus** — Métricas da aplicação
- **Testcontainers** — Testes de integração com MongoDB isolado

## Pré-requisitos

- Java Development Kit (JDK) 21 ou mais recente
- Maven
- Docker
- Postman ou outra ferramenta para testar APIs REST

## Execução

Para iniciar o MongoDB:

```bash
docker compose up -d
```

Para executar o serviço:

```bash
./mvnw spring-boot:run
```

O serviço disponibiliza `POST /api/product` para cadastro e `GET /api/product` para consulta dos produtos. A porta deve ser definida no ambiente de execução e, quando usado pelo API Gateway, o serviço é esperado em `http://localhost:8080`.
