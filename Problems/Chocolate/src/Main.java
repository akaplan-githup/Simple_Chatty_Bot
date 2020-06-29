import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int k= scanner.nextInt();

        System.out.println(isBrokeable(n,m,k)?"YES":"NO");

    }

    public static boolean isBrokeable(int n,int m,int k){
        return ((k%n==0||k%m==0) && k <=n*m ) ;
    }
}