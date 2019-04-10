package java112.project3;

import java.util.ArrayList;

/**
 * The type Recipe bean.
 */
public class RecipeBean extends Object {

    private String  recipeName;
    private String duration;
    private int serving;
    private ArrayList<Ingredient> ingredients;
    private String origin;

	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	/**
	 * Constructor for the RecipeBean object
	 */
	public RecipeBean() {

    }

	/**
	 * Returns value of recipeName
	 *
	 * @return recipe name
	 */
	public String getRecipeName() {
		return recipeName;
	}

	/**
	 * Sets new value of recipeName
	 *
	 * @param recipeName the recipe name
	 */
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	/**
	 * Returns value of duration
	 *
	 * @return duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * Sets new value of duration
	 *
	 * @param duration the duration
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * Returns value of serving
	 *
	 * @return serving serving
	 */
	public int getServing() {
		return serving;
	}

	/**
	 * Sets new value of serving
	 *
	 * @param serving the serving
	 */
	public void setServing(int serving) {
		this.serving = serving;
	}

	/**
	 * Returns value of origin
	 *
	 * @return origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Sets new value of origin
	 *
	 * @param origin the origin
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

}
