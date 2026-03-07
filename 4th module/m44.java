public class m44 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        // Use append() to concatenate strings
        sb.append(" Programming");
        sb.append(" is");
        sb.append(" powerful.");

        // 3. Convert to String and display
        String result = sb.toString();
        System.out.println(result);
        
        // Example of chaining append() calls
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hello").append(" ").append("World!");
        System.out.println(sb2.toString());
    }
}
