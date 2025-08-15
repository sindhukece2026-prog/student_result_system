import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name  : " + name);
        System.out.println("ID    : " + id);
        System.out.println("Marks : " + marks);
    }
}
Add basic Java student input program
