public class UnderstandingReferencesPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Ryan Reynolds");
        Person person2 =new Person();
        person1.sayHello();
        person2.setName("Hugh Jackman");
        person2.sayHello();
//        ================================================================
//        Use set name to change the value of an already declared variable
//        ================================================================
            person2.setName("Giancarlo Esposito");
            person2.sayHello();
//        ================================================================
//        Prints:
//          Hello, Ryan Reynolds!
//          Hello, Hugh Jackman!
//          Hello, Giancarlo Esposito!
    }
}
