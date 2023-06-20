import java.util.*;

public class PrintOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 1) {
            System.out.println(num);
        }
    }
}