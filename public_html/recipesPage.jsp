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

        <div class="container">
        <div class="main">
            <div class="row">
            <div class="col-md-4">
                <h2>First recipe</h2>
                <ul>
                    <li>${recipeOneKey.recipeName}</li>
                    <li>${recipeOneKey.duration}</li>
                    <li>${recipeOneKey.serving}</li>
                    <li>${recipeOneKey.origin}</li>
                </ul>
            </div>

        <div class="col-md-4">
            <h2>Second recipe</h2>
            <ul>
                <li>${recipeTwoKey.recipeName}</li>
                <li>${recipeTwoKey.duration}</li>
                <li>${recipeTwoKey.serving}</li>
                <li>${recipeTwoKey.origin}</li>
            </ul>
        </div>

        <div class="col-md-4">
            <h2>Third recipe</h2>
            <ul>
                <li>${recipeThreeKey.recipeName}</li>
                <li>${recipeThreeKey.duration}</li>
                <li>${recipeThreeKey.serving}</li>
                <li>${recipeThreeKey.origin}</li>
            </ul>
        </div>
    </div>
    </div>

    <div class="footer">
        <div class="row">
            <div class="col-md-12">
                <br />
                <a href="/java112">Home</a>
            </div>
        </div>
    </div>

    </div>
    </body>
</html>
