# java
import java.util.Scanner;

public class CollegeLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of visits you want to make: ");
        int visits = scanner.nextInt();
        
        for (int i = 0; i < visits; i++) {
            System.out.print("Enter the room number you are visiting: ");
            int roomNumber = scanner.nextInt();
            
            String department;
            int floor;
            
            if (roomNumber >= 1 && roomNumber <= 12) {
                department = "Electronics Department";
                floor = 0;
            } else if (roomNumber >= 101 && roomNumber <= 112) {r
                department = "Computer Department";
                floor = 1;
            } else if (roomNumber >= 201 && roomNumber <= 212) {
                department = "Mechanical Department";
                floor = 2;
            } else if (roomNumber >= 301 && roomNumber <= 312) {
                department = "Civil Department";
                floor = 3;
            } else if (roomNumber >= 401 && roomNumber <= 412) {
                department = "Structural Department";
                floor = 4;
            } else {
                department = "Other Faculty";
                floor = -1;
            }
            
            if (floor == -1) {
                System.out.println("You are visiting Other Faculty, not a specific department.");
            } else {
                System.out.println("You are visiting " + department + " on Floor " + floor);
            }
        }
        
        scanner.close();
    }
}
