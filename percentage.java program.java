
import java.util.Scanner;
public class percentage {
    //this is the main method
public static void main(String[] args) {
    //we create S1 as object and taking user input
    Scanner S1=new Scanner(System.in);
System.out.println("Enter the first number");
int sub1=S1.nextInt();
System.out.println("Enter the second number");
int sub2=S1.nextInt();
System.out.println("Enter the third number");
int sub3=S1.nextInt();
//formula for percentage 
double percentage=(sub1+sub2+sub3)*100/300;
System.out.println(percentage);



}


}
