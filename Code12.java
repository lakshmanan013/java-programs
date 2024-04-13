public class Code12 {
    public static void main(String[] args) {
        int a =5;
        int b=10;

        System.out.println(add(a,b));
        sub(a,b);
        System.out.println(mul(a,b));
        
    }

    static int add(int a,int b)
    {
        return a+b;
    }

    static void sub(int a , int b)
    {
      System.out.println(a-b);  
    }

    static int mul(int x,int y){
        return x*y;
    }





    
}
