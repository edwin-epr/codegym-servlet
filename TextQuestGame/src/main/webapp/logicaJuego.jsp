<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Juegos del Hambre</title>
        <meta charset="UTF-8">
    </head>
    <body>
        <h2>
            <c:out value="${nombreJugador}" />
            <c:out value="${respuesta.encabezadoPagina}"/>
        </h2>
        <c:out value="${respuesta.leyendaPagina}"/>
        <br>
        <form method="POST" action="/TextQuestGame/desafio">
            <input type="radio" id="acepto" name="decisionTomada" value="true">
            <label for="acepto"><c:out value="${respuesta.opcionSi}"/></label><br>
            <input type="radio" id="noAcepto" name="decisionTomada" value="false">
            <label for="noAcepto"><c:out value="${respuesta.opcionNo}"/></label><br>
            <br>
            <input type="submit" value="Continuar...">
        </form>
    </body>
</html>