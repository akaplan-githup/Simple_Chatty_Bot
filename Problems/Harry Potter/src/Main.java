import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner= new Scanner(System.in);
        String x= scanner.nextLine();

        if(x.equals("gryffindor")){
            System.out.println("bravery");
        }
       else if(x.equals("hufflepuff")){
            System.out.println("loyalty");
        }
       else if(x.equals("slytherin")){
            System.out.println("cunning");
        }
       else if(x.equals("ravenclaw")){
            System.out.println("intellect");
        }
        else System.out.println("not a valid house");

    }
}