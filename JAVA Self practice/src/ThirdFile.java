import java.util.Scanner;

public class ThirdFile {
    public static void checkingUserData() {
        int one = 1;
        String userName = "Ade";
        Object userData = new Object[one];
        System.out.println(userData + " " + userName);
    }

    public static void testingIfStatement() {
        Boolean args = true;
        if (args == null) {
            System.out.println("Welcome to Nigeria");
        } else if (args != null) {
            System.out.println("You see the result now ?");
        }else {
            System.out.println("Notting Else to lean");
        }
    }


//    Write a function to receive user data from input and base on user input reply with respond
    public static void userRequestData() {
        Scanner userInput = new Scanner((System.in));

        System.out.println("Please enter some strings or Number");
        String str = "";
        int num = 0;

        if (userInput.next() != str) {
            System.out.println("You have successfully enter the info and the info is: " + userInput.next());
        } else if (userInput.nextInt() != num) {
            System.out.println("you enter the number and number is: " + userInput.nextInt());
        }else {
            System.out.println("Why don't you Enter the info that you need" + userInput.nextLine());
            System.out.println("You try sha!");
        }
    }

    public static void checkingResultValue() {
        int value = 20;
        int value1;
        value1 = value + 30;

        System.out.println(value1 + " " + value);
    }

    public static void assignmentOperator() {
        System.out.println("Checking Arithmetic Operator with an Addition: " + (2 + 5));
        System.out.println("Checking Arithmetic Operator with Subtraction: " + (2 - 5));
        System.out.println("Checking Arithmetic Operator with Multiplication: " + (2 * 5));
        System.out.println("Checking Arithmetic Operator with Division: " + (2 / 5));
        System.out.println("Checking Arithmetic Operator with Modulo: " + (2 % 5));
    }

    public static void incrementOperator() {
//        Pre Increment
        int i = 3;
        int j = ++i;
        System.out.println("i will be " + i + " " + " j will be " + j);

//        Post Increment
        int i1 = 3;
        int j1 = i1++;
        System.out.println("i will be " + i1 + " " + " j will be " + j1);
    }

    public static void conditionalStatement() {
//        boolean one = true;
//        boolean two = true;
//        boolean three = false;
//
//        boolean result = one && two && three;
//        System.out.println(result);

//        Ask the UserName base on condition and respond the user input
        Scanner askingName = new Scanner(System.in);
        System.out.println("what is your name ");
        String name = "";
        int age = 0;




        Scanner askingAge = new Scanner(System.in);
        String result1 = name != null ? "Your name is: " + askingName.nextLine() : "Your Age is: " + askingAge.nextInt() ;
        System.out.println(result1);


        System.out.println("what is your Age");
        if (name == null) {
            System.out.println("Your name is: " + askingName.nextLine());
        } else if (age == age) {
            System.out.println("Your Age is: " + askingAge.nextInt());
        }else {
            System.out.println("please write something");
        }

        System.out.println(name.isEmpty() ? "The name is not valid" : name + "And your Age is: " + askingAge.nextInt());
    }


}
