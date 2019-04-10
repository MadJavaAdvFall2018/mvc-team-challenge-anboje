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



        // RecipeBean recipeTwo = new RecipeBean();
        // recipeTwo.setRecipeName("Corn casserole");
        // recipeTwo.setAuthor("AnBoJe");
        // recipeTwo.setServing(3);
        // recipeTwo.setSource("Market");
        // RecipeBean recipeThree = new RecipeBean();
        // recipeThree.setRecipeName("Couscous");
        // recipeThree.setAuthor("AnBoJe");
        // recipeThree.setServing(2);
        // recipeThree.setSource("Market");
        // RecipeBean recipeFour = new RecipeBean();
        // recipeFour.setRecipeName("Grilled Chicken");
        // recipeFour.setAuthor("AnBoJe");
        // recipeFour.setServing(3);
        // recipeFour.setSource("ocean");
        // RecipeBean recipeFive = new RecipeBean();
        // recipeFive.setRecipeName("Smoked Beans");
        // recipeFive.setAuthor("AnBoJe");
        // recipeFive.setServing(9);
        // recipeFive.setSource("Market");

        // recipes.add(recipeOne);
        // recipes.add(recipeTwo);
        // recipes.add(recipeThree);
        // recipes.add(recipeFour);
        // recipes.add(recipeFive);

        //     request.setAttribute("recipeKey", recipes);


        RecipeBean recipeOne = new RecipeBean();
        recipeOne.setRecipeName("Spicy Fish");
        recipeOne.setDuration("25 min");
        recipeOne.setServing(6);
        recipeOne.setOrigin("China");

        RecipeBean recipeTwo = new RecipeBean();
        recipeTwo.setRecipeName("IGISAFULIYA");
        recipeTwo.setDuration("65 min");
        recipeTwo.setServing(5);
        recipeTwo.setOrigin("Rwanda");

        RecipeBean recipeThree = new RecipeBean();
        recipeThree.setRecipeName("Tagine");
        recipeThree.setDuration("40 min");
        recipeThree.setServing(4);
        recipeThree.setOrigin("Morocco");
         recipes.add(recipeOne);
         recipes.add(recipeTwo);
         recipes.add(recipeThree);
//        for (RecipeBean recipe:recipes     ) {
//            request.setAttribute("authorKey", recipe);
//        }
        request.setAttribute("recipesKey", recipes);



//        request.setAttribute("recipeOneKey", recipeOne);
//        request.setAttribute("recipeTwoKey", recipeTwo);
//        request.setAttribute("recipeThreeKey", recipeThree);


        // request.setAttribute("servingKey", recipeOne);
        // request.setAttribute("OriginKey", recipeOne);


        String url = "/recipesPage.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);


    }

}
