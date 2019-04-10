package java112.project3;

import java.io.*;
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


        RecipeBean recipeOne = new RecipeBean();

        // recipeOne.setRecipeName("Dish Name : " + name);
        // recipeOne.setAuthor("Author Name : " + name);
        // recipeOne.setServing("Serving Name : " + name);
        // recipeOne.setSource("Source Name : " + name);
        recipeOne.setRecipeName("Spicy Fish");
        recipeOne.setAuthor("AnBoJe");
        recipeOne.setServing(6);
        recipeOne.setSource("ocean");

        request.setAttribute("recipeKey", recipeOne);
        // request.setAttribute("authorKey", recipeOne);
        // request.setAttribute("servingKey", recipeOne);
        // request.setAttribute("sourceKey", recipeOne);


        String url = "/recipesPage.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);


    }

}
