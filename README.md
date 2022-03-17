# desafio-escola-add
Desafio de seleção empresa Add

***

## API para cadastro de alunos, escola, turma e endereço

### Tecnologias utilizadas
* Linguagem JAVA
* Spring Boot
* Spring Data JPA
* Thymeleaf
* Banco de dados H2
* Documentação com Swagger

### Funcionalidades e explicação
* Relacionamento entre classes
* Cadastro de aluno com nome e data de nascimento
* Cadastro de escola
* Cadastro de turma
* Cadastro de endereço
* Em cada entidade foram implementos todos os métodos para CRUD (Create, Remove, Update, GetById, GetAll)
* De acordo com especificação do desafio foi criada tela de front-end apenas para exibir alunos e cadastrar alunos
* Foram criados 2 templates ecom Thymeleaf: aluno.html retorna a relação de alunos / form.html é onde e feito o cadastro de alunos e alterações
* Tanto o **create** quanto o **update** (métodos post e put) estão sendo realizados por um só método em **AlunoController** e no mesmo formulário (form.html)
* Nas demais classes *Controller* tanto o **create** quanto o **update** (métodos post e put) foram implementados e funcionam separadamente

### Telas

![tela-exibir-alunos](https://user-images.githubusercontent.com/69283422/158884567-d6a72221-5e8f-458f-9ce8-180880f56e8c.PNG)

***

![tela-cadastro-aluno](https://user-images.githubusercontent.com/69283422/158884616-0939824e-564a-42cc-97db-ec2349081828.PNG)
