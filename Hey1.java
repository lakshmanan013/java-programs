public class Hey1 {
    public static void main(String[] args) {
        int num=111100000;
        int temp;
        int rem;
        int count1=0;
        int count2=0;
        temp=num;
while(temp!=0){
    rem=temp%10;//4
    temp=temp/10;//123
    if(rem==1){
       count1=count1+1;
    }
   
}
System.out.print(count1 +" ");
while(num!=0){
    rem=num%10;//4
    num=num/10;//123
    if(rem==0||rem==1){
        count2=count2+1;
        
    }

}System.out.println(count2);
    
}
}