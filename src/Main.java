//Made by Will Lund
import java.lang.*;
public class Main {

    public static void main(String[] args){

        System.out.println("TwoSum Problem");
        int sum = 12;
        String s = "MDCLXXI";
        int firstValue = 2;
        int secondValue = 4;
        int thirdValue = 7;
        int fourthValue = 8;
        int fifthValue = 8;
        int[] numbers = { 1,2,2,2,2,3,4,4,5,8};
       /* numbers[0]=firstValue;
        numbers[1]=secondValue;
        numbers[2]=thirdValue;
        numbers[3]=fourthValue;
        numbers[4]=fifthValue;*/
        TwoSum answer = new TwoSum();
        int[] toPrint = answer.twoSum(numbers,sum);
        System.out.println(toPrint[0] + "," + toPrint[1]);

        System.out.println();

        System.out.println("Roman to Integer");
        RomanToInt roman = new RomanToInt();
        System.out.println(roman.romanToInt(s));

        System.out.println();

        System.out.println("Remove duplicates from Array");

        RemoveDuplicateFromArray duplicate = new RemoveDuplicateFromArray();
        System.out.println(duplicate.removeDuplicateFromArray(numbers));

        System.out.println();


    }
}
