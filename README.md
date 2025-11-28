# E-Commerce API — Java 25 + Spring Boot 4 + PostgreSQL

Este projeto é um e-commerce em desenvolvimento utilizando tecnologias modernas do ecossistema Java.

## 🚀 Stack utilizada

- **Java 25**
- **Spring Boot 4**
- **PostgreSQL**
- **Docker / Docker Compose**
- **Gradle**
- **Clean Architecture + DDD (em construção)**

---

## 📦 Executando o PostgreSQL com Docker Compose

O arquivo `docker-compose.yml` utiliza o seguinte serviço:

```yaml
services:
  postgres:
    image: postgres:latest
    environment:
      POSTGRES_USER: myuser
      POSTGRES_PASSWORD: mypassword
      POSTGRES_DB: mydatabase
    volumes:
      - postgres-db-volume:/var/lib/postgresql/MAJOR/docker
    ports:
      - "5432:5432"
    networks:
      - my-app-network

volumes:
  postgres-db-volume:
    driver: local

networks:
  my-app-network:
    driver: bridge
```

## ▶️ Subindo o container

```bash
docker compose up -d
```

## 📥 Parando os containers

```bash
docker compose down
```

## 🗄 Conectando no PostgreSQL do container

```bash
docker exec -it postgres psql -U myuser -d mydatabase
```


## 🧠 Regra de Negócio e Objetivo do Projeto

O objetivo principal deste projeto é criar uma **API robusta de e-commerce**, aplicando conceitos modernos de arquitetura de software, boas práticas e padrões utilizados no mercado.

A API terá como foco:

- **Gerenciar produtos**
    - Cadastro, atualização, listagem e desativação
    - Controle de estoque
    - Preço (`BigDecimal`) com precisão financeira

- **Fluxo de carrinho e pedidos** (em fases futuras)
    - Adicionar e remover itens do carrinho
    - Calcular totais e aplicar regras de desconto
    - Fechar pedido e reduzir estoque automaticamente

- **Cadastro e autenticação de usuários**
    - Login com JWT
    - Perfis de cliente e administrador

- **Catálogo público**
    - Listagem de produtos disponíveis
    - Filtros e paginação

Além do funcionamento básico, o projeto também tem como objetivo servir como **plataforma de estudo e aprofundamento em arquitetura**, permitindo experimentar:

- **DDD (Domain-Driven Design)**
- **Separação clara entre camadas (domain, application, infra e web)**
- **Clean Architecture**
- **Persistência com PostgreSQL usando Spring Data JPA**
- **Métricas e observabilidade (incluindo possíveis integrações futuras com eBPF)**
- **Boas práticas de modelagem de dados e APIs REST**

Este repositório será evoluído gradualmente, incorporando funcionalidades reais de um e-commerce, mas sempre preservando o foco em código limpo, testável e bem organizado.
