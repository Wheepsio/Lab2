import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Point3D x= new Point3D(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
        Point3D y= new Point3D(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
        Point3D z= new Point3D(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
        System.out.printf("S="+"%.2f", Point3D.computeArea(x,y,z));
    }
}