package java112.project3;

public class RecipeBean extends Object {

    private String  recipeName;
    private String duration;
    private int serving;
    private String origin;


    /**
     *  Constructor for the RecipeBean object
     */
    public RecipeBean() {

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
