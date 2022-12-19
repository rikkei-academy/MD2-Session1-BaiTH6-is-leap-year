package ra.academy;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = sc.nextInt();
        boolean isLeapYear = false;
        if(year%4==0){
            if (year % 100 == 0) {
                if(year%400 == 0){
                    isLeapYear = true;
                }
            }else {
                isLeapYear=true;
            }
        }
        if(isLeapYear){
            System.out.println(year+" is a leap year");
        }else {
            System.out.println(year+" is NOT a leap year");
        }
    }
}
