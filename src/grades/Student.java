package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer>grades;
//    public Student(){
//        this.name = "";
//        this.grades = new ArrayList<>();
//    }
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }
    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    Integer total = 0;
    public double getGradeAverage(){
        for (Integer grade : grades){
            total += grade;
        }
        Integer average = total / grades.size();
        return average;
    }
}
