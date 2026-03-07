public class m43 {
    public static void main(String[] args) {
        String s1 = "Java"; 
        String s2 = s1;     

        System.out.println("Before modification:");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("Are s1 and s2 pointing to the same object? " + (s1 == s2));

        s1 = s1.concat(" Programming");

        System.out.println("\nAfter modification attempt (s1.concat):");
        System.out.println("s1: " + s1); // s1 now points to a NEW object
        System.out.println("s2: " + s2); // s2 still points to the ORIGINAL "Java" object
        
        System.out.println("Are s1 and s2 still pointing to the same object? " + (s1 == s2));
    }
}
