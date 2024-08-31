<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Juegos del Hambre</title>
        <meta charset="UTF-8">
    </head>
    <body>
        <h2><c:out value="${nombreJugador}"/> <c:out value="${mensajeEncabezado}"/></h2>
        <h3><c:out value="${mensajeEstado}"/></h4>
        <form method="GET" action="/TextQuestGame/reiniciar">
            <input type="submit" value="Reiniciar desafío">
        </form>
    </body>
</html>