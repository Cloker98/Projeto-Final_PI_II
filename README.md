# Projeto-Final_PI_II
# Blog Cristão usando Spring MVC, Spring Security, Thymeleaf, Boostrap.

![Tela1](https://user-images.githubusercontent.com/42324527/129298577-0605843b-e21c-4eea-83fa-208a6aab2b2d.png)

> Status: Em desenvolvimento ⚠️

### Aplicação web Spring Boot, onde é possível criar, atualizar e ler posts do blog.

## Integrantes:
+ Elizeu Grosskopf Schlottfeldt Neto

## Motivação:
Diversos blogs foram criados desde o surgimento da internet possuindo diferentes objetivos. Como enviar notícias aos usuários, sanar dúvidas dos leitores, divulgar releases para a imprensa, etc. Enfim o que todos estes sites tem em comum é a capacidade de compartilhar conteúdos como documentos, podcasts, vídeos, informações no geral com outros usuários. 

Porém, dentro do contexto Cristão fica cada vez mais difícil encontrar material de qualidade e sério sobre a fé Cristã e sem influências políticas. 

Diante do exposto foi desenvolvida uma aplicação intuitiva ao usuário e de fácil utilização.

## Visão de negócio:
Ao desenvolver um projeto utilizando um framework como o Spring Boot e o Spring MVC, você consegue aumentar a produção, reduzir as falhas e consegue criar um sistema escalável.
No caso do

## Ambiente de desenvolvimento:
### IntelliJ IDEA Community 

Community Edition é gratuita e de código aberto, licenciado sob Apache 2.0. Ela fornece todos os recursos básicos para desenvolvimento JVM e Android. Inicialmente iniciei o projeto no Eclipse, porém após conversar com os meus colegas, acabei optando utilizar esta IDE. O IntelliJ acabou sendo muito mais fácil de usar em comparação com o Eclipse. A curva de aprendizado é muito mais rápida no IntelliJ, o que torna o desenvolvimento mais fácil e natural. Preenchimento de código, menus suspensos, visualização rápida, assistentes de projeto, etc. Todas essas coisas são possíveis tanto no Eclipse quanto no IntelliJ, mas a experiência do usuário no IntelliJ é muito mais satisfatória.

## Ferramentas para o desenvolvimento:
(Frameworks: Front-end, Web App, versionador de código, Web Deploy, BD, entre outros)

o framework Spring MVC, com a implementação de uma camada de segurança utilizando Spring Security.

Contando também com a instalação do template Thymeleaf para renderizar as páginas html, e do Bootstrap para construir o Layout das páginas HTML.

Além disto, o emprego do PostgreSQL como banco de dados. Por fim realizar o deploy da aplicação em um cloud service (Heroku, IBM Cloud, AWS Elastic Beanstalk) ainda a ser definido.

Spring boot = Spring MVC + Auto Configuration(Don't need to write spring.xml file for configurations) + Server(You can have embedded Tomcat, Netty, Jetty server).

### Spring Boot
O Spring Boot é um projeto que está dentro do ecossistema Spring, que ajuda a criar aplicações "stand-alone" (aplicações que dependem só do Java). Ajuda com as configurações iniciais da estrutura, com a organização. Facilita colocar o projeto em produção.

### Framework Spring MVC
O Spring MVC é um dos frameworks Java mais conhecido e utilizado. Esse framework implementa um grande número de funções, como injeção de dependência, persistência de dados e uma implementação para o padrão MVC para a criação de aplicações WEB.
O MVC é um padrão de arquitetura de aplicação cujo objetivo é separar o projeto em três camadas independentes, que são o modelo (model), a visão (view) e o controlador (controller). 

Para a camada  Model,  que é a parte de manipulação de dados, 

Para a camada View, que é a parte de interação com o usuário, 

Para a camada Controller, que é a responsável por receber todas as requisições do usuário, 

### Spring Security
Spring Security é uma estrutura de autenticação de controle de acesso poderosa e altamente personalizável. É o padrão para proteger aplicativos baseados em Spring. Ou seja, é uma estrutura que se concentra em fornecer autenticação e autorização para aplicativos Java.

### Thymeleaf
Thymeleaf é um mecanismo motor lado do servidor (server-side) Java para ambientes Web e independentes.

O principal objetivo do Thymeleaf é trazer modelos (templates) naturais elegantes para o seu fluxo de trabalho de desenvolvimento HTML, o template pode ser exibido corretamente em navegadores e também funcionar como protótipos estáticos, permitindo uma colaboração mais forte em equipes de desenvolvimento.

Com módulos para Spring Framework, um host de integrações com suas ferramentas favoritas e a capacidade de conectar sua própria funcionalidade, o Thymeleaf é ideal para o desenvolvimento web moderno de HTML5 JVM.

### Bootstrap
O Bootstrap é o kit de ferramentas de front-end de código aberto mais popular do mundo, com ele você projeta e personaliza rapidamente sites responsivos para dispositivos móvei, sapresenta variáveis Sass e mixins, é um sistema de grids responsivo, possui diversos componentes pré-construídos e poderosos plug-ins de JavaScript.

### PostgreSQL
PostgreSQL é um poderoso sistema de banco de dados relacional de objeto de código aberto com mais de 30 anos de desenvolvimento ativo que lhe rendeu uma forte reputação de confiabilidade, robustez de recursos e desempenho.

A comunidade da ferramenta oferece muitos lugares úteis para se familiarizar com a tecnologia, descobrir como ela funciona e encontrar oportunidades de carreira

## Solução para problemas identificados:
(Grupo de entregas/Componentes que garantem que o projeto foi concluído)

## Linguagens de programação:
+ ### Java
Linguagem orientada a objetos, utilizada no Backend.
+ ### HTML (HyperText Markup Language)
Linguagem de Marcação de Hipertexto, é utilizada na construção de páginas na Web.
+ ### CSS (Cascading Style Sheet)
Linguagem de estilo usada para estilizar elementos escritos em uma linguagem de marcação como HTML.
+ ### Javascript
Linguagem de programação interpretada estruturada, de script em alto nível com tipagem dinâmica fraca e multiparadigma.

## Um post possui estes campos:

+ Título; 
+ Autor;
+ Texto;
+ Data de publicação.

## Alguns recursos ainda estão em desenvolvimento:

- Opção de deletar um post;
- Opção de compartilhamento nas redes sociais;
- Opção de comentários nos posts.

## Tecnologias usadas:

<table>
  <tr>
    <td>Java</td>
    <td>Spring Boot</td>
    <td>Maven</td>
    <td>Bootstrap</td>
    <td>Postgres</td>
  </tr>
  <tr>
    <td>11.0.12</td>
    <td>2.5.3</td>
    <td>3.8.1</td>
    <td>4.3.1</td>
    <td>13.3</td>
  </tr>
</table>


## Como rodar a aplicação:

1) Baixe este repositório;
2) Instale Java JDK na sua máquina, clicando no link: "https://www.oracle.com/br/java/technologies/javase-downloads.html";
3) Descarregue o Maven no seu computador, acessando o link: "https://maven.apache.org/download.cgi";
4) Faça o download do PostgreSQL, pelo link: "https://www.postgresql.org/download/";
5) Certifique-se que o JDK, Maven e o PostgreSQL esteja instalado na sua máquina;
6) Entre no diretório do projeto no prompt de comando.

### Instalação

<details><summary><b>Mostrar instruções</b></summary>

1. Entre no diretório do projeto e digite o comando `mvn clean install`:
  

    ```sh
    C:\Users\aluno\projeto-final>mvn clean install
    ```

</details>

## Como usar o blog:

1) Acesse a aplicação localmente pelo endereço "http://localhost:8080/posts", ou pelo site em que estiver hospedado;
2) Clique na postagem que tiver interesse em ler. Você pode retornar a página inicial clicando em **"posts"**;
3) Para criar uma nova publicação, clique no botão **"Novo Post"**, o que irá te redirecionar a página de login do administrador;
4) Insira o login e a senha de administrador definida no arquivo **"SecurityConfig.java"** que se encontra no diretório **"src\main\java\com.spring.christianblog\configuration"**;
5) Preencha os campos obrigatórios: título, autor e o texto. Após isto, basta clica no botão **"publicar"** e a sua postagem irá aparecer no blog.

<center><img src="https://user-images.githubusercontent.com/42324527/129298983-f0ffd47b-cbe9-412b-9b54-325dd05d39aa.gif"></center>

