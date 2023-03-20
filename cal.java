import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cal {
    public static void main(String[] args) throws IOException {
        add(45,67,90);
        add(45,78);
        sub(34,12);
        mult(56,12);
        div(90,5);
    }
    public static void add(int num1,int num2,int num3)
    {
        System.out.println(num1+num2+num3);
    }
    public static void add(int num1,int num2)
    {
        System.out.println(num1+num2);
    }
    public static void sub(int num1,int num2)
    {
        System.out.println(num1-num2);
    }
    public static void mult(int num1,int num2)
    {
        System.out.println(num1*num2);
    }
    public static void div(int num1,int num2)

    {
        System.out.println(num1/num2);
    }
}
