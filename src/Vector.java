import java.util.Scanner;

public class Vector {
    private int[] vector = null;
    public Vector(int[] vector)
    {
        this.vector = vector;
    }
    protected void sum(Vector anotherVector)
    {
        int[] sumV = new int[vector.length];
        for(int i = 0; i < vector.length; i++)
            sumV[i] = vector[i] + anotherVector.vector[i];
        System.out.print("{");
        for(int item: sumV)
            System.out.print(" " + item + " ");
        System.out.print("}");
    }
    protected void subtraction(Vector anotherVector)
    {
        int[] subtractionV = new int[vector.length];
        for(int i = 0; i < vector.length; i++)
            subtractionV[i] = vector[i] - anotherVector.vector[i];
        System.out.print("{");
        for(int item: subtractionV)
            System.out.print(" " + item + " ");
        System.out.print("}");
    }
    protected void multiplication(int num)
    {
        int[] multiplicationV = new int[vector.length];
        for(int i = 0; i < vector.length; i++) {
            vector[i] *= num;
            multiplicationV[i] = vector[i];
        }
        System.out.print("{");
        for(int item: multiplicationV)
            System.out.print(" " + item + " ");
        System.out.print("}");
    }
    public static void suma(Vector a, Vector b)
    {
        a.sum(b);
    }
    public static void subtraction(Vector a, Vector b)
    {
        a.subtraction(b);
    }
    public static void multiplication(Vector a, int number)
    {
        a.multiplication(number);
    }
    public static void main(String[] args) {
        System.out.print("Введіть кількість елементів у векторах A, B: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.print("Введіть елементи вектора A(через пробіл): ");
        for(int i = 0; i < n; i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.print("Введіть елементи вектора B(через пробіл): ");
        for(int i = 0; i < n; i++)
        {
            b[i] = scan.nextInt();
        }
        System.out.print("Введіть число для множення на вектор: ");
        int num = scan.nextInt();
        Vector v1 = new Vector(a);
        Vector v2 = new Vector(b);
        System.out.print("Сума векторів = "); Vector.suma(v1,v2); //v1.sum(v2);
        System.out.print("\nРізниця векторів:\n");
        System.out.print("A - B = "); Vector.subtraction(v1,v2); //v1.subtraction(v2);
        System.out.print("\nB - A = "); Vector.subtraction(v2,v1); //v2.subtraction(v1);
        System.out.print("\nМноження числа на вектор А = "); Vector.multiplication(v1,num); //v1.multiplication(num);
        System.out.print("\nМноження числа на вектор B = "); Vector.multiplication(v2,num); //v2.multiplication(num);
    }
}