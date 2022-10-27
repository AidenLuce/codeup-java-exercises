public class Person {
    private String name;
//    private static String name;
//    public Person(String name){
//      setName(name);
//    }

    public String getName(){
//TODO: return the person's name
        return name;
    }
    public  void setName(String nameStr1){
//TODO: change the name field to the passed value
        this.name = nameStr1;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, %s!\n",name);
    }
    public Person(){}

    public Person(String nameStr2){
        this.name = nameStr2;
    }
//    public static void main(String[] args) {
//
//       Person me = new Person();
//       me.setName("Aiden Luce");
//        System.out.println(me.getName());
//        sayHello(me.getName());
//
//        Person myObj = new Person();
//        Person nextObj = new Person();
//        myObj.setName("two");
//        nextObj.setName("John");
//        System.out.println(myObj.getName());
//        System.out.println(nextObj.getName());
//    }
}
