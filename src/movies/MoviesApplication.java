package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();

        String userInput;

        do{
            System.out.println("========== MOVIES APPLICATION ==========");
            System.out.printf("%-20s%-20s\n","Categories","Other");
            System.out.printf("%-20s%-20s\n","----------","-----");
            System.out.printf("%-20s%-20s\n","1 - Animated","A - all movies");
            System.out.printf("%-20s%-20s\n","2 - Drama", "X - Exit application");
            System.out.println("3 - Horror");
            System.out.println("4 - Sci-Fi");
            System.out.println("5 - Musical");
            userInput = input.getString("\nEnter your choice: ");
            if(userInput.equalsIgnoreCase("A")){
                System.out.printf("%-40s%-40s\n","Title","Category");
                System.out.printf("%-40s%-40s\n","-----","--------");
                for(Movie movie : movies){
                    String title = movie.getName();
                    String category = movie.getCategory();
                    System.out.printf("%-40s%-40s\n",title,category);
                }
                System.out.println();
            } else if (userInput.equals("1")){
                for (Movie movie :movies){
                    String category = movie.getCategory();
                    if (category.equalsIgnoreCase("animated")){
                        String title = movie.getName();
                        System.out.printf("%-40s%-40s\n",title,category);
                    }
                }
            } else if (userInput.equals("2")){
                for (Movie movie :movies){
                    String category = movie.getCategory();
                    if (category.equalsIgnoreCase("drama")){
                        String title = movie.getName();
                        System.out.printf("%-40s%-40s\n",title,category);
                    }
                }
            } else if (userInput.equals("3")){
                for (Movie movie :movies){
                    String category = movie.getCategory();
                    if (category.equalsIgnoreCase("horror")){
                        String title = movie.getName();
                        System.out.printf("%-40s%-40s\n",title,category);
                    }
                }
            } else if (userInput.equals("4")){
                for (Movie movie :movies){
                    String category = movie.getCategory();
                    if (category.equalsIgnoreCase("scifi")){
                        String title = movie.getName();
                        System.out.printf("%-40s%-40s\n",title,category);
                    }
                }
            } else if (userInput.equals("5")){
                for (Movie movie :movies){
                    String category = movie.getCategory();
                    if (category.equalsIgnoreCase("musical")){
                        String title = movie.getName();
                        System.out.printf("%-40s%-40s\n",title,category);
                    }
                }
            }
        }while(!userInput.equalsIgnoreCase("x"));
    }
}