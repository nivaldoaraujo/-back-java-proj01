# 📚 Projeto Back-End Java - API de Livros
## 🚀 Integrantes do projeto
 - Nivaldo
 - Arnaldo
 - Edvaldo
 - Ronaldo
## 🚀 Sobre o projeto
Este projeto é uma API REST desenvolvida em Java utilizando Spring Boot.  
O objetivo é realizar operações CRUD (Create, Read, Update, Delete) para gerenciamento de livros.

## 🛠️ Tecnologias utilizadas
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Banco de dados (MySQL / H2)
- Maven

## 📂 Estrutura do projeto
src/
├── controller
├── service
├── repository
├── model
└── dto

## ⚙️ Funcionalidades
- ✅ Cadastrar livro
- ✅ Listar livros
- ✅ Buscar livro por ID
- ✅ Atualizar livro
- ✅ Deletar livro

POST /api/livro
### 📌 Listar livros
GET /api/livro
### 📌 Buscar por ID
GET /api/livro/{id}
### 📌 Atualizar livro
PUT /api/livro/{id}
### 📌 Deletar livro
DELETE /api/livro/{id}
## 📦 Exemplo de JSON
```json
{
  "nome": "Livro Exemplo",
  "descricao": "Descrição do livro",
  "preco": 49.90,
  "imagem": "url-da-imagem"
}
▶️ Como executar o projeto
1. Clonar o repositório
git clone https://github.com/seu-usuario/seu-repo.git
2. Entrar na pasta
cd seu-repo
3. Rodar o projeto
./mvnw spring-boot:run

Ou execute pela IDE (IntelliJ ou Eclipse).

🧪 Testes

Você pode testar os endpoints utilizando:

Postman
Insomnia
🗄️ Banco de dados
H2 (teste)

Acesse:

http://localhost:8080/h2-console
MySQL

Configurar no application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/seubanco
spring.datasource.username=root
spring.datasource.password=senha
📌 Melhorias futuras
🔐 Implementar autenticação (Spring Security)
📄 Documentação com Swagger
☁️ Deploy em nuvem
🧪 Testes automatizados
👨‍💻 Autor

Desenvolvido por Nivaldo Batista
