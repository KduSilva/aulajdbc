#  Agenda de Contatos em Java (JDBC + DAO)

Este projeto é uma aplicação Java simples que implementa um CRUD completo para gerenciar contatos, utilizando JDBC puro, padrão DAO e conexão com banco de dados MySQL. Foi desenvolvido com foco em aprendizado e prática dos fundamentos de Java SE e preparação para Java EE.

##  Funcionalidades

-  Inserir novo contato
-  Listar todos os contatos
-  Atualizar dados de um contato existente
-  Remover contato pelo ID
-  Buscar contato específico pelo ID

## Estrutura do Projeto

##  Banco de Dados

- **SGBD**: MySQL
- **Nome do banco**: `contato_db`
- **Tabela**: `contatos`

### Estrutura da tabela:

```sql
CREATE TABLE contatos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    endereco VARCHAR(200),
    dataNascimento DATE
);

 Conexão com o Banco
A conexão é feita via DriverManager:

DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/contato_db",
    "MySQLKdu",
    "123456"
);


 Certifique-se de que o driver JDBC do MySQL está incluído no classpath do projeto.


Testes
As classes TestaInsere e TestaLista demonstram como utilizar os métodos do DAO:
- TestaInsere: cria e insere um novo contato no banco.
- TestaLista: lista todos os contatos e formata a data de nascimento.

Tecnologias Utilizadas
    - Java SE
    - JDBC
    - MySQL
    - DAO Pattern
    - SimpleDateFormat
    - Calendar API

Objetivo
Este projeto foi desenvolvido como parte do estudo da apostila da Caelum (FJ-21), com foco em:
- Prática de JDBC sem frameworks
- Entendimento do padrão DAO
- Preparação para integração com Servlets, JSP e Java EE
Autor
Kdu — Desenvolvedor em formação, explorando Java raiz com estilo e propósito.

Proximo passo transformar para Web com Servlets e JSP
 Etapas
- Criar um projeto dinâmico no Eclipse ou IntelliJ
- Adicionar o JDBC e o DAO ao projeto web
- Criar Servlets para cada operação (inserir, listar, editar, excluir)
- Criar páginas JSP para interação com o usuário
- Configurar o web.xml ou usar anotações @WebServlet
- Implantar no Tomcat e testar via navegador
 Exemplo de Servlet

@WebServlet("/adicionaContato")
public class AdicionaContatoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Contato contato = new Contato();
        contato.setNome(request.getParameter("nome"));
        contato.setEmail(request.getParameter("email"));
        contato.setEndereco(request.getParameter("endereco"));
        // ... restante da lógica

        new ContatoDAO().adicionaContato(contato);
        response.sendRedirect("listaContatos.jsp");
    }
}



