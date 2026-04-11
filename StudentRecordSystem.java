import java.util.*;

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        int[] grades = new int[10];

        
        System.out.println("Enter 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Name: ");
            names[i] = sc.nextLine();

            System.out.print("Grade: ");
            grades[i] = sc.nextInt();
            sc.nextLine(); 
        }

        
        System.out.println("\n--- Student Records ---");
        for (int i = 0; i < 10; i++) {
            System.out.println(names[i] + " - " + grades[i]);
        }

        
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        double average = (double) sum / 10;
        System.out.println("\nAverage Grade: " + average);

        
        for (int i = 0; i < grades.length - 1; i++) {
            for (int j = i + 1; j < grades.length; j++) {
                if (grades[i] > grades[j]) {
                    
                    int tempGrade = grades[i];
                    grades[i] = grades[j];
                    grades[j] = tempGrade;

                    
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        System.out.println("\n--- Sorted Records (Ascending) ---");
        for (int i = 0; i < 10; i++) {
            System.out.println(names[i] + " - " + grades[i]);
        }

    
        System.out.print("\nEnter name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("Found: " + names[i] + " - " + grades[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        sc.close();
    }
}