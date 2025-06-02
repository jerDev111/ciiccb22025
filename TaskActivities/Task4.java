package TaskActivities;
import java.util.Scanner;

class Task4 {

    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter a word:"); String put = sc.nextLine();  
         
         
        StringBuilder sb = new StringBuilder(put);
 String baliktad = sb.reverse().toString();

    
        if (put.equalsIgnoreCase(baliktad)) {  System.out.println("palindrome");}
        else { System.out.println("not palindrome.");}
        
        

        sc.close();
    }
}

