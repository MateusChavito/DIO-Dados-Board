# Sistema de Gerenciamento de Cartões e Quadros

Este projeto é um sistema de gerenciamento de cartões e quadros desenvolvido como parte de um desafio da DIO. Ele permite a criação, movimentação e gerenciamento de cartões dentro de quadros, seguindo boas práticas de desenvolvimento.

## 📁 Estrutura do Projeto

O projeto está estruturado da seguinte forma:

```
📂 src/main/java/br/com/dio
├── 📂 ui          # Camada de interface do usuário
├── 📂 service     # Serviços que contêm a lógica de negócio
├── 📂 persistence # Camada de persistência de dados
│   ├── 📂 config      # Configurações do banco de dados
│   ├── 📂 converter   # Conversores de dados
│   ├── 📂 dao         # Data Access Objects (DAO) para manipulação dos dados
│   ├── 📂 entity      # Entidades do banco de dados
│   ├── 📂 migration   # Scripts de migração do banco de dados
├── 📂 exception   # Tratamento de exceções personalizadas
├── 📂 dto        # Data Transfer Objects para comunicação entre camadas
```

## 🛠 Tecnologias Utilizadas
- **Java** (JDK 17+)
- **JDBC** para manipulação do banco de dados
- **MySQL** como banco de dados relacional
- **Maven** para gerenciamento de dependências

## ⚙️ Funcionalidades
- Criar, atualizar e deletar quadros e colunas
- Criar e mover cartões entre colunas
- Bloquear e desbloquear cartões
- Listar quadros e colunas com detalhes


## 🚀 Como Executar o Projeto
1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```
2. Configure o banco de dados MySQL e execute os scripts de migração.
3. Compile e execute o projeto:
   ```sh
   mvn clean install
   java -jar target/nome-do-projeto.jar
   ```

## 📌 Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou pull request com sugestões e melhorias.

## 📝 Licença
Este projeto está sob a licença MIT. Para mais detalhes, consulte o arquivo LICENSE.

