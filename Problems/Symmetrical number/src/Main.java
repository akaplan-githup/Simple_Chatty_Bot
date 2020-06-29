import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

       int i= scanner.nextInt();

       if(i<1000)
       {
           String str= Integer.toString(i);
           char o='0';
           String str2= o+str;

           StringBuilder x= new StringBuilder(str2);
           String rvrs= x.reverse().toString();

           if(rvrs.equals(str2)){
               System.out.println(1);
           }
           else System.out.println((int)(Math.random()*100+3));
       }
       else {
        String str=Integer.toString(i);

           StringBuilder x= new StringBuilder(str);
           String str2= x.reverse().toString();

           if(str2.equals(str)) System.out.println(1);
            else System.out.println((int)(Math.random()*100+3));

       }


    }
}