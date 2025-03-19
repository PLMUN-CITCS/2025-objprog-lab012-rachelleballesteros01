public class MethodDemo {
    public static void main(String[] args) {
        greet(); // Calling the greet method
        printMessage("This is my message!");
    }

    // Greet method
    public static void greet() {
        System.out.println("Hello from the greet method!"); 
    }

    // Print message method
    public static void printMessage(String message) {
        System.out.println(message);
    }
}