import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int[] integers = {1, 2, 3, 4, 5, 6, 7, 8 ,9 ,10};
        int[] intergers = new int[10];
        for (int i = 0; i < intergers.length; i++) {

            System.out.println("Enter an integer");
            intergers[i] = readIntergers();
        }
        System.out.println(Arrays.toString(intergers));
        int minAge = findMin(intergers);
        System.out.println("MinAge = " + minAge);


    } //-----------------------METHODS------------------------------------------------------------
    public static int readIntergers() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
    //------------------------------------------------------------
    public static int findMin(int[] intergers) {
        System.out.println(Arrays.toString(intergers));
        int sum = 0;
        int minAge = intergers[0];
        for (int i = 0; i < intergers.length; i++) {
            sum = intergers[i];
            System.out.println(intergers[i]);
            if (minAge > sum) {
                minAge = sum;
                System.out.println("Ny min: " + minAge);
            }
        }

            return minAge;

    }





}