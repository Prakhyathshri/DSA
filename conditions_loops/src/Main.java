import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q: Print numbers from 1 to 5
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        //Q: Print numbers from 1 to n
        System.out.print("Enter the ending number: ");
        int n = sc.nextInt();
        for(int num = 1; num <= n; num++){
            System.out.println(num + " Hi people");
        }

        //while loops
        /*
            syntax:
            while(Condition){
                body
            }
         */

        int num = 1;
        while(num <= 5){
            System.out.println(num);
            //num++;
            num += 1;
        }

        //do while loop
        /*
           do {
           body
           } (condition);

         */
        //The loop is going to execute atleast once

        int nn = 1;
        do {
            System.out.println("Hello");

        } while (nn != 1);


    }
}