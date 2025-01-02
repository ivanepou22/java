package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Car car = new Car();
//        car.setModel("barrera");
//        System.out.println(car.getModel());
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

//        Person person = new Person();
//        person.setFirstName("");   // firstName is set to empty string
//        person.setLastName("");    // lastName is set to empty string
//        person.setAge(-10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");    // firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");    // lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());

//        BankAccount bankAccount = new BankAccount();
//        bankAccount.setAccountNumber("0101019020098");
//        bankAccount.setBalance(3000000);
//        bankAccount.setCustomerName("Ivan Epou");
//        bankAccount.setEmail("ivanepou92@gmail.com");
//        bankAccount.setPhoneNumber("+256700485851");
//        bankAccount.depositFunds(5000000);
//        System.out.println("------");
//        bankAccount.withdrawFunds(5000000);
//        System.out.println(isPalindrome(-707));

//        System.out.println(hasSameLastDigit(62, 882, 772));
//        System.out.println(isPerfectNumber(6));
//        System.out.println(numberToWords(123));
//        numberToWords(123);

//        System.out.println(canPack(4, 18, 19));

        System.out.println(getLargestPrime(0));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;

        //Reverse the integer value
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
       //check whether it's a palindrome.
        if (originalNumber == reverse) return true;
        return false;
    }

    public static int sumDigits(int number){
        if(number < 0) return -1;
        int sum = 0;

        while (number > 9) {
            sum += number % 10;
            number = number/10;
        }

        sum += number;
        return sum;
    }


    public static boolean hasSharedDigit(int first, int second) {

        boolean firstValid = first > 9 && first < 100;
        boolean secondValid = second > 9 && second < 100;

        if (!firstValid || !secondValid) {
            return false;
        }

        int firstLeftDigit = first / 10;
        int firstRightDigit = first % 10;
        int secondLeftDigit = second / 10;
        int secondRightDigit = second % 10;

        boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
        boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;

        return firstShared || secondShared;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if ((num1 < 10) || (num1 > 99)) return false;
        if ((num2 < 10) || (num2 > 99)) return false;
        if ((num3 < 10) || (num3 > 99)) return false;

        int numOneLastDigit = num1 % 10;
        int numTwoLastDigit = num2 % 10;
        int numThreeLastDigit = num3 % 10;

        int equalCounts = 0;

        if(numOneLastDigit == numTwoLastDigit) equalCounts+=1;
        if(numOneLastDigit == numThreeLastDigit) equalCounts+=1;
        if(numTwoLastDigit == numThreeLastDigit) equalCounts+=1;

        System.out.println("===============");
        System.out.println(equalCounts);

        if(equalCounts > 1) return true;
        return false;
    }

    public static boolean isPerfectNumber(int number){
        if(number < 1) return false;

        int sum = 0;

        for (int i=1; i <= number/2; i++) {
            System.out.println(i);
            if((number % i) == 0) {
                sum = sum + i;
            }
        }
//        System.out.println(sum);
        if(sum == number){
            return true;
        }

        return false;
    }


//    public static void numberToWords(int number) {
//        if (number < 0){
//            System.out.println("Invalid Value");
//        }
//
//        int reverse = reverse(number);
//        int reverseNumber = 0;
//        int remainder = 0;
//        while(reverse > 9)
//        {
//            remainder = reverse % 10;
//            reverseNumber = reverseNumber * 10 ;
//            reverse = reverse/10;
//
//            switch (remainder){
//                case 0:
//                    System.out.println("Zero");
//                    break;
//                case 1:
//                    System.out.println("One");
//                    break;
//                case 2:
//                    System.out.println("Two");
//                    break;
//                case 3:
//                    System.out.println("Three");
//                    break;
//                case 4:
//                    System.out.println("Four");
//                    break;
//                case 5:
//                    System.out.println("Five");
//                    break;
//                case 6:
//                    System.out.println("Six");
//                    break;
//                case 7:
//                    System.out.println("Seven");
//                    break;
//                case 8:
//                    System.out.println("Eight");
//                    break;
//                case 9:
//                    System.out.println("Nine");
//                    break;
//            }
//        }
//
//        switch (reverse){
//            case 0:
//                System.out.println("Zero");
//                break;
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            case 4:
//                System.out.println("Four");
//                break;
//            case 5:
//                System.out.println("Five");
//                break;
//            case 6:
//                System.out.println("Six");
//                break;
//            case 7:
//                System.out.println("Seven");
//                break;
//            case 8:
//                System.out.println("Eight");
//                break;
//            case 9:
//                System.out.println("Nine");
//                break;
//        }
//    }

