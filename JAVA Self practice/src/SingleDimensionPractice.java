import java.util.Arrays;
public class SingleDimensionPractice {
    public static void main() {
        int[] num = {7,1,3,6,5,2,4};
        Arrays.sort(num);
      int search =  Arrays.binarySearch(num, 3);
        System.out.println(search);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println(" ");
        int[] num2 = {7,1,3,6,5,2,4};
        Arrays.sort(num2);

        System.out.println(Arrays.equals(num, num2) + " " + num[0] + " " + num2[num2.length -1]);
//        System.out.println(num.length -1);
    }


}
