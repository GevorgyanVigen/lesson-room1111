package room.service;

import room.model.Student;

import java.util.Scanner;

public class StudentService {

    public Student createStudent() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter surname");
        String surname = scanner.next();
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println("Enter mark");
        double mark = scanner.nextDouble();
        System.out.println("Enter gender");
        char gender = scanner.next().charAt(0);
        System.out.println("Enter PHD");
        boolean isPHD = scanner.nextBoolean();

        return new Student(name, surname, year, mark, gender, isPHD);
    }

    public void maxStudent(Student s1, Student s2, Student s3) {
        if (s1.getYear() < s2.getYear() && s1.getYear() < s3.getYear()) {
            s1.printInfo();
        } else if (s2.getYear() < s1.getYear() && s2.getYear() < s3.getYear()) {
            s2.printInfo();
        } else {
            s3.printInfo();
        }
    }

    public void printGirls(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student.getGender() == 'F') {
                student.printInfo();
            }
        }
    }

    public void maxGirl(Student[] students) {
        Student max = null;

        for (Student student : students) {
            if (max == null) {
                if (student.getGender() == 'F') {
                    max = student;
                }
            } else if (student.getGender() == 'F' && student.getYear() < max.getYear()) {
                max = student;
            }
        }
        if (max != null) {
            max.printInfo();
        } else {
            System.out.println("No Girls");
        }
    }

    public Student[] sortByMark(Student[] students) {

        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length - i; j++) {
                if (students[j - 1].getMark() > students[j].getMark()) {
                    Student temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
            }
        }
        return students;
    }
}