//    public static int reverse(int number){
//        int reverseNumber = 0;
//
//        while(number != 0)
//        {
//            int remainder = number % 10;
//            reverseNumber = reverseNumber * 10 + remainder;
//            number = number/10;
//        }
//
//        return reverseNumber;
//    }

//    public static int getDigitCount(int number){
//        if(number < 0) return -1;
//        if (number == 0) return 1;
//
//        int count = 0;
//        while (number != 0) {
//            number /= 10;
//            ++count;
//        }
//
//        return count;
//    }



        public static int reverse(int number) {

            int reverse = 0;
            while (number != 0) {
                // multiply by 10 then and add last digit (number % 10)
                reverse = reverse * 10 + number % 10;
                number /= 10; // discard last digit
            }
            return reverse;
        }

        public static int getDigitCount(int number) {

            if (number < 0) {
                return -1;
            }

            if (number == 0) {
                return 1;
            }

            int count = 0;
            // start from 1 and multiply by 10 each step so i goes 1, 10, 100, 1000
            // count how many times it was multiplied, and that's the digit count
            for (int i = 1; i <= number; i *= 10) {
                count++;
            }
            return count;
        }

        public static void numberToWords(int number) {

            if (number < 0) {
                System.out.println("Invalid Value");
                return;
            }

            // get reversed number
            int reverse = reverse(number);

            // subtract numberDigits and reverseDigits to get leading zeroes
            int leadingZeroes = getDigitCount(number) - getDigitCount(reverse);

            if (number == 0) {
                System.out.println("Zero");
                return;
            }

            // use loop to print words
            while (reverse != 0) {
                int lastDigit = reverse % 10;
                switch (lastDigit) {
                    case 0:{ System.out.println("Zero"); break;}
                    case 1:{ System.out.println("One"); break;}
                    case 2 :{ System.out.println("Two"); break;}
                    case 3:{ System.out.println("Three"); break;}
                    case 4:{ System.out.println("Four"); break;}
                    case 5:{ System.out.println("Five"); break;}
                    case 6:{ System.out.println("Six"); break;}
                    case 7:{ System.out.println("Seven"); break;}
                    case 8:{ System.out.println("Eight"); break;}
                    case 9:{ System.out.println("Nine"); break;}
                }
                reverse /= 10;
            }

            // print zeroes if there are any leading zeroes in reversed number
            for (int i = 0; i < leadingZeroes; i++) {
                System.out.println("Zero");
            }
        }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if((bigCount < 0) ||(smallCount < 0) || (goal < 0)) return false;
        int bigCountKg = 5 * bigCount;

        if ((bigCountKg) > goal) return false;
        if ((bigCountKg+smallCount) < goal) return false;

        if((bigCountKg + smallCount) >= goal) return true;

        return  false;
    }

    private static final int BIG_WEIGHT = 5;

    public static boolean canPack1(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;
        int totalBigWeight = bigCount * BIG_WEIGHT;
        if (totalBigWeight >= goal) {
            int remaining = goal % BIG_WEIGHT;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
     }

    public static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {

            if(i % j == 0)
            {
                return false;
            }

        }
        return true;
    }

    public static int getLargestPrime(int number){
        if (number < 0) return -1;

        int countPrime = 0;
        int largestPrime = 0;
        for (int i = 1; i <= number/2; i++){
            if ((number % i) == 0) {
                if(isPrime(i)) {
                    ++countPrime;
                    if(largestPrime > i) {
                        largestPrime = largestPrime;
                    } else
                        largestPrime = i;
                }
            }
        }
        if(countPrime>0){
            return largestPrime;
        }
        return -1;
    }

    }


