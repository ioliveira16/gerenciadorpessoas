# Gerenciador de Pessoas - Universidade

Projeto desenvolvido como parte da disciplina de Desenvolvimento Java, com foco em criação de APIs REST utilizando Spring Boot.

## 👥 Dupla
- Igor Matheus Lopes de Oliveira (01343570)
- Lucas Manuel (01697699)

## 📋 Descrição
API para gerenciamento de pessoas de uma universidade.

- Permite cadastrar uma pessoa
- Permite buscar uma pessoa por ID

## 🧱 Tecnologias usadas
- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- Lombok
- MySQL

## 🗄️ Estrutura

- `Pessoa`: entidade principal com `nome`, `cpf`, `idade`
- `PessoaDTO`: camada de transferência de dados
- `PessoaRepository`: interface de acesso ao banco
- `PessoaController`: expõe os endpoints via REST

## 🔗 Endpoints

| Método | Rota         | Ação                      |
|--------|--------------|---------------------------|
| POST   | /pessoas     | Cria uma nova pessoa      |
| GET    | /pessoas/{id}| Busca pessoa por ID       |

## 🛠️ Configuração do banco de dados

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nome_da_base
spring.datasource.username=root
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update
