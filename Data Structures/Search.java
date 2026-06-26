class Product implements Comparable<Product> {

    int product_id;
    String product_name;
    String category;

    public Product(int productId, String productName, String category) {
        this.product_id = productId;
        this.product_name = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return this.product_id + " " + this.product_name + " " + this.category;
    }

    @Override
    public int compareTo(Product product) {
        return Integer.compare(this.product_id, product.product_id);
    }
}

class Search {

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.product_id == targetId) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].product_id == targetId) {
                return products[mid];
            } else if (targetId < products[mid].product_id) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }
}