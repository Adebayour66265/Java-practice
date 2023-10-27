import java.util.Scanner;

public class FifthFile {
    public static void numBetweenOneToTen() {

        int num;
        Scanner s = new Scanner(System.in);

        while (true){
        System.out.println("Enter the number between 1 and 10");
            num = s.nextInt();
        if (num < 1 || num > 10) {
            continue;
        }
            System.out.println(num + " Between 1 and 10");
        break;
        }
    }

    public static void exerciseOne() {
//        Write a programme which print the Even number between 1 and 100 in an increasing order.
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        for (int j = 1; j <= 100 ; j++) {
            if (j % 2 != 0) {
                System.out.print(j  + " ");
            }
        }

        System.out.println(" ");

        for (int i = 100; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        for (int j = 99; j >= 1; j-= 2) {
                System.out.print(j + " ");
        }
    }

    public static void exerciseTwo() {
//        Write a programme which run the sequence of integer from the user and stops by displaying "Done" when the sum of this value exceed 100
        int sum = 0;
        Scanner s = new Scanner(System.in);

//        while (true) {
//            System.out.print("Enter a sum  ");
//            sum += s.nextInt();
//            if (sum > 100) {
//                break;
//            }
//        }
//        System.out.println("Done  " + sum);

        while (sum <= 100){
            System.out.print("Enter a sum  ");
            sum += s.nextInt();
        }
        System.out.println("Done  " + sum);
    }

    public static void exerciseThree() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a new number");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i < n/2; i++) {
            if (n % i == 0) {
                sum += i;
//                System.out.print(i + " ");
            System.out.println(sum);
            }
        }
    }
}
