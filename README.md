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


