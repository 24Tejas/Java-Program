import java.util.Scanner;

public class triangle_area {
    //we create main method 
        public static void main(String[] args)
    {
    
    //tri is an object 
        Scanner tri =new Scanner(System.in);
            System.out.println("ENTER THE BASE OF TRIANGLE");
        int a =tri.nextInt();
            System.out.println("ENTER THE HEIGHT OF A TRIANGLE");
        int b =tri.nextInt();
    //area of traiangle formula 
        double area =a*b*(0.5);
            System.out.println("AREA OF TRIANGLE IS "+area);
    }
}
