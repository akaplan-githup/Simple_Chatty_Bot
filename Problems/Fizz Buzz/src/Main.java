import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner= new Scanner(System.in);

        int number1= scanner.nextInt();
        int number2= scanner.nextInt();

        for(int i=number1;number1<=number2;number1++){

            if(number1%5==0&&number1%3==0) System.out.println("FizzBuzz");

            else if(number1%3==0) System.out.println("Fizz");
            else if(number1%5==0) System.out.println("Buzz");
            else System.out.println(number1);
        }
    }
}