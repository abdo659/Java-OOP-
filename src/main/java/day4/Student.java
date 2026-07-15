package day4;

public class Student {


        private String name;
        private int grade;

        // Constructor
        public Student(String name, int grade) {
            this.name = name;
            setGrade(grade);
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Getter for grade (optional)
        public int getGrade() {
            return grade;
        }

        // Setter for grade
        public void setGrade(int grade) {
            if (grade >= 0 && grade <= 100) {
                this.grade = grade;
            } else {
                System.out.println("Invalid grade! Grade must be between 0 and 100.");
            }
        }

        // Display student info
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }

    }

