import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Q - 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number");
        int num3 = scanner.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("first number the largest "+num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("second number the largest "+num2);
        }else if(num3 > num1 && num3 > num2){
            System.out.println("third number the largest "+num3);
        }

        // Q - 2
        System.out.println("Enter word ");
        String word = scanner.next();
        System.out.println("Enter index number ");
        int index = scanner.nextInt();
        System.out.println(word.charAt(index));


        // Q -3

        double sum = 0;
        int num=0;
        do {
            System.out.println("Enter number or zero for exit ");
            num= scanner.nextInt();
            sum += num;
        }while(num!=0);

        System.out.println("sum of numbers = "+sum);

        // Q -4
        int[] numbers = {10, -21 , 30, 31, -25};
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0) {
                System.out.println(numbers[i]+" is a positive number ");
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i]+" is a negative number ");
            }
        }


        // Q - 5
        String[] names = {"Tuwaiq","Bootcamp","Student","JAVA"};
        String shortest = null;
        for (int i = 0; i < names.length; i++) {
            shortest = names[i];
            int leng = names[i].length();
            if (leng > names[i].length()) {
                shortest = names[i];
            }

        }
        System.out.println(shortest);


    }

    }
