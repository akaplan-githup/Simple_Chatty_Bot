import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i=0;
        boolean x=true;

        while(x){
            if(scanner.nextInt()!=0){
                i++;
            }
            else{
                x=false;
            }
        }
        System.out.println(i);

    }


    }
