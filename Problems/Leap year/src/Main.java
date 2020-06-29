//import org.junit.contrib.java.lang.system.ClearSystemProperties;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);


        int i= scanner.nextInt();

        if(i%4==0&&i%100!=0||i%400==0) System.out.println("Leap");

        else System.out.println("Regular");

    }
}