package com.company;

public class Palindrome {
        // write code here
        public static boolean isPalindrome(int number) {
            int reverse = 0;
            int originalNumber = number;
            while(number != 0)
            {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number/10;
            }

            System.out.println(reverse);
            System.out.println(originalNumber);
            if (originalNumber == reverse) return true;
            return false;
        }

}
