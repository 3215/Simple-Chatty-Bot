import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a, b, n;
        a = scanner.nextInt();
        b = scanner.nextInt();
        n = scanner.nextInt();
        System.out.println((b-a) / n + 1);

    }
}