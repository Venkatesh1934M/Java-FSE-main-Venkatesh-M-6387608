public class Main {
    public static void main(String[] args) {
        Product[] products={new Product(1,"mobile","electronics"),
        new Product(2,"book","stationary"),
    new Product(3,"shirt","dress")};
    Product p1=LinearSearch.search(products, "book");
    Product p2=BinarySearch.bsearch(products, "shirt");
    System.out.println((p1!=null)?Product.getProduct(p1):"Product not found");
    System.out.println((p2!=null)?Product.getProduct(p2):"Product not found");
    }
    
}
