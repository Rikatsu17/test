import java.util.Scanner;
public class task4 {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter your age: ");
  int n = scanner.nextInt();
  if (n < 20 || n > 60) {
   System.out.println("you don’t have to work");
  }
  scanner.close();
 }
}
