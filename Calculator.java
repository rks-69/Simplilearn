import java.util.Scanner;
public class Calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double num1,num2;
        System.out.println("Enter first number:");
        num1=sc.nextDouble();
        System.out.println("Enter second number:");
        num2=sc.nextDouble();
        System.out.println("Enter an operator: +, -, *, /");
        char ch=sc.next().charAt(0);
        double output;
        switch(ch)
        {
            case '+':
                output=num1+num2;
                break;
            case '-':
                output=num1-num2;
                break;
            case '*':
                output=num1*num2;
                break;
            case '/':
                output=num1/num2;
                break;
            default:
                System.out.println("Wrong operator encountered!!!");
                return;
        }
        System.out.println(num1+" "+ch+" "+num2+" = "+output);
        sc.close();
    }
}