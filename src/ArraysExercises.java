import java.util.Arrays;
import util.Input;


public class ArraysExercises {
    public static Person[] addPerson(Person newPerson, Person[] dudes){
            Person[] newArray;
            newArray = new Person[dudes.length +1];
            for(int i = 0;i<dudes.length; i++ ){
                newArray[i] = dudes[i];
            }
            newArray[newArray.length -1] = newPerson;
//        System.out.println(newArray);
//        addPerson(Person newPerson, Person[] dudes);
            return newArray;
    }

    public static void main(String[] args) {
        Input newInput = new Input();

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//        ================= FAILED ATTEMPTS ==================

//        Person[] dudes = new Person[2];
//        dudes[0] = new Person("Ryan Reynolds");
//        dudes[1] = new Person("Hugh Jackman");
//        for (Person dude :dudes){
//            System.out.println(Arrays.toString(dudes));

//        Person person1 = new Person();
//        person1.setName("Ryan Reynolds");
//        Person person2 = new Person();
//        person1.setName("Hugh Jackman");
//        Person person3 = new Person();
//        person1.setName("Giancarlo Esposito");
////        Person[] people = {person1, person2, person3};
//        Person[] people = new Person[3];
//        people[0] = person1;
//        people[1] = person2;
//        people[2] = person3;
//        for (Person dude : people) {
//            System.out.println(dude.getName());
//        }

//        =====================================================
        Person[] dudes = {
                new Person("Ryan Reynolds"),
            new Person("Hugh Jackman"),
                new Person ("Giancarlo Esposito")
        };
        for (Person dude : dudes ){
            System.out.println(dude.getName());
        }
        String promptName = newInput.getString("Please add another person:");
        Person newPerson = new Person(promptName);
        dudes = addPerson(newPerson, dudes);
        for (Person dude : dudes){
            System.out.println(dude.getName());
        }




//        String newPersonName = input.getString("Enter a new person's name:");
//        Person newPerson = new Person(newPersonName);
//        dudes = addPerson(newPerson, dudes);
//        for (Person person : dudes) {
//            System.out.println( person.getName() );
        }
    }
//}


