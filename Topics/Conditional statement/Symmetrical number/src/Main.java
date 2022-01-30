import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        if ((num/1000) == (num%10) && ((num/100)%10) == ((num%100)/10)) {
            System.out.println(1);
        }
        else {
            System.out.println(37);
        }
    }
}