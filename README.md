🔧 Controle de Serviços

Sistema web desenvolvido para auxiliar no controle e gerenciamento de serviços de assistência técnica, permitindo cadastrar, visualizar, editar e excluir serviços realizados em equipamentos de clientes.

O projeto foi desenvolvido como parte da formação em Análise e Desenvolvimento de Sistemas (ADS), utilizando tecnologias de desenvolvimento web e banco de dados.

📋 Sobre o projeto

O sistema foi pensado para uma assistência técnica que precisa organizar os serviços recebidos, mantendo informações como:

Cliente
Equipamento
Problema relatado
Responsável pelo serviço
Status do atendimento
Valor do serviço
Observações
Data de entrada

A aplicação permite realizar as principais operações de gerenciamento de registros (CRUD):

✅ Cadastrar serviços
📋 Listar serviços
✏️ Editar serviços
🗑️ Excluir serviços
🚀 Tecnologias utilizadas
Backend
Java 21
Spring Boot 3.5.5
Spring Web
Spring Data JPA
Maven
Banco de dados
PostgreSQL
Supabase
Frontend
HTML5
CSS3
JavaScript
Versionamento
Git
GitHub
🏗️ Estrutura do projeto
techservice/
├── src/
│   └── main/
│       ├── java/
│       │   └── org/example/techservice/
│       │       ├── TechserviceApplication.java
│       │       ├── Servico.java
│       │       ├── ServicoController.java
│       │       └── ServicoRepository.java
│       │
│       └── resources/
│           ├── static/
│           │   └── index.html
│           └── application.properties
│
├── pom.xml
└── README.md
🔄 Funcionamento

O usuário acessa a interface web e cadastra um novo serviço informando os dados do cliente e do equipamento.

As informações são enviadas para o backend através de uma API REST desenvolvida com Spring Boot.

O backend utiliza o Spring Data JPA para realizar a comunicação com o banco de dados PostgreSQL hospedado no Supabase.

O sistema disponibiliza os seguintes endpoints:

Método	Endpoint	Função
GET	/servicos	Lista todos os serviços
GET	/servicos/{id}	Busca um serviço
POST	/servicos	Cadastra um serviço
PUT	/servicos/{id}	Atualiza um serviço
DELETE	/servicos/{id}	Exclui um serviço
🗄️ Banco de dados

O sistema utiliza PostgreSQL através do Supabase.

A principal tabela utilizada é:

servicos

Ela armazena os dados necessários para o gerenciamento dos atendimentos da assistência técnica.

▶️ Como executar o projeto
1. Clonar o repositório
   git clone https://github.com/HigorSouzaDev/controle-servicos-Deytech.git
2. Abrir o projeto

Abra o projeto utilizando uma IDE compatível com Java, como o IntelliJ IDEA.

3. Configurar o banco de dados

Configure as informações de conexão com o PostgreSQL no arquivo:

src/main/resources/application.properties

A senha do banco deve ser informada através da variável de ambiente:

DB_PASSWORD
4. Executar a aplicação

Execute a classe:

TechserviceApplication

Após iniciar o Spring Boot, acesse:

http://localhost:8080
🎯 Objetivo acadêmico

O projeto tem como objetivo aplicar, de forma prática, conceitos estudados no curso de Análise e Desenvolvimento de Sistemas, incluindo:

Programação orientada a objetos
Desenvolvimento de aplicações web
APIs REST
Persistência de dados
Banco de dados relacional
Arquitetura básica de aplicações backend
Versionamento de código com Git e GitHub
👨‍💻 Autor

Higor Souza

Projeto desenvolvido para fins acadêmicos e de aprendizado em desenvolvimento de sistemas.