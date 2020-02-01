<%-- 
    Document   : index
    Created on : 1 févr. 2020, 15:22:09
    Author     : bulleux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Page d'accueil</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/style.css" rel="stylesheet" />
    </head>
    <body>
        <%@ include file="/WEB-INF/header.jsp" %>  
        <main>
            <table>
                <tr>
                    <td id="col-gauche" class="col">
                        <!--TODO action-->
                        <form id="app-login" action="process.php">
                            <fieldset>
                                <legend>Login Details</legend>
                                <label for="user-name">ARTICLE</label>
                                <input name="code-barre" type="text" placeholder="saisir un code barre" required autofocus>
                                <label for="password">Quantité</label>
                                <input name="password" type="number" value="1" min="1" required>
                                <input name="login" type="submit" value="Login">
                            </fieldset>
                        </form>
                    </td>
                    <td id="col-droite" class="col">
                        <ul>test 1 </ul>
                        <ul>test 2 </ul>
                        <ul>test 3 </ul>
                        <ul>test 4 </ul>
                    </td>
                </tr>
            </table>
        </main>
        <h1>Hello World!</h1>
    </body>
</html>
