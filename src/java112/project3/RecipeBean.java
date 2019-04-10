package java112.project3;

import java.util.ArrayList;

/**
 * The type Recipe bean.
 */
public class RecipeBean extends Object {

    private String  recipeName;
    private String author;
    private int serving;
    private String source;
    private ArrayList<Ingredient> ingredients = new Ingredient();


	/**
	 * Constructor for the RecipeBean object
	 */
	public RecipeBean() {

        recipeName = "spicy fish";
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
	 * Returns value of author
	 *
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets new value of author
	 *
	 * @param author the author
	 */
	public void setAuthor(String author) {
		this.author = author;
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
	 * Returns value of source
	 *
	 * @return source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * Sets new value of source
	 *
	 * @param source the source
	 */
	public void setSource(String source) {
		this.source = source;
	}

}
