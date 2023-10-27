import java.util.Scanner;

public class SecondFile {
    public static void helloBulb() {
        Scanner userName = new Scanner((System.in));
        System.out.println("Please Enter your Name");
//        System.out.println("userName = " + userName.nextLine());
       String name = "Welcome to the Bulb Africa  " + userName.nextLine();
        for (int i = 1; i <= 5 ; ++i) {
//            System.out.println("Hello "+  name + userName.nextLine());

            System.out.println("Hello "+  name + "  " + i);

            for (int j = 1; j <=1 ; j++) {
                System.out.println("WELCOME once Again " + j);
            }
        }


        ThirdFile allFile = new ThirdFile();
        allFile.checkingUserData();
    }
}
