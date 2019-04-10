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

        request.setAttribute("recipesKey", recipes);



//        request.setAttribute("recipeOneKey", recipeOne);
//        request.setAttribute("recipeTwoKey", recipeTwo);
//        request.setAttribute("recipeThreeKey", recipeThree);


        String url = "/recipesPage.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }

}
