import java.util.Scanner;
public class m23ly{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year= sc.nextInt();
        sc.close();
        if((year %4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}