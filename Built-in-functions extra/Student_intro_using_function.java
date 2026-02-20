package METHODS;

public class Student_intro_using_function {
    public static void main(String[] args) {
        intro("Abhay", 12, 21, "A");
    }
    
    public static void intro(String name, int classNumber, int age, String grade) {
        System.out.println("My name is " + name + ", I am in class " + classNumber + ", my age is " + age + ", and my grade is " + grade + ".");
    }
}
