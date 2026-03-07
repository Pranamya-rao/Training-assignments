
public class Question3 {
    static void checkAge(int age) throws Exception {
        if (age < 18){
            throw new Exception("invalid age");
        }
        System.out.println("valid age");
    }
    public static void main(String[] args) throws Exception {
        try {
            checkAge(17);
        }catch(Exception e){
            System.out.println("Invalid age");
        }
    }
}