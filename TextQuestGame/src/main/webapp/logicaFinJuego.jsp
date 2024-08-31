<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Juegos del Hambre</title>
        <meta charset="UTF-8">
    </head>
    <body>
        <% String encabezado = (String) session.getAttribute("nombreJugador") + session.getAttribute("mensajeEncabezado"); %>
        <h2><%= encabezado %></h2>
        <%-- <h2><%=request.getSession().getAttribute("mensaje")%>!</h2> --%>
        <h4><c:out value="${mensajeEstado}"/></h4>
        <form method="GET" action="/TextQuestGame/reiniciar">
            <input type="submit" value="Reiniciar desafío">
        </form>
    </body>
</html>