package movies;

public class Movie {
//  == INITIALIZATION ===========
    private String name;
    private String category;

//    ======= GETTER AND SETTER FOR NAME =======
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

//    ======= GETTER AND SETTER FOR CATEGORY =======
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
}
