<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <title>Recipes</title>
    </head>
    <body>
        <div class="jumbotron text-center">
                <h1>Our recipes</h1>
        </div>

        <main class="container" >

            <div class="row" style="border:3px solid #008080; margin: 20px; padding: 20px;">

                <%@page import="java.util.ArrayList" %>
                <%@page import="java112.project3.RecipeBean" %>
                <h1 style="text-align:center" >Trending Dishes</h1>

                <%
                int counter = 1;
                ArrayList<RecipeBean> recipes = (ArrayList<RecipeBean>) request.getAttribute("recipesKey");

                for(RecipeBean recipe: recipes) {
                    %>
                    <div class="col-md-4">
                        <ul class="list-group">
                            <h2 style="text-align:center">Dish <%=counter%></h2>
                            <li class="list-group-item">
                                <img src="<%=recipe.getRecipeImg() %>" style='width:100%;' alt="Click to view recipe">
                            </li>
                            <li class="list-group-item">

                                <%=recipe.getRecipeName() %>
                            </li>
                            <li class="list-group-item">

                                <%=recipe.getDuration() %>
                            </li>
                            <li class="list-group-item">

                                <%=recipe.getServing() %>
                            </li>
                            <li class="list-group-item">

                                <%=recipe.getOrigin() %>
                            </li>

                            <li class="list-group-item">
                                <%=recipe.getIngredients() %>
                            </li>


                            <%
                            counter += 1;
                            %>
                        </ul>
                    </div>
                    <%
                }
                %>


            </div>
            <div class="col-md-6 text-center">
                <a class="btn btn-primary btn-lg btn-block" href="/java112">Home</a>
            </div>
            <div class="col-md-6 text-center">
                <a class="btn btn-primary btn-lg btn-block" href="ingredientPages.jsp">Instructions</a>
            </div>
        </main>

    </body>
</html>
