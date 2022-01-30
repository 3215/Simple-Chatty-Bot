import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int x1, y1, x2, y2;
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        if ((x1==x2) || (y1==y2) || (Math.abs(x2-x1) == Math.abs(y2-y1))) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}