public class Person {
    private static String name;
    public Person(String name){
      setName(name);
    }

    public static String getName(){
//TODO: return the person's name
        return Person.name;
    }
    public static void setName(String name){
//TODO: change the name field to the passed value
        Person.name = name;
    }
    public static void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, %s!",name);
    }
    public static void main(String[] args) {
        setName("Aiden Luce");
        sayHello();


    }
}
