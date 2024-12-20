import java.util.Scanner;
public class task6 {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int sum = 0;
  while (true) {
   String ent = scanner.nextLine();
   if (ent.equals("ENTER")) {
    break;
   }
   try{
    int number = Integer.parseInt(ent);
    sum += number;
   }
   catch (NumberFormatException e) {
    System.out.println("ERROR");
   }
  }
  System.out.println(sum);
  scanner.close();
 }
}
