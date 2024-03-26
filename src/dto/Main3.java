package dto;

public class Main3 {
    public static void main(String[] args) {
        Triangle[] triangles = new Triangle[2_000_000_0];
        for (int i = 0; i < triangles.length; i++) {
            triangles[i] = new Triangle(i);
            System.out.println(triangles[i].a +" ");
        }

        Triangle triangle1 = new Triangle(10);
        Triangle triangle2 = new Triangle(1,2,3);
        Triangle triangle3 = new Triangle(5,10);
        Triangle triangle4 = new Triangle();
        triangle4.a = 6;
        triangle4.b = 5;
        triangle4.c = 3;

    //    triangle.a = 10;
    //    triangle.b = 10;
    //    triangle.c = 10;
        System.out.println("---------");
        System.out.println(triangle1);
        System.out.println(triangle1.a);
        System.out.println(triangle1.b);
        System.out.println(triangle1.c);
        System.out.println("---------");
        System.out.println(triangle2);
        System.out.println(triangle2.a);
        System.out.println(triangle2.b);
        System.out.println(triangle2.c);
        System.out.println("---------");
        System.out.println(triangle3);
        System.out.println(triangle3.a);
        System.out.println(triangle3.b);
        System.out.println(triangle3.c);
        System.out.println("---------");
        System.out.println(triangle4);
        System.out.println(triangle4.a);
        System.out.println(triangle4.b);
        System.out.println(triangle4.c);
    }
}
