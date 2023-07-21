import java.util.Scanner;

public class Factorial {
    public static int fact(int num)
    {
        if(num==1)
        {
            return num;
        }
        return num*fact(num-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(fact(num));
    }

}
