import java.util.Scanner;

public class Osaaa {
    public static void main(String[] args) {
Scanner sc  = new Scanner(System.in);
System.out.println("enter the value of num1:");
int num1 =sc.nextInt();
System.out.println("enter the value of num2:");
int num2 =sc.nextInt();
//this is just opposite of what  and does it act like or gate 
// eiter of the  fufilled the caes the it is allowed .
if (num1<20||num2<20) {
    System.out.println("either of them is less than 20 ");
    
}
//boolean is_adult=true;
boolean is_adult=true;
if (!is_adult) 
    System.out.println("yes adullt");
    

else
System.out.println("not adult");
    }
    
}
