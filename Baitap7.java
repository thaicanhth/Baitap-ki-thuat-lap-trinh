import java.util.Scanner;

public class Baitap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        System.out.print("Nhap y: ");
        int y = sc.nextInt();
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("Sau khi hoan vi: ");
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + ", y = " + y);
    }
}
