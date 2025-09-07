import java.util.Scanner;


public class osaaaaa {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the corresponding switch value");
        int day = sc.nextInt();
        switch (day) {
            case 1://if case1 got true it will print all if we not use break after case 1 
            System.out.println("monday");
            break;
        case 2:
        System.out.println("tuesday");// if case 2 will true  only it will also print default case if we dont break after case2 
// thats why we need to use break keyword after each case so that next case will not use further 
break;
        
            default:
            System.out.println("wed-sun");
                break;
        }
    }
}
