import java.util.Scanner;
public class task3 {
 public static void main(String[] args) {
  boolean isHigh;
  boolean isLow;
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter your body temperature: ");
  double temperature = scanner.nextDouble();
  isHigh = temperature > 37.5;
  isLow = temperature < 36.0;
  if (isHigh) {
   System.out.println("Your body temperature is high.");
  } else if (isLow) {
   System.out.println("Your body temperature is low.");
  } else {
   System.out.println("Your body temperature is normal.");
  }
  scanner.close();
 }
}