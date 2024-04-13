public class first {
    public static void main(String[] args) {
        int num1=44;
        int num2=66;
        System.out.println(add(num1,num2));
    }
    public static int add (int num1,int num2){
        int res=0;
        int mul=1;
        int val;
        while(true)
        {
            if(num1==0 && num2==0)
            break;
        
        val=(num1 % 10)+(num2 % 10);
        val=val%10;

        res=(val*mul)+res;
        num1=num1/10;
        num2=num2/10;

        mul = mul*10;
        }
        return res;
    }

    
}
