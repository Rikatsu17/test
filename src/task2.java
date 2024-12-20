import java.util.Scanner;
public class task2 {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter your name: ");
  String name = scanner.nextLine();
  System.out.println("Enter your age: ");
  int age = scanner.nextInt();
  if (18<= age && age<=28) {
   System.out.println(name+", come to the military registration and enlistment office");
  }
  scanner.close();
 }
}