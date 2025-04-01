class Product {
    private String productCode;
    private double price;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative!");
        }
    }
}

public class EncapsulationExample4 {
    public static void main(String[] args) {
        Product product = new Product();
        product.setProductCode("P12345");
        product.setPrice(199.99);

        System.out.println("Product Code: " + product.getProductCode());
        System.out.println("Product Price: $" + product.getPrice());
    }
}
