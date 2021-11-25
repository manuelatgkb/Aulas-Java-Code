
<%@  page import = "java.util.ArrayList,models.Categoria" %>

<% 
    ArrayList<Categoria> categorias= (ArrayList<Categoria>)request.getAttribute("categoria"); 
%>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Categoria-Lista</title>
    <link rel = "stlylesheet" href="../css/styles.css">

</head>
<body>
    <h1>Lista de Categorias</h1>
    <form action= "/apt58/categoria/listar" method= "get">
        Nome: <input type="text" name="nome" id="nome">
        <input type="submit" value="filtrar">
    </form>
        <table>
            <thead>
            <tr>
                <th>Id</th>
                <th>Nome</th>
            </tr>
        </thead>
        <tbody>
            
            <% for (Categoria model: categorias){ %>
                <tr>
                    <td><%= model.getId() %>/td>
                    <td><%= model.getNome() %></td>
                    <td>
                        <a href= "/apt57/categoria/carregar? id= <%= model.getId() %>">Alterar</a>
                        <a href= "/atp57/categoria/deletar? id= <%= model.getId() %>">Deletar</a>

                    <\td>
                </tr>
            <%}%>
        </tbody>
    </table>
</body>
</html>