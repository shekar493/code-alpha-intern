import java.util.Scanner;

public class Studentgrade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int sum = 0;
        int arr[] = new int[n];

        for (int i = 0; i<n; i++) {
            System.out.print("Enter grade of Student " + (i+1) + ": ");
            int marks = scanner.nextInt();
            arr[i] = marks;
            sum += marks;
        }
        
        double avg = sum / n;
        System.out.println("Average : " + avg);
        
        int maxGrade = arr[0];
        int minGrade = arr[0];
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxGrade) {
                maxGrade = arr[i];
            }
            if (arr[i] < minGrade) {
                minGrade = arr[i];
            }
        }
        
        System.out.println("Maximum grade: " + maxGrade);
        System.out.println("Minimum grade: " + minGrade);

        scanner.close();
    }
}
