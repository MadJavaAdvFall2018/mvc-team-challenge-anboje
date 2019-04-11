package java112.project3;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 * @author AnBoJE
 * class RecipeServlet
 *
 */
@WebServlet(
    name = "recipe",
    urlPatterns = { "/recipePage" }
)
public class RecipeServlet extends HttpServlet {


    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("recipeName");
        ArrayList<RecipeBean> recipes = new ArrayList<>();


        RecipeBean recipeOne = new RecipeBean();
        recipeOne.setRecipeImg("images/spicyFish.jpg");
        recipeOne.setRecipeName("Spicy Fish");
        recipeOne.setDuration("45 min");
        recipeOne.setServing(6);
        recipeOne.setOrigin("China");
        recipeOne.setIngredients("<a> 2 whole sea bass (400 grams / 14 ounces each)</a> <br>"
        +"<a> 1 teaspoon chili pepper flakes (or powder)</a><br>"
        +"<a> 1 teaspoon cumin powder</a><br>"
        +"<a> 1 thumb ginger, half sliced, half minced</a><br>"
        +"<a>1 medium size onion, sliced</a><br>"
        +"<a>1 teaspoon salt</a><br>"
        +"<a> 1 cup lotus root, sliced</a><br>"
        +"<a> 1 cup bamboo shoot, sliced</a><br>"
        +"<a> 10 - 20 dried chili pepper</a>");


        RecipeBean recipeTwo = new RecipeBean();
        recipeTwo.setRecipeImg("images/Igisafuliya.jpg");
        recipeTwo.setRecipeName("IGISAFULIYA");
        recipeTwo.setDuration("65 min");
        recipeTwo.setServing(4);
        recipeTwo.setOrigin("Rwanda");
        recipeTwo.setIngredients("<a> 4 chicken thighs</a> <br>"
        +"<a> 2 onions , chopped</a><br>"
        +"<a> 2 leeks (white and green parts), thinly sliced</a><br>"
        +"<a> 4 green bell peppers , seeded and cut</a><br>"
        +"<a>4 tomatoes , peeled, seeded, and diced</a><br>"
        +"<a>5 celery stalks , chopped (including leaves)</a><br>"
        +"<a> 4 plantain bananas , peeled, cut in half lengthwise and then cut in half</a><br>"
        +"<a> 10 oz. spinach , fresh or frozen</a><br>"
        +"<a> 4 tablespoons sunflower oil</a>");


        RecipeBean recipeThree = new RecipeBean();
        recipeThree.setRecipeImg("images/tagine.jpg");
        recipeThree.setRecipeName("Tagine");
        recipeThree.setDuration("50 min");
        recipeThree.setServing(7);
        recipeThree.setOrigin("Morocco");
        recipeThree.setIngredients("<a> 3 lbs chicken whole roaster cut into pieces</a> <br>"
        +"<a> 1/2 cup onion chopped</a> <br>"
        +"<a> 1 cup water</a><br>"
        +"<a> 2 garlic cloves minced</a><br>"
        +"<a> 2 Roma tomato cored and diced</a><br>"
        +"<a>1/4 cup peas frozen</a><br>"
        +"<a>3 carrots sliced</a><br>"
        +"<a> 2 Tbsp olive oil</a><br>"
        +"<a> 1 lb potatoes (paleo diet: sweet potatoes)</a><br>"
        +"<a> 1 Tbsp fresh parsley chopped</a>");


         recipes.add(recipeOne);
         recipes.add(recipeTwo);
         recipes.add(recipeThree);

        request.setAttribute("recipesKey", recipes);



        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher("/recipesPage.jsp");
        dispatcher.forward(request, response);

    }

}
