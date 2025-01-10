package room.model;

public class Student {

    private String name;
    private String surname;
    private int year = 2024;
    private double mark;
    private char gender;
    private boolean PHD;


    public Student(String name, String surname, int year, double mark, char gender, boolean PHD) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mark = mark;
        this.gender = gender;
        this.PHD = PHD;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isPHD() {
        return PHD;
    }

    public void setPHD(boolean PHD) {
        this.PHD = PHD;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Year: " + year);
        System.out.println("Mark: " + mark);
        System.out.println("Gender: " + gender);
        System.out.println("IsPhd: " + PHD);
        System.out.println("---------------------");
    }
}
