import java.util.Scanner;

public class StudentGradeTracker {

    public static String getGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine();
        
        
        int[] marks = new int[numSubjects];
        String[] grades = new String[numSubjects];
        String[] subject = new String[numSubjects];
        
        
        int totalMarks = 0;
        int lowestMarks = Integer.MAX_VALUE;
        int highestMarks = Integer.MIN_VALUE;
        
       
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter subject" + (i + 1) + " name : ");
            subject[i] = scanner.nextLine();
            System.out.print("Enter marks for " + subject[i] + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
            
           
            if (marks[i] < lowestMarks) {
                lowestMarks = marks[i];
            }
            if (marks[i] > highestMarks) {
                highestMarks = marks[i];
            }
            
            grades[i] = getGrade(marks[i]);
        }
        
        double averageMarks = (double) totalMarks / numSubjects;
         
        System.out.println("\nStudent Name: " + name);
        System.out.println("Number of Subjects: " + numSubjects);
        System.out.println("\nSubject Grades:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subject[i] + " : " + grades[i]);
        }
        System.out.println();
        System.out.println("Lowest Marks: " + lowestMarks);
        System.out.println("Highest Marks: " + highestMarks);
        System.out.println("Percentage: " + averageMarks + " %");
        System.out.println("Average Grade: " + getGrade(averageMarks));
        System.out.println();     
        scanner.close();
    }
}
