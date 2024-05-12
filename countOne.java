//write a program to count th enumber of 1's in a binary representation of the number
import java.util.Scanner;

public class countOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Number : ");
        int number = sc.nextInt();

        System.out.println("Number : "+number);
        System.out.println("Number of 1's in it's binary representation : "+countOnes(number));
    }

    public static int countOnes(int n){
        int count =0;

        //loop through each bit of th enumber

        while(n!=0){
            //increase count if the least significant bit is 1

            count +=n & 1;

            //shift the number to the right by 1 bit

            n = n >>>1;

        }
        return count;
    }
}
