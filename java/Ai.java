 import java.util.Scanner;
public class Ai {
    public static void nitesh(){

    System.out.println(" its mee yami ");
}
public static void nitesh1(int a,int b){

    int sum=a+b;
    System.out.println(sum);
}

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

         int [] marks ={97,99,98};
         //System.out.println(marks[5]);
         // it show the error ''OUT OF BOUND'' and lets say we write somecode which is right 
         // but justa because it is written after that error it will also not print correect code
         // this is the real problem with error as they ot allow further code to execute if the code before them gives eror 
         // to shotout this problem we have:
         //TRY -CATCH in EXCEPTION HANDING.
         // things which you think it can genrate exception or say error put it inside try and then 
         // make a seprate block for catch which involve the workdone after catching the exception 
         // after this continue your process.
         try {
            System.out.println(marks[5]);
         } catch (Exception exception) {
            //  do something after catching 
         }
         System.out.println("the name is enough");
//**********************************function */
// function is always writtten before main function and th call of the function is done 
//in main function .

nitesh();
nitesh();
nitesh();
int usernum=0;
 System.out.println("the sum  of give nummber is ");    nitesh1(23, 3);
 int num = (int)(Math.random()*100);
do{
    
System.out.println("enter any number between 1 to 100");
usernum=sc.nextInt();

if(usernum==num){
    System.out.println("wow! you guess right");
    System.out.println("what !if i say yo need that amount of attempt you require to gain sucess in your life..haha!");
    break;
}
else if(usernum>num){
    System.out.println("your number is large !plz suggest smaller number");
}
else{

    System.out.println(" your number is too smaller");
}
}while(usernum>=0);
System.out.println( "okay ! here the anser");
System.out.println(num);

    }
}
