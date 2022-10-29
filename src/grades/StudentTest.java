package grades;


public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student("Dwayne \"The Rock\" Johnson");
        System.out.println(student1.getName());
        student1.addGrade(28);
        student1.addGrade(32);
        student1.addGrade(46);
        student1.addGrade(58);
        student1.addGrade(67);
        student1.addGrade(72);
        student1.addGrade(86);
        student1.addGrade(98);
        student1.addGrade(100);
        System.out.println("Average: " + student1.getGradeAverage()+ "\n");
        Student student2 = new Student("Andrew Garfield");
        student2.addGrade(98);
        student2.addGrade(100);
        student2.addGrade(103);
        student2.addGrade(97);
        System.out.println(student2.getName());
        System.out.println("Average: " + student2.getGradeAverage()+ "\n");


    }
}
