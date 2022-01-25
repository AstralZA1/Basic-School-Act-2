import java.util.Scanner;
public class FactorialCalculator{
    private static Scanner input;
    public static void main(String[]args){
        input = new Scanner(System.in);
        int num;
        int fact;
        System.out.println("<-------Factorial Calculator------->");
        for(int i =0; i<5; i++){
            fact = 1;
            System.out.print("Enter a positive Integer: ");
            num = input.nextInt();
            if(num>0){
                System.out.print(num+"!= "); 
                for(int j=1; j<=num;j++){
                    System.out.print(j);
                    fact = fact*j;
                    if(j<num){
                        System.out.print(" x ");
                        }
                    }
                    System.out.println("\nThe Factorial of "+ num + " is: " + fact);
            }else if(num<0){
                System.out.println("Invalid input! Program stopped!");
                break;
            }
        }
        }
    }
