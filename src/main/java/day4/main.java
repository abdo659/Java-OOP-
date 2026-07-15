package day4;

public class main { public static void main(String[] args) {
    Student student = new Student("Abdelrahman", 85);

    student.displayInfo();

    student.setGrade(95);
    student.setGrade(120);

    System.out.println("Student Name: " + student.getName());
    System.out.println("Student Grade: " + student.getGrade());
}
}
