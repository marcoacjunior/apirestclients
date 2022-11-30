## API REST Clientes </br>

 ## Projeto Spring Boot 2.4.x contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas: </br>

•	Busca paginada de recursos </br>
•	Busca de recurso por id </br>
•	Inserir novo recurso </br>
•	Atualizar recurso </br>
•	Deletar recurso </br>

 ## Ambiente de testes configurado acessando o banco de dados H2, Maven como gerenciador de dependência, e Java 11 como linguagem. </br>
## Testes no Postman </br>
## Busca paginada de clientes
GET /clients?page=0&linesPerPage=6&direction=ASC&orderBy=name

## Busca de cliente por id
GET /clients/1

## Inserção de novo cliente
POST /clients </br>
{ </br>
  "name": "Maria Silva", </br>
  "cpf": "12345678901", </br>
  "income": 6500.0, </br>
  "birthDate": "1994-07-20T10:30:00Z", </br>
  "children": 2 </br>
}

## Atualização de cliente
PUT /clients/1 </br>
{ </br>
  "name": "Maria Silvaaa", </br>
  "cpf": "12345678901", </br>
  "income": 6500.0, </br>
  "birthDate": "1994-07-20T10:30:00Z", </br>
  "children": 2 </br>
}

## Deleção de cliente
DELETE /clients/1
