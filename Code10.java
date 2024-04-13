public class Code10 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1,k=1;j<i+1;j++,k++)
            {
                if(i>2 && i<5 && j!=1 && j!=i)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print(k);
                }
            }
            System.out.println();
 
        }
    }
    
}
