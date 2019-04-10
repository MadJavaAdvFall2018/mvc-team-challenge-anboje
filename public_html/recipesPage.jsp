<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title>Recipes</title>
    </head>
    <body>
        <h3>Our recipes</h3>

        <ul>
        <c:forEach var="recipe" items="${recipeKey}">

            <li>${recipe.recipeName}</li>

            <li>${recipe.author}</li>
            <li>${recipe.serving}</li>
        </c:forEach>

        </ul>

        <br />

        <a href="/java112">Home</a>


    </body>
</html>
