public class SearchDriver {

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Monitor", "Electronics")
        };

        // Linear Search
        Product result1 = Search.linearSearch(products, 101);
        if (result1 != null) {
            System.out.println("PRODUCT FOUND " + result1);
        } else {
            System.out.println("PRODUCT NOT FOUND");
        }

        // Binary Search
        Product result2 = Search.binarySearch(products, 101);
        if (result2 != null) {
            System.out.println("PRODUCT FOUND " + result2);
        } else {
            System.out.println("PRODUCT NOT FOUND");
        }
    }
}