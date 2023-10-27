import java.util.Scanner;

public class MethodPractice {
    public static void main() {
        System.out.print("Enter your name ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        main(name);
//        System.out.println("Proficient");
    }

    public static void main(String sayHi) {
        System.out.print("Hi " + sayHi);
    }

    public static void testingMethod() {
        System.out.print("Enter your name and Age ");
        System.out.println("Welcome " + getUserName() + " And your Age is " + getUserAge());
    }
    public static int getUserAge() {
        return new Scanner(System.in).nextInt();
    }
    public static String getUserName() {
        return new Scanner(System.in).nextLine();
    }

    public static void printPrimeNum() {
    printPrimeBetween(10, 50);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;

        }
        return true;
    }

    public static void printPrimeBetween(int start, int end) {
        for (int i = start; i <= end; i++) {
            if(isPrime(i))
                System.out.print(i + " ");
        }
    }
}
