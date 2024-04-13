public class Code15 {
    public static void main(String[] args) {
        int n=6;
        int num1=0;
        int num2=1;
        int res;
     
     for(int i=2;i<=n;i++){
        res = num1+num2;
        num1=num2;
        num2=res;
        System.out.println(res);
     }
}
}