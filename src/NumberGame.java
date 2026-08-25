import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = (int) (Math.random() * 100) + 1;
        int number = 0;

        while (true) {
            System.out.println("정답은? (1~100)");
            int a = sc.nextInt();

            if (a < 1 || a > 100) {
                System.out.println("다시 입력 하세요");
                continue;
            }

            number++;

            if (a == answer) {
                System.out.println("정답입니다! 정답은 "  + number + "번에 맞추셨습니다.");
                break;
            } else if (a > answer) {
                System.out.println("정답보다 큽니다");
            } else {
                System.out.println("정답보다 작습니다");
            }
        }

        sc.close();
    }
}
