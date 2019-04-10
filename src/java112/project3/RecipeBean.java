package java112.project3;

public class RecipeBean extends Object {

    private String  recipeName;
    private String author;
    private int serving;
    private String source;


    /**
     *  Constructor for the RecipeBean object
     */
    public RecipeBean() {

        recipeName = "spicy fish";
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
	* Returns value of author
	* @return
	*/
	public String getAuthor() {
		return author;
	}

	/**
	* Sets new value of author
	* @param
	*/
	public void setAuthor(String author) {
		this.author = author;
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
	* Returns value of source
	* @return
	*/
	public String getSource() {
		return source;
	}

	/**
	* Sets new value of source
	* @param
	*/
	public void setSource(String source) {
		this.source = source;
	}

}
