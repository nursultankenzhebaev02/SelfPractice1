package day14_LoopAndOverloading;

import java.util.Scanner;

public class factionalNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int num = input.nextInt();

        int sum = 1;

        for (int i =num; i >=1 ; i--) {
            sum *= i;
        }

        System.out.println(sum);

    }

}
