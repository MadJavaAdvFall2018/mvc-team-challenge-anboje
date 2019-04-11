package java112.project3;

import java.util.ArrayList;

/**
 * The type Recipe bean.
 */
public class RecipeBean extends Object {

    private String recipeImg;
    private String  recipeName;
    private String duration;
    private int serving;
    private ArrayList<Ingredient> ingredients;
    private String origin;
    private String ingredientsPath;

	// public ArrayList<Ingredient> getIngredients() {
	// 	return ingredients;
	// }
    //
	// public void setIngredients(ArrayList<Ingredient> ingredients) {
	// 	this.ingredients = ingredients;
	// }

	/**
	 * Constructor for the RecipeBean object
	 */
	public RecipeBean() {

    }



	/**
	* Returns value of recipeImg
	* @return
	*/
	public String getRecipeImg() {
		return recipeImg;
	}

	/**
	* Sets new value of recipeImg
	* @param
	*/
	public void setRecipeImg(String recipeImg) {
		this.recipeImg = recipeImg;
	}

	/**
	* Returns value of recipeName
	* @return
	*/
	public String getRecipeName() {
		return recipeName;
	}

	/**
	* Sets new value of recipeName
	* @param
	*/
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	/**
	* Returns value of duration
	* @return
	*/
	public String getDuration() {
		return duration;
	}

	/**
	* Sets new value of duration
	* @param
	*/
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	* Returns value of serving
	* @return
	*/
	public int getServing() {
		return serving;
	}

	/**
	* Sets new value of serving
	* @param
	*/
	public void setServing(int serving) {
		this.serving = serving;
	}

	/**
	* Returns value of ingredients
	* @return
	*/
	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}

	/**
	* Sets new value of ingredients
	* @param
	*/
	public void setIngredients(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	/**
	* Returns value of origin
	* @return
	*/
	public String getOrigin() {
		return origin;
	}

	/**
	* Sets new value of origin
	* @param
	*/
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	* Returns value of ingredientsPath
	* @return
	*/
	public String getIngredientsPath() {
		return ingredientsPath;
	}

	/**
	* Sets new value of ingredientsPath
	* @param
	*/
	public void setIngredientsPath(String ingredientsPath) {
		this.ingredientsPath = ingredientsPath;
	}
}
