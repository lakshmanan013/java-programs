import java.util.Scanner;

public class Code11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int num=sc.nextInt();
        int count1=0;
        int count2=0;
        sc.close();
     
while(num!=0)
{
    int var1=num%10;
    if(var1%2==0)
    {
    count1++;
    }
    else{count2++;}
    num=num/10; 
    }
    System.out.println("Even:"+count1);
    System.out.println("Odd:"+count2);
} }