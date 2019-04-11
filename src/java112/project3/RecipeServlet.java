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
    urlPatterns = { "/home" }
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

        // ArrayList<Ingredient> beanOneIngredients = new ArrayList<>();
        // Ingredient ingredient1 = new Ingredient("Telapia" , 2);
        // Ingredient ingredient2 = new Ingredient("Green Pepper" , 1);
        // Ingredient ingredient3 = new Ingredient("Black Pepper" , 1);
        // Ingredient ingredient4 = new Ingredient("Cabbage" , 0.5);
        // Ingredient ingredient5 = new Ingredient("salt" , 0.25);
        //
        //
        // ArrayList<Ingredient> beanTwoIngredients = new ArrayList<>();
        // Ingredient ingredientOne = new Ingredient("Banaba" , 5);
        // Ingredient ingredientTwo = new Ingredient("chicken" , 4);
        // Ingredient ingredientThree = new Ingredient("Onions" , 1);
        // Ingredient ingredientFour = new Ingredient("spinach" , 3);
        // Ingredient ingredientFive = new Ingredient("salt" , 0.25);
        //
        // beanOneIngredients.add(ingredient1);
        // beanOneIngredients.add(ingredient2);
        // beanOneIngredients.add(ingredient3);
        // beanOneIngredients.add(ingredient4);
        // beanOneIngredients.add(ingredient5);

        RecipeBean recipeOne = new RecipeBean();
        recipeOne.setRecipeImg("images/spicyFish.jpg");
        recipeOne.setRecipeName("Spicy Fish");
        recipeOne.setDuration("25 min");
        recipeOne.setServing(6);
        recipeOne.setOrigin("China");
        recipeOne.setIngredientsPath("/java112");

        RecipeBean recipeTwo = new RecipeBean();
        recipeTwo.setRecipeImg("images/Igisafuliya.jpg");
        recipeTwo.setRecipeName("IGISAFULIYA");
        recipeTwo.setDuration("65 min");
        recipeTwo.setServing(5);
        recipeTwo.setOrigin("Rwanda");
        recipeTwo.setIngredientsPath("/java112");


        RecipeBean recipeThree = new RecipeBean();
        recipeThree.setRecipeImg("images/tagine.jpg");
        recipeThree.setRecipeName("Tagine");
        recipeThree.setDuration("40 min");
        recipeThree.setServing(4);
        recipeThree.setOrigin("Morocco");
        recipeThree.setIngredientsPath("/java112");


         recipes.add(recipeOne);
         recipes.add(recipeTwo);
         recipes.add(recipeThree);

        request.setAttribute("recipesKey", recipes);






        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher("/recipesPage.jsp");
        dispatcher.forward(request, response);

    }

}
