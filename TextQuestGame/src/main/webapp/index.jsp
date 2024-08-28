<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Juego Adivina el Texto</title>
        <meta charset="UTF-8">
    </head>
    <body>
        <body>
            <h1>Introducción al Juego de Adivina el Texto</h1>
            <p>
                El juego de <strong>"Adivina el Texto"</strong> es un desafío en el que los participantes intentan adivinar
                una palabra o frase secreta basada en pistas. Este tipo de juegos son populares debido a su simplicidad
                y capacidad de adaptarse a diferentes contextos y niveles de dificultad.
            </p>
            <p>
                Los juegos de adivinanza de texto pueden ser tan sencillos como un juego de palabras colgado (o ahorcado),
                donde los jugadores tratan de adivinar una palabra letra por letra, o pueden ser más complejos, involucrando
                pistas descriptivas que guían a los jugadores hacia la respuesta correcta.
            </p>

            <h2>Mecánica Básica</h2>
            <ul>
                <li><strong>Elección del Texto Secreto:</strong> Uno de los jugadores, o el juego mismo, selecciona una palabra o frase que los demás jugadores deberán adivinar.</li>
                <li><strong>Pistas o Intentos:</strong> Dependiendo de la variante del juego, los jugadores pueden recibir pistas o deben intentar adivinar la palabra letra por letra.</li>
                <li><strong>Adivinanza:</strong> Los jugadores van proponiendo letras, palabras o frases enteras.</li>
                <li><strong>Victoria o Derrota:</strong> El juego termina cuando se adivina correctamente el texto o cuando se agotan las oportunidades de adivinar.</li>
            </ul>

            <h2>Variantes Comunes</h2>
            <ul>
                <li><strong>Ahorcado:</strong> Los jugadores intentan adivinar una palabra letra por letra. Si fallan demasiadas veces, el "muñeco" queda colgado.</li>
                <li><strong>Crucigramas:</strong> Los jugadores resuelven definiciones para completar palabras en una cuadrícula.</li>
                <li><strong>Juego de Palabras:</strong> Los jugadores adivinan una palabra basándose en pistas dadas por el juego o por otros jugadores.</li>
            </ul>

            <p>
                El juego de "Adivina el Texto" promueve habilidades como la deducción lógica, el conocimiento de vocabulario
                y la capacidad para hacer conexiones entre pistas y conceptos. Es una excelente actividad tanto en un entorno
                educativo como recreativo.
            </p>

            <form method="GET" action="/ServletIniciarJuego">
                 <input type="submit" value="Enviar">
            </form>
    </body>
</html>
