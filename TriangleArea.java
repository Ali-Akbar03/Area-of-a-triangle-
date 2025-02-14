import java.util.Scanner;

public class TriangleArea {
    public static void main(String[]args){
        int base;
        int height;
        double area;

        Scanner input= new Scanner(System.in);

        System.out.print("Enter the base- ");
        base= input.nextInt();
        System.out.print("Enter the height- ");
        height= input.nextInt();

        area= .5* base* height; // formula
        System.out.println("Area="+area);
    }
    
}
