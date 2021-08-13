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

## Ambiente de desenvolvimento:
### IntelliJ IDEA Community 

Community Edition é gratuita e de código aberto, licenciado sob Apache 2.0. Ela fornece todos os recursos básicos para desenvolvimento JVM e Android. Inicialmente iniciei o projeto no Eclipse, porém após conversar com os meus colegas, acabei optando utilizar esta IDE. O IntelliJ acabou sendo muito mais fácil de usar em comparação com o Eclipse. A curva de aprendizado é muito mais rápida no IntelliJ, o que torna o desenvolvimento mais fácil e natural. Preenchimento de código, menus suspensos, visualização rápida, assistentes de projeto, etc. Todas essas coisas são possíveis tanto no Eclipse quanto no IntelliJ, mas a experiência do usuário no IntelliJ é muito mais satisfatória.

## Ferramentas para o desenvolvimento:

## Solução para problemas identificados:

## Linguagens de programação:
Java, HTML, CSS, Javascript.  

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

### Java 

Suitable for applications that have their own bundler and send the JS bundle
directly to a client (without publishing it to npm). Think of a user-facing app
or website, like an email client, a CRM, a landing page or a blog with
interactive elements, using React/Vue/Svelte lib or vanilla JS.

<details><summary><b>Mostrar instruções</b></summary>

1. Install the preset
  

    ```sh
    $ npm install --save-dev size-limit @size-limit/file
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

### Maven

## Como rodar a aplicação:

1) run shell: composer install
2) run shell: php artisan key:generate
3) create new Schema MySql
4) create file .env (can copy from .env.example)
5) configure your database variables in .env
6) run shell: php artisan migrate
7) run shell: php artisan serve

## Como usar o blog:

1) Acesse a aplicação localmente pelo endereço "http://localhost:8080/posts", ou pelo site em que estiver hospedado;
2) Clique na postagem que tiver interesse em ler. Você pode retornar a página inicial clicando em **"posts"**;
3) Para criar uma nova publicação, clique no botão **"Novo Post"**, o que irá te redirecionar a página de login do administrador;
4) Insira o login e a senha de administrador definida no arquivo **"securityconfig"**;
5) Preencha os campos obrigatórios: título, autor e o texto. Após isto, basta clica no botão **"publicar"** e a sua postagem irá aparecer no blog.

<center><img src="https://user-images.githubusercontent.com/42324527/129298983-f0ffd47b-cbe9-412b-9b54-325dd05d39aa.gif"></center>

