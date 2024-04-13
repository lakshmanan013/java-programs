public class Hey {
    public static void main(String[] args) {
        int num=1234;
        int temp;
        int rem;
        temp=num;
while(temp!=0){
    rem=temp%10;//4
    temp=temp/10;//123j
    if(rem%2==0){
        System.out.print(rem+" ");
    }
}
System.out.println();
while(num!=0){
    rem=num%10;//4
    num=num/10;//123
    if(rem%2!=0){
        System.out.print(rem+" ");
    }

}
    
}
}