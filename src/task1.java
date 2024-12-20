import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        int temperature = scanner.nextInt();
        if (temperature < 0) {
            System.out.println("“it’s cold outside.");
        }
        else if (temperature > 0) {
            System.out.println("it’s warm outside.");
        }
        scanner.close();
    }
}