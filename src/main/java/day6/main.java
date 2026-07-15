package day6;

public class main {
    public static void main(String[] args) {

        String[] students = {
                "Ahmed",
                "Ali",
                "Mona",
                "Sara",
                "Omar"
        };

        System.out.println("Original Array:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        students[2] = "Youssef";

        System.out.println("\nAfter Modification:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

//        System.out.println(students[10]);
    }
}

