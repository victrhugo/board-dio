# 🧩 Board - Projeto Prático DIO

Este projeto foi desenvolvido como parte do desafio prático da Digital Innovation One (DIO), utilizando arquitetura MVC com Spring Boot, DTO, DAO, e camadas separadas.

## 🔧 Tecnologias

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok

## ▶️ Como executar

```bash
./mvnw spring-boot:run
```

## 🧪 Endpoints disponíveis

| Método | Rota                  | Ação                           |
|--------|-----------------------|--------------------------------|
| GET    | `/tasks`              | Listar todas as tarefas        |
| POST   | `/tasks`              | Criar uma nova tarefa          |
| PUT    | `/tasks/{id}/complete`| Marcar tarefa como concluída   |
| DELETE | `/tasks/{id}`         | Excluir uma tarefa             |

## ✅ Proposta

Criação de um CRUD simples com boas práticas em camadas (Controller, Service, Repository, DTO).

## 📂 Estrutura de Pastas

```
src/main/java/com/victhugo/board/
├── controller
├── dto
├── model
├── repository
├── service
└── BoardApplication.java
```

## 💾 Banco de Dados

- H2 Console disponível em: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:boarddb`
