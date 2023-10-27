import java.util.Scanner;

public class ForthFile {
    public static void usingIfStatement() {

        System.out.println("Write A Number from 1 to 10");

        int one = 0;
        int two = 10;
        Scanner userInput = new Scanner(System.in);
        int result = userInput.nextInt();


        if (result > one && result <= two) {
            System.out.println("result is even "+ result);
        } if (result >= two) {
            System.out.println("result is odd "+ result);
        }
        System.out.println("Outside the if statement");

        Scanner userInput1 = new Scanner(System.in);
        int result1 = userInput1.nextInt();

        if (result1 % 2 == 0){
            System.out.println(result1 + "  even");
        }
        if (!(result1 % 2 == 0)){
            System.out.println(result1 + "  odd");
        }


        if (result1 % 2 == 0) {
            System.out.println("even "+ result1);
        }else
            System.out.println("odd "+ result1);
    }
    public static void switchStatement() {
        Scanner userInput = new Scanner(System.in);
        int result = userInput.nextInt();


        switch  (result % 2){
            case  0:
                System.out.println("even");
                break;
            case  30:
                System.out.println("30 result");
                break;
            case  10:
                System.out.println("10 result");
                break;
            default:
                System.out.println("odd");
        }
    }


    public static void whileLoop() {
        System.out.println("Write A Number from 1 to 10");
        Scanner s = new Scanner(System.in);


        int a = s.nextInt();

        if (a <= 10 || a == 10) {
            System.out.println("your number is "+ a);
        }else {
            System.out.println("your number is too high "+ a);
        }


        while (!(a < 1 || a > 10)){
            System.out.println("hello");
            a = s.nextInt();
        }
        System.out.println("not among");
    }

    public static void ifAndElseStatement() {
        System.out.print("Enter a number option to Calculate ");
        Scanner s = new Scanner(System.in);
        
        double d1 = s.nextDouble();
        char c = s.next().charAt(0);
        double d2 = s.nextDouble();

       String userSting = s.nextLine();
        if (c == '+') {
            System.out.println((int) (d1 + d2));
        }else  if (c == '-') {
            System.out.println((int) (d1 - d2));
        }else  if (c == '/') {
            System.out.println((int) (d1 / d2));
        }else  if (c == '*') {
            System.out.println((int) (d1 * d2));
        } else {
            System.out.println("Not a valid  operator ");
        }

    }

    public static void runAProgramToGetALuckyNumber() {
//        Run A Program To Get A Lucky Number

        Scanner s = new Scanner(System.in);

        System.out.print("Enter A 4 digit number to Get A lucky Number  ");

        int n =  s.nextInt();

        int firstNum = n % 10;
        int secondNum = (n / 10) % 10;
        int thirdNum = (n / 100) % 10;
        int fouthNum = (n / 1000) % 10;

        if (!(n > 999 && n < 10000)) {
            System.out.println(n +" is not a four digit number");
        }else {

        if (firstNum + secondNum == thirdNum + fouthNum) {
            System.out.println(n + "  Is A Lucky number");
        }else{
            System.out.println("Not A lucky number");
        }
      }
    }

    public static void ifAndElse() {
        Scanner s = new Scanner(System.in);
        System.out.println("write a Even or Odd number");

        if ((s.nextInt() % 2) == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void doWhileLoop() {
        Scanner s = new Scanner(System.in);
        int i;

        do {
            System.out.print("Enter a number between 1 and 10  ");
            i = s.nextInt();
        }while (i < 1 || i > 10);

        System.out.println(i +" Is between 1 and 10");
    }

    public static void multiplicationTable() {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) +" ");
//                System.out.print("*");
            }

                System.out.println();
        }

    }

}
