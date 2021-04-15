package evan;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) 
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("eneter first number");
        int a=scan.nextInt();
        System.out.println("eneter second number");
        int b=scan.nextInt();
        int prod=a*b;
        System.out.println(prod);

    }
}
