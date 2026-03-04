import java.util.Scanner;
public class m14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double cel, fah;
        System.out.print("Enter temperature in cel:");
        cel = sc.nextDouble();
        fah=(cel*9.0/5.0) + 32;
        System.out.println("fah:"+fah);
    }
}