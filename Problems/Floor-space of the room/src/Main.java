import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String x= scanner.nextLine();

        if(x.equals("circle")) formula(scanner.nextDouble());
        if(x.equals("triangle")) formula(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
        if(x.equals("rectangle")) formula(scanner.nextDouble(),scanner.nextDouble());




    }

    public  static void  formula(double a,double b,double c){
        double p=(a + b + c) / 2;

        System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));

    }
    public static  void formula(double a,double b){
        System.out.println(a*b);

    }
    public static  void formula(double a){

        System.out.println((3.14)*a*a);
    }
}