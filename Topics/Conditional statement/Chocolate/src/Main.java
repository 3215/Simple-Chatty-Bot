import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int N, M, K;
        N = scanner.nextInt();
        M = scanner.nextInt();
        K = scanner.nextInt();

        if ((K < (N *M)) && (((K % N) == 0) || ((K % M) == 0))) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}