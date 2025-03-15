import java.util.Scanner; 
public class TallestStudent { 
 public static void main(String[] args) { 
 Scanner scanner = new Scanner(System.in); 
 System.out.print("Enter height of student 1: "); 
 double height1 = scanner.nextDouble(); 
 System.out.print("Enter height of student 2: "); 
 double height2 = scanner.nextDouble(); 
 System.out.print("Enter height of student 3: "); 
 double height3 = scanner.nextDouble(); 
 if(height1 >= height2 && height1 >= height3) { 
 System.out.println("The tallest student is: Student 1");  } else if(height2 >= height1 && height2 >= height3) {  System.out.println("The tallest student is: Student 2");  } else { 
 System.out.println("The tallest student is: Student 3");  } 
 scanner.close(); 
 }
} 
