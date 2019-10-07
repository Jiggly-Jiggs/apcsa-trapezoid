import java.util.Scanner;

public class trapezoid {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\nInsert TOP value of a trapezoid : ");
        double top = in.nextDouble();
        System.out.print("Insert BOTTOM value of a trapezoid : ");
        double bottom = in.nextDouble();
        System.out.print("Insert HEIGHT value of a trapezoid : ");
        double height = in.nextDouble();

        double area = (((top + bottom) / 2) * height);

        System.out.printf("\nThe area of the trapezoid is %.1f", area);
        in.close();
      }
}
