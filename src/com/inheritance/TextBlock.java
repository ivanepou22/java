package com.inheritance;

public class TextBlock {
    public static void main(String[] args) {
        String bulletIt = "Print  a bulleted list:\n"+
                "\t\u2022 First Point\n"+
                "\t\t\u2022 sub Point";
        System.out.println(bulletIt);

        //Text Block
//        String blockText = """
//        Print a Bulleted List:
//                \u2020 First Point
//                    \u2022 Sub Point
//    """;

        int age = 32;
        System.out.printf("Your age is %d\n", age);
        int yearOfBirth = 2024-age;
        System.out.printf("Age = %d, Birth year %d", age, yearOfBirth);

    }
}
