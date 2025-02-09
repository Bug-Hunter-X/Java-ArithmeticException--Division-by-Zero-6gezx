public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = 0; 
        try {
            z = x / y; 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero."); // Handle the exception
            // Perform recovery or alternative logic
            z = Integer.MAX_VALUE; // Assign a default or safe value
        } finally {
            System.out.println(z); // Print the result, whether successful or not
        }
    }
}