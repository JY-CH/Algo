import java.util.Scanner;

public class B123123 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int answer = 0;
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        System.out.print(answer);
    }
}