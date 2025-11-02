# Demo: Autenticação JWT Moderna com Spring Boot

Este é um projeto de demonstração que apresenta os padrões e conceitos mais atuais para a utilização de autenticação JWT (JSON Web Token) em projetos Spring Boot com Spring Security.

## Tecnologias Utilizadas

*   Java 21
*   Spring Boot 3
*   Spring Security 6
*   Spring Data JPA
*   Maven
*   Banco de dados em memória H2

## Como Executar o Projeto

1.  Clone este repositório.
2.  Navegue até o diretório do projeto.
3.  Execute a aplicação usando o Maven:
    ```bash
    ./mvnw spring-boot:run
    ```
4.  A aplicação estará disponível em `http://localhost:8080`.

## Endpoints da API

O projeto expõe os seguintes endpoints para demonstração:

### 1. Autenticação

*   **Endpoint:** `POST /authenticate`
*   **Descrição:** Autentica um usuário e retorna um token JWT.
*   **Autenticação:** HTTP Basic Auth (usuário e senha codificados em Base64 no cabeçalho `Authorization`).
*   **Exemplo de Requisição:**
    ```http
    POST http://localhost:8080/authenticate
    Authorization: Basic dXNlcm5hbWU6cGFzc3dvcmQ=
    ```

### 2. Acesso a Recurso Privado

*   **Endpoint:** `GET /private`
*   **Descrição:** Acessa um recurso protegido que requer um token JWT válido.
*   **Autenticação:** Bearer Token (o token JWT obtido na autenticação).
*   **Exemplo de Requisição:**
    ```http
    GET http://localhost:8080/private
    Authorization: Bearer <JWT_TOKEN>
    ```

## Geração de Chaves

As chaves pública e privada utilizadas neste projeto foram geradas utilizando a seguinte ferramenta online:

[https://emn178.github.io/online-tools/rsa/key-generator/](https://emn178.github.io/online-tools/rsa/key-generator/)
![Print da Aplicação](documents/RSA_Key_Generator_example.png)
