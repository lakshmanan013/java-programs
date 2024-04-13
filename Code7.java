import java.io.*; 
  
class Code7{ 
    // function to convert decimal to binary 
    static void decToBinary(int n) 
    { 
        // array to store binary number 
        int[] binaryNum = new int[32]; 
  
        // counter for binary array 
        int i = 0; 
        int c=0;
        while (n > 0) { 
            // storing remainder in binary array 
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
  
        // printing binary array in reverse order 
        for (int j = i - 1; j >= 0; j--) 

        if(binaryNum[j]==1){
           //System.out.print(binaryNum[j]); 
               
          c = c+ 1;
        }
        System.out.print(c);
         
    } 
  
    // driver program 
    public static void main(String[] args) 
    { 
        int n = 4; 

        decToBinary(n); 
        
    }
    
} 
  