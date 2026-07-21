# ClienteAPI

README básico do projeto **ClienteAPI**, uma API REST em Spring Boot para cadastro e consulta de clientes e usuários.

## Tecnologias
- Java 21
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- Spring Security
- PostgreSQL
- MapStruct
- Lombok

## Funcionalidades principais
- Cadastro de clientes (`POST /clientes`)
- Atualização de clientes (`PUT /clientes/{id}`)
- Busca de cliente por ID (`GET /clientes/{id}`)
- Busca de cliente por CPF (`GET /clientes/cpf?cpf=...`)
- Pesquisa paginada por parâmetros (`GET /clientes/pesquisa`)
- Remoção de cliente (`DELETE /clientes/{id}`)
- Cadastro de usuários (`POST /usuarios`)

## Estrutura do projeto
- `src/main/java/.../controller`: endpoints da API
- `src/main/java/.../service`: regras de negócio
- `src/main/java/.../repository`: acesso a dados
- `src/main/java/.../model/entity`: entidades JPA
- `src/main/java/.../mapper`: mapeamentos DTO/entidade
- `src/main/resources/application.yaml`: configuração da aplicação

## Como executar
1. Configure um banco PostgreSQL.
2. Ajuste `src/main/resources/application.yaml` com suas credenciais.
3. Execute:

```bash
./mvnw spring-boot:run
```

## Como rodar testes
```bash
./mvnw test
```
