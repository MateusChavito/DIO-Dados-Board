# 📌 Projeto: Giro.Tech - Desafio Técnico Backend

## 📖 Descrição
Este projeto consiste na criação de uma API REST utilizando Java Spring Boot, seguindo boas práticas de desenvolvimento e o padrão arquitetural MVC. O objetivo é permitir a manipulação de dados financeiros, incluindo informações sobre moedas, taxas de câmbio, investidores e investimentos.

## 🚀 Tecnologias Utilizadas
- **Java 17**
- **Spring Boot** (Spring Web, Spring Data JPA, Spring Validation)
- **Banco de Dados Relacional** (MySQL ou PostgreSQL)
- **Hibernate** (JPA)
- **Lombok**
- **Maven**
- **Docker** (Opcional)

## 📂 Estrutura do Projeto
```
/src/main/java/br/com/dio/
├── controller   # Controladores REST
├── service      # Camada de serviço
├── repository   # Repositórios (DAO)
├── entity       # Entidades do banco de dados
├── dto          # Data Transfer Objects (DTOs)
├── exception    # Manipulação de erros
└── config       # Configurações do projeto
```

## 🛠 Configuração e Execução do Projeto
### 1️⃣ Clonar o repositório:
```bash
git clone https://github.com/seu-usuario/giro-tech-backend.git
cd giro-tech-backend
```

### 2️⃣ Configurar o Banco de Dados
Edite o arquivo `application.properties` para configurar a conexão com o banco:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/giro_tech
spring.datasource.username=root
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update
```

### 3️⃣ Compilar e Executar o Projeto
```bash
mvn clean install
mvn spring-boot:run
```

## 📌 Endpoints da API
| Método | Endpoint | Descrição |
|---------|----------|------------|
| `POST` | `/investidores` | Cadastra um novo investidor |
| `GET`  | `/investidores/{id}` | Obtém dados de um investidor |
| `PUT`  | `/investidores/{id}` | Atualiza um investidor |
| `DELETE` | `/investidores/{id}` | Remove um investidor |
| `GET`  | `/moedas` | Lista todas as moedas |
| `POST` | `/investimentos` | Registra um investimento |

## ✅ Testes e Monitoramento
- Testes unitários com JUnit e Mockito
- Monitoramento com Spring Boot Actuator

## 📜 Licença
Este projeto está sob a licença MIT. Sinta-se à vontade para usar e contribuir!

---
Replicado do curso da DIO por **Mateus** 🚀

