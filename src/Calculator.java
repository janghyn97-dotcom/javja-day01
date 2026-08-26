import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("첫 번째 수: ");
            int a = sc.nextInt();
            System.out.print("두 번째 수: ");
            int b = sc.nextInt();

            System.out.println(a + " + " + b + " = " + (a + b));

            int max = (a > b) ? a : b;
            System.out.println("최댓값: " + max);

            double quotient = divide(a, b);
            System.out.println("몫: " + quotient);
            if (quotient > 1) {
                System.out.println("몫이 1보다 큽니다");
            }
        } catch (InputMismatchException e) {
            System.out.println("정수를 입력해주세요.");
        } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
        }
    }

    private static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return (double) a / b;
    }
}
