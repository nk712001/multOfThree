import java.util.Scanner;
public class multOfThree {

        public static void main(String[] args) {
            int a, b, c;

            Scanner input = new Scanner(System.in);

            System.out.println("enter the value of a: ");
            a=input.nextInt();

            System.out.println("enter the value of b: ");
            b=input.nextInt();

            System.out.println("enter the value of c: ");
            c=input.nextInt();

            input.close();
            int pro = a*b*c;
            System.out.println("multiplication of given numbers is: "+pro);

        }
    }



