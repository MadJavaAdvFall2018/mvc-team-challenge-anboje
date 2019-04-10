package java112.project3;

import java.util.ArrayList;

/**
 * The type Recipe bean.
 */
public class RecipeBean extends Object {

    private String  recipeName;
    private String duration;
    private int serving;
    private String source;
    private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    private String origin;


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
	 *
	 * @return serving
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

}
