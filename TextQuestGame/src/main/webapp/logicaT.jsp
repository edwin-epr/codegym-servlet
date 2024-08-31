<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Juegos del Hambre</title>
        <meta charset="UTF-8">
    </head>
    <body>
        <%
            String nombreJugador = (String) session.getAttribute("nombreJugador");
            if (nombreJugador != null && !nombreJugador.isEmpty()) {
        %>
        <h2><%= nombreJugador %>, bienvenido a los Juegos del Hambre!</h2>
        <p>Edición CodeGym!</p>
        <%
            } else {
        %>
            <h2>Bienvenido extraño a los juegos del hambre!</h2>
        <%
            }
        %>
        <h3>Has perdido la memoria. Aceptas un desafío para poder recuperarla?</h3>
        <form method="POST" action="/TextQuestGame/desafio">
            <input type="radio" id="acepto" name="decisionTomada" value="true">
            <label for="acepto">Acepto! Quiero recuperar mis recuerdos.</label><br>
            <input type="radio" id="noAcepto" name="decisionTomada" value="false">
            <label for="noAcepto">Decido crear nuevos recuerdos.</label><br>
            <br>
            <input type="submit" value="Llévame al desafío">
        </form>
    </body>
</html>