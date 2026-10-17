import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
             Scanner myObj=new Scanner(System.in);
             System.out.println("the side of square is" );
             int side=myObj.nextInt();
             int area=side*side;
             System.out.println("the area of square is" +area);  
             Scanner myObj1=new Scanner(System.in);
             System.out.println("the length of rectangle is" );
             int length=myObj1.nextInt();
              Scanner myObj2=new Scanner(System.in);
             System.out.println("the breadth of rectangle is" );
             int breadth=myObj2.nextInt();
             int areaofrectangle=length*breadth;
             System.out.println("the area of rectangle is"+areaofrectangle );
             Scanner r=new Scanner(System.in);
             System.out.println("the radius of the circle is");
             int radius=r.nextInt();
             int areaofcircle=radius*radius;
             System.out.println("the area of circle is" +areaofcircle );
             
              
    }
}
