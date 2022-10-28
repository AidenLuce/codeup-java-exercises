import java.util.Random;
public class ServerNameGenerator {
    String[] adjectives = {"happy", "mad", "sad", "exited", "surprised", "confused", "dizzy", "tired", "athletic", "lazy"};
    String[] nouns ={"apple", "banana", "spaghetti", "hamburger", "Samuel L. Jackson", "chicken", "orange","grape", "pizza", "Mac & Cheese"};
    private String name;
    public String getName(){
        return name;
    }
    public  void setName(String name){
        this.name = name;
    }
    public static String randomAdjective (String[] array){
        Random random = new Random();
        int adjective = random.nextInt(array.length);
        return array[adjective];
    }
    public static String randomNoun (String[] array){
        Random random = new Random();
        int noun = random.nextInt(array.length);
        return array[noun];
    }
    public ServerNameGenerator(){
        this.name = randomAdjective(adjectives) +"-"+ randomNoun(nouns);
    }

    public static void main(String[] args) {
        ServerNameGenerator name = new ServerNameGenerator();
        System.out.println(name.getName());
    }
}

