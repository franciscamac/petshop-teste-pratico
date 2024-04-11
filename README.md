# Passos para Executar a Aplicação
## Requisitos de Ambiente 
- Sistema operacional: Windows 10, macOS Catalina, Linux Ubuntu 20.04 LTS.
- Java JDK 11 ou superior.

## Configuração do Ambiente Local
- Instale o Java JDK 11 e configure as variáveis de ambiente JAVA_HOME e PATH.

## Clonagem do Repositório
1 - Abra o terminal e execute o comando:
git clone https://github.com/franciscamac/petshop-teste-pratico.git
2 - Navegue até o diretório do projeto:
cd petshop-teste-pratico

## Configuração do Banco de Dados
Instalação do MySQL:
- Baixe e instale o MySQL a partir do site oficial: MySQL Downloads
-Siga as instruções de instalação para o seu sistema operacional.

## Criação do Banco de Dados e Usuário:
- Após a instalação, abra o MySQL Command Line Client ou qualquer cliente MySQL de sua preferência.
-Conecte-se ao servidor MySQL usando o usuário root:
mysql -u root -p

## - Crie o banco de dados e um usuário com permissões para acessá-lo:
CREATE DATABASE petshop;
CREATE USER 'meu_usuario'@'localhost' IDENTIFIED BY 'minha_senha';
GRANT ALL PRIVILEGES ON meu_banco.* TO 'meu_usuario'@'localhost';
FLUSH PRIVILEGES;


## Configuração do Projeto
1 - Importe o projeto na sua IDE favorita como um projeto Maven.
2 - Configure as propriedades de conexão com o banco de dados no arquivo application.properties

## Configuração do application.properties:
- No arquivo src/main/resources/application.properties, configure as propriedades de conexão com o MySQL:
spring.datasource.url=jdbc:mysql://localhost:3306/petshop
spring.datasource.username=meu_usuario
spring.datasource.password=minha_senha
spring.jpa.hibernate.ddl-auto=update

Execução da Aplicação
1 - Na sua IDE, compile e execute a classe principal MeuApp.java.
2 - Acesse a aplicação em http://localhost:9080.

