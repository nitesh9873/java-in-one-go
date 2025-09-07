import java.util.Scanner;

public class Osaa {
    public static void main(String[] args) {
       //******** */ //casting 
        // it simply means overwriting or say overing 
        // rememmber with the help of example of bucket and glass
        // just like water inside a glass can be pour in bucket but water inside bucket can not  be pour inside 
        //glass because bucket water is way to large than glass water.
        // similarly the smaller  element can be accomated inside bigger  one but a bigger one can  not be put inside a smaller one.
        //here the range of float is 8 which is gretaer than the range of int which is 4. 
        //  so a int can accomadate inside float but a float can not be accomadted inside int .
        // this prperty in java is called casting .
        // here is the quick example to see how its works .
        double price = 100.00;//double 
        double finalprice =price+18;//int inside double -->works
        System.out.println(finalprice);
        int p=100;//integer 
        int fp=p+(int) 18.9;//double inside int-->not works without having int before 18.9;
        //after writing int they take this as a int not as a float.
        System.out.println(fp);
        //*****************CONSTANTS 
//int age=32;
//age=33;
final int AGE=5;
final float PI=3.14F;
//ALWAYS TRY  TO WRITE THINGS TO MKAE CONSTANT IN CAPITAL LETTER.
System.out.println(AGE);
System.out.println(PI);
//******************OPERATORS 
///>>>ARITHMETIC OPERATOR 
//simple maths plus minus multiply divide 
//one special operotor that dint exits in real world application 
//that is modulo
//it give the remainder when you divide the two number 
int a =5;
int b=4;
int modulo=a%b;

System.out.println(modulo);
//>>>UNIARY OPERATOR 
System.out.println(a--);//will print 5 but pass 4 to next 
System.out.println(--a);//it minus at that point so 4-1=3 and pass to next
System.out.println(++a);//it add here itself so 3+1=4 and pass to next 
System.out.println(a++);//it print what it have at that time that is 4 but pass 4-1=3 to the next 
//*******************MATHS */
// it have multiple maths operation which we can use  like max min random etc 
System.out.println(Math.random());// everytime it give a new number  in terms of length 
System.out.println((int)Math.random());// in integer it always give zero  0
System.out.println((int)(Math.random()*100));// have done some modification in random value to get same integer value 
//********************input from users 
Scanner sc  = new Scanner(System.in);
System.out.println("type your age ");
int age=sc.nextInt();
System.out.println(age);
System.out.println("enter your name :");
String name =sc.next();
sc.nextLine();// extra sc.next line in order to print nextline statement also.
//alaways clear the new line before using nextline .
//after nextint() ,next double () ,next() always call an exra sc.nextline() before using nextLine() .
System.out.println(name);
System.out.println("enter a line about yourself");
String fullname =sc.nextLine();
System.out.println(fullname);
//**********comparsion operator  */
/* a==b
 * a!=b
 * a>b
 * a<b
 * a>=b
 * a<=b
*/
//******************conditional statement  */
boolean are_you_young=true;
if (are_you_young==true) 
System.out.println("your age must be greater than or equal to 18");
else
System.out.println("you are not 18 or more ");
    System.out.println("enter your  adhar age ");
    int adhar_age=sc.nextInt();
    
if ( adhar_age>=18) 
System.out.println("yes you  are eligibe ");
else
System.out.println("not eligible, sorry! try next year !  ");
//*********** logical  operator  */
    System.out.println("enter your  num1 ");
    int num1=sc.nextInt();
     System.out.println("enter your  num2 ");
    int num2=sc.nextInt();
    if (num1<50 && num2<50) {
        System.out.println("both less than 50");

    }
    

}




}