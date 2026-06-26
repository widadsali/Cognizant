public class SingletonTest{

    public static void main(String[] args) {
        
        System.out.println("--- Testing Singleton Logger ---");
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.log("Application started successfully.");
        logger2.log("User logged in.");

        System.out.println("\n--- Verification ---");
        if (logger1==logger2) {
            System.out.println("SUCCESS: logger1 and logger2 are the same instance.");
        } else {
            System.out.println("FAILURE: Different instances were created.");
        }


        System.out.println("Hashcode for logger1: " + logger1.hashCode());
        System.out.println("Hashcode for logger2: " + logger2.hashCode());
    }
}