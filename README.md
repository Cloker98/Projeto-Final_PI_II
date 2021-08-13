# Projeto-Final_PI_II
# Blog Cristão usando Spring MVC, Spring Security, Thymeleaf, Boostrap e um Cloud Service.

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
(Benefícios)

## Ambiente de desenvolvimento:
### IntelliJ IDEA Community 

Community Edition é gratuita e de código aberto, licenciado sob Apache 2.0. Ela fornece todos os recursos básicos para desenvolvimento JVM e Android. Inicialmente iniciei o projeto no Eclipse, porém após conversar com os meus colegas, acabei optando utilizar esta IDE. O IntelliJ acabou sendo muito mais fácil de usar em comparação com o Eclipse. A curva de aprendizado é muito mais rápida no IntelliJ, o que torna o desenvolvimento mais fácil e natural. Preenchimento de código, menus suspensos, visualização rápida, assistentes de projeto, etc. Todas essas coisas são possíveis tanto no Eclipse quanto no IntelliJ, mas a experiência do usuário no IntelliJ é muito mais satisfatória.

## Ferramentas para o desenvolvimento:
(Frameworks: Front-end, Web App, versionador de código, Web Deploy, BD, entre outros)

o framework Spring MVC, com a implementação de uma camada de segurança utilizando Spring Security.

Contando também com a instalação do template Thymeleaf para renderizar as páginas html, e do Bootstrap para construir o Layout das páginas HTML.

Além disto, o emprego do PostgreSQL como banco de dados. Por fim realizar o deploy da aplicação em um cloud service (Heroku, IBM Cloud, AWS Elastic Beanstalk) ainda a ser definido.


### Framework Spring MVC
O Spring MVC é um dos frameworks Java mais conhecido e utilizado. Esse framework implementa um grande número de funções, como injeção de dependência, persistência de dados e uma implementação para o padrão MVC para a criação de aplicações WEB.
O MVC é um padrão de arquitetura de aplicação cujo objetivo é separar o projeto em três camadas independentes, que são o modelo (model), a visão (view) e o controlador (controller). 

Para a camada  Model,  que é a parte de manipulação de dados, 

Para a camada View, que é a parte de interação com o usuário, 

Para a camada Controller, que é a responsável por receber todas as requisições do usuário, 



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
2) Instale Java JDK na sua máquina, cliclando no link: "https://www.oracle.com/br/java/technologies/javase-downloads.html";
3) Descarregue o Maven no seu computador, acessando o link "https://maven.apache.org/download.cgi";
4) Certifique-se que o JDK e o Maven esteja instalado na sua máquina;
5) Entre no diretório do projeto no prompt de comando.

### Instalação

<details><summary><b>Mostrar instruções</b></summary>

1. Entre no diretório do projeto e digite o comando `mvn clean install`:
  

    ```sh
    C:\Users\aluno\projeto-final>mvn clean install
    ```

2. Add the `size-limit` section and the `size` script to your `package.json`:

    ```diff
    + "size-limit": [
    +   {
    +     "path": "dist/app-*.js"
    +   }
    + ],
      "scripts": {
        "build": "webpack ./webpack.config.js",
    +   "size": "npm run build && size-limit",
        "test": "jest && eslint ."
      }
    ```

3. Here’s how you can get the size for your current project:

    ```sh
    $ npm run size

      Package size: 30.08 kB with all dependencies, minified and gzipped
    ```

4. Now, let’s set the limit. Add 25% to the current total time and use that as
   the limit in your `package.json`:

    ```diff
      "size-limit": [
        {
    +     "limit": "35 kB",
          "path": "dist/app-*.js"
        }
      ],
    ```

5. Add the `size` script to your test suite:

    ```diff
      "scripts": {
        "build": "webpack ./webpack.config.js",
        "size": "npm run build && size-limit",
    -   "test": "jest && eslint ."
    +   "test": "jest && eslint . && npm run size"
      }
    ```

6. If you don’t have a continuous integration service running, don’t forget
   to add one — start with [Travis CI].

</details>

## Como usar o blog:

1) Acesse a aplicação localmente pelo endereço "http://localhost:8080/posts", ou pelo site em que estiver hospedado;
2) Clique na postagem que tiver interesse em ler. Você pode retornar a página inicial clicando em **"posts"**;
3) Para criar uma nova publicação, clique no botão **"Novo Post"**, o que irá te redirecionar a página de login do administrador;
4) Insira o login e a senha de administrador definida no arquivo **"SecurityConfig.java"** que se encontra no diretório **"src\main\java\com.spring.christianblog\configuration"**;
5) Preencha os campos obrigatórios: título, autor e o texto. Após isto, basta clica no botão **"publicar"** e a sua postagem irá aparecer no blog.

<center><img src="https://user-images.githubusercontent.com/42324527/129298983-f0ffd47b-cbe9-412b-9b54-325dd05d39aa.gif"></center>

