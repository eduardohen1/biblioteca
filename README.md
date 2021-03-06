# Biblioteca #
Controle de livros

### Cenário: ###
* Uma livraria da cidade teve um aumento no número de seus exemplares e está com um problema para identificar todos os livros que possui em estoque. Para ajudar a livraria foi solicitado a você desenvolver uma aplicação MVC para gerenciar estes exemplares.

### Requisitos: ###
* O sistema deverá mostrar todos os livros cadastrados ordenados de forma ascendente pelo nome;
* O sistema deverá permitir criar, editar e excluir um livro;
* Os livros devem ser persistidos em um banco de dados.

### Outros Requisitos: ###
* Para a persistência dos dados deve ser utilizado algum framework de ORM.

### Observações: ###
* O sistema deverá ser desenvolvido na plataforma .NET ou JAVA;
* O código deve ser disponibilizado no Github;
* A internet é sua amiga

## Banco de dados ##
* Script na pasta do projeto - biblioteca.sql
* MySQL
* Parâmetros de conexão no 'application.properties'

## Acesso ao sistema ##
* Foi criado dois usuários, via banco de dados:
** U: admin S: admin => Administrador
** U: teste S: teste => Usuário para somente pesquisa