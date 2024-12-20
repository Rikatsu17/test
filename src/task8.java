public class task8 {
 public static void main(String[] args) {
  int n = 0;
  int sum = 0;
  while (n < 100) {
   if (n % 3 == 0) {
    n += 1;
   }
   sum += n;
   n++;
  }
  System.out.println(sum);
 }
}
