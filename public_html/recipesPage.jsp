<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title>Recipes</title>
    </head>
    <body>

<%@page import="java.util.ArrayList" %>
<%@page import="java112.project3.RecipeBean" %>
        <h1>Our recipes</h1>

<ul>
    <%
    int counter = 1;
    ArrayList<RecipeBean> recipes = (ArrayList<RecipeBean>) request.getAttribute("recipesKey");

    for(RecipeBean recipe: recipes) {
    %> <h2>Recipe <%=counter%></h2>
    <li>

        <%=recipe.getRecipeName() %>
        </li>
        <li>

        <%=recipe.getDuration() %>
        </li>
        <li>

        <%=recipe.getServing() %>
        </li>
        <li>

        <%=recipe.getOrigin() %>
        </li>


    <%
    counter += 1;
    }
    %>
</ul>


        <a href="/java112">Home</a>


    </body>
</html>
