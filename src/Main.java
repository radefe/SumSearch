import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers are there: ");
        int quantity = scan.nextInt();
        int[] numbers = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter number on index number " + i);
            numbers[i]=scan.nextInt();
        }
        System.out.println("Enter the sum: ");
        int sum = scan.nextInt();

        boolean flag = false;

        for (int j= 0; j < quantity; j++) {
            for (int k = 0; k < quantity; k++) {
                if (numbers[j] + numbers[k] == sum) {
                    System.out.println("index of first number is: " + j);
                    System.out.println("index of second number is: " + k);
                    flag = true;
                    break;
                }

            }
            if(flag)
                break;

        }
        if(!flag)
            System.out.println("No combination");
    }
}