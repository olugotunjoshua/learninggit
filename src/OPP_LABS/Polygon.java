package OPP_LABS;

import java.util.Scanner;

public interface Polygon {
 abstract void getArea();
 abstract void getVolume();
}

class  Triangle implements Polygon{
   int l, b,h;
    Scanner sc = new Scanner(System.in);
    @Override
    public void getArea() {

        System.out.println("Enter values for length: ");
         l = sc.nextInt();
        System.out.println("Enter values for breadth: ");
        b = sc.nextInt();

        int area = l * b;
        System.out.println(area);
    }

    @Override
    public void getVolume() {
        System.out.println("Enter values for length: ");
        l = sc.nextInt();
        System.out.println("Enter values for breadth: ");
        b = sc.nextInt();
        System.out.println("Enter values for height: ");
        h = sc.nextInt();

        int volume = l*b*h;
        System.out.println("Volume: "+ volume);
    }
}