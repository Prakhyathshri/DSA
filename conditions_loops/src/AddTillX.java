import java.util.Scanner;


// we need to do type conversion for this which i will do later
public class AddTillX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while(true){
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            if (num == 120 || num == 88){
                System.out.println(sum);
            } else {
                sum += num;
            }
        }

    }
}
