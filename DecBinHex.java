/*
Write a program to read in a string. The input will contain either a decimal (base 10, digits 0-9), hex
(base 16, digits 0-9, A,B,C,D,E,F) , or binary number (base 2, digits 0, 1). Convert then number to the
other two bases. The user will end the number with a D, H, or B as the last character to indicate the
base of the original number. Binary number outputs should be grouped in nibbles (4 bits), and
Hexadecimal number in two digit groups. The program should be able to handle inputs with or without
spaces in binary and hexadecimal number. The program should recognize error inputs, and handle
numbers up to 31 bits long
 */

import java.util.Scanner;
public class DecBinHex {
    public static void main(String [] args) {
        // Creates new scanner input and asks the user to write a number
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter either a Decimal, Binary or Hexadecimal number (end with D, B, or H respectively): ");
        String answer = keyboard.nextLine();

        // if last letter is d, then go through the converter d function
        if (Character.toLowerCase(answer.charAt(answer.length() - 1)) == 'd')
            converterD(answer);
        // if last letter is b, then go through the converter b function
        if (Character.toLowerCase(answer.charAt(answer.length() - 1)) == 'b')
            converterB(answer);
        // if last letter is h, then go through the converter h function
        if (Character.toLowerCase(answer.charAt(answer.length() - 1)) == 'h')
            converterH(answer);
    }


    public static void converterD(String val) {
        char[] hexVal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        //String holder = val.substring(0, val.length() - 1);

        // System.out.println(holder);
        int result = Integer.parseInt(val.substring(0, val.length() - 1));
        String answerB = "";
        String answerH = "";
        int remainderB;
        int remainderH;


        while (result >= 1) {
            remainderB = result % 2;
            answerB = remainderB + answerB;
            result = result / 2;
        }

        result = Integer.valueOf(val.substring(0, val.length() - 1));

        System.out.println(answerB + "B");

        while (result > 0) {
            remainderH = result % 16;
            answerH = hexVal[remainderH] + answerH;
            result = result / 16;
        }

        System.out.println(answerH + "H");
    }

    public static void converterB(String val) {
        char[] hexVal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        //String holder = val.substring(0, val.length() - 1);

        // System.out.println(holder);
        int result = Integer.parseInt(val.substring(0, val.length() - 1));
        String answerD = "";
        String answerH = "";
        int remainderD = 0;
        int remainderH;
        int sum = 0;

        for (int i = 0; i < val.length() - 1; i++) {
            sum = (2 * sum) + Character.getNumericValue(val.charAt(i));
            // System.out.println(Character.getNumericValue(val.charAt(i)));
        }

        result = sum;

        while (result > 0) {
            remainderH = result % 16;
            answerH = hexVal[remainderH] + answerH;
            result = result / 16;
        }

        System.out.println(sum + "D");
        System.out.println(answerH + "H");
    }

    public static void converterH(String val) {
        char[] hexes = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexVal = "ABCDEF";
        int[] hexValues = {10, 11, 12, 13, 14, 15};

        int result = Integer.parseInt(val.substring(0, val.length() - 1));
        String answerD = "";
        String answerB = "";
        int remainderD = 0;
        int remainderB;
        int sum = 0;
        String temp = "";
        int add = 0;

        for (int i = 0; i < val.length() - 1; i++) {
            temp = Character.toString(val.charAt(i));
            if (hexVal.contains(temp)) {
                add = hexValues[hexVal.indexOf(temp)];
                sum = (16 * sum) + add;
            }
            else {
                sum = (16 * sum) + Character.getNumericValue(val.charAt(i));
            }
        }

        result = sum;

        while (result >= 1) {
            remainderB = result % 2;
            answerB = remainderB + answerB;
            result = result / 2;
        }

        System.out.println(sum + "D");
        System.out.println(answerB + "B");
    }

}
