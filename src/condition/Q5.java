package condition;

import java.util.Locale;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
//        Write a Java program that requires the user to enter a single character from the alphabet.
//        Print Vowel or Consonant, depending on user input. If the user input is not a letter
//        (between a and z or A and Z), or is a string of length > 1, print an error message.

//        Input an alphabet: p
//        Expected Output :
//        Input letter is Consonant
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character here: ");
        String Char = sc.next().toLowerCase(Locale.ROOT);
//
//        if( Char == "a"||Char == "e"||Char == "i"||Char == "o"||Char == "u")
//        {
//            System.out.println("Vowel");
//        }
//        else {
//            System.out.println("Constant");
//        }


        switch (Char) {
            case "a":
                System.out.println("Vowel");
                break;
            case "e":
                System.out.println("Vowel");
                break;
            case "i":
                System.out.println("Vowel");
                break;
            case "o":
                System.out.println("Vowel");
                break;
            case "u":
                System.out.println("Vowel");
                break;
            default:
                System.out.println("constant");
//        }

        }
    }}
