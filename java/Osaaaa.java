import java.util.Scanner;


public class Osaaaa {
    public static void main(String[] args) {
Scanner sc =new Scanner( System.in );
System.out.println("enter the value of amount you have");
int num1=sc.nextInt();
if (num1>60) {
    System.out.println("you can buy both of them "); 
}
else if (num1>10 && num1 <50) {
    System.out.println("you can buy only one of them ");
}
else{

    System.out.println("you can not buy  anything ");
}

}
}
