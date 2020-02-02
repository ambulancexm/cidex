<%-- 
    Document   : header
    Created on : 1 févr. 2020, 10:30:02
    Author     : bulleux
--%>
<head>
    <link href="./css/style.css" rel="stylesheet" />
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<header>
    <nav id="entete">
        <a href="index">ACCUEIL</a> |
        <a href="ticket">Creer un ticket</a> |
        <a href="stock">Mettre en stock</a> |
        <c:choose>
        <c:when test="${sessionScope.chaine != null}">
             ${sessionScope.chaine} vous etes connecté |
            <a href="deconnexion">Deconnexion</a> |
            
        </c:when>    
        <c:otherwise>
            <a href="inscription">Inscription</a> |
            <a href="connexion">Connexion</a> |

        </c:otherwise>
    </c:choose>
<!--        <a href="inscription">Inscription</a> |
        <a href="connexion">Connexion</a> |-->
        <a href="#">Aide</a>  
    </nav>
</header>

