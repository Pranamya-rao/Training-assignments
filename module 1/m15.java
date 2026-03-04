public class m15{
    public static void main(String[] args){
        int a=10; int b=20;
        System.out.println("Before m15:"+ a +" "+ b);
       // without third variable//
       /* a = a + b;
        b = a - b;
        a = a - b;*/

        // with third variable//
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After m15:"+ a +" "+ b);
    }
}