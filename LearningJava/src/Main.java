public class Main {
    public static void main(String[] args) {
        StudentProfile studentA = new StudentProfile("Dick", "Wheezy", 2023, 3.75, "computer science");
        System.out.println(studentA.firstName + " " + studentA.lastName + "'s graduation year is " + studentA.graduationYear);
        StudentProfile studentB = new StudentProfile("Giannis", "Antetokounmpo", 2024, 4.0, "basketball");
        studentA.incrementGraduation();
        System.out.println(studentA.firstName + " " + studentA.lastName + "'s updated graduation year is " + studentA.graduationYear);
    }
}