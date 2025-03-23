import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       double centralangle, radius, area, pi=3.14;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the radius: ");
       radius = input.nextDouble();
       System.out.print("Enter the centralangle: ");
       centralangle = input.nextDouble();
       area = (pi*(radius*radius)*centralangle)/360;
       System.out.print("The area is " + area);

    }
}