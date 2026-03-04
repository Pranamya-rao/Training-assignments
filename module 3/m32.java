import java.util.Scanner;

class m32 {
    m32(double val) {
        if (val == 0) System.out.println("Zero");
        else System.out.println(val > 0 ? "Positive" : "Negative");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        new m32(sc.nextDouble());
    }
}
