import java.util.Scanner;
public class task10 {
 public static void main(String[] args) {
  int sum = 0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter start number: ");
  int start = sc.nextInt();
  System.out.println("Enter end number: ");
  int end = sc.nextInt();
  System.out.println("Enter multiple number: ");
  int multiple = sc.nextInt();
  for (int i= start; i < end; i++) {
   if (i % multiple != 0) {
    continue;
   }
   sum += i;
  }
  System.out.println(sum);
 }
}