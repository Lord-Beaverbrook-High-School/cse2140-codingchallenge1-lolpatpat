// Patrick Browns code

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Input your 4 digit year: ");
        int year = myScan.nextInt();
        /* using MATHEMATICAL operations (no Strings), split a year
        Example: if the user enters 1989, the output would be:
        1
        9
        8
        9

         */
        int digit1 = (year/1000);//This line will give the first number after dividing by 1000
        int digit2 = ((year-digit1*1000)/100);// This line gives the second number after subtracting the first number and dividing by 100
        int digit3 = (((year-digit1*1000)-digit2*100)/10);// This line subtracts the first two digits and gets the third digit by dividing by 10
        int digit4 = (year%10);// This line gets the remainder for the final year

        System.out.println(digit1);// these lines print the 4 digits on 4 seperate lines
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);





    }
}
//Comment on how you tested the code to make sure it works in all situations
//the code works with all 4 digit numbers that i tried
//tested to make sure letters may not be input into the input statement
//tested to make sure that 0s didnt mess it up

//include tests that you ran
//input 10 different 4 digit numbers
//tried using common phrases in the input statement
//tried using all 0s and it came out correct
