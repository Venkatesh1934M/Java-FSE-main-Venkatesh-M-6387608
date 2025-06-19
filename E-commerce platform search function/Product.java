public class Product{
    int product_id;
    String product_name;
    String category;
    public Product(int p,String pn,String c){
        product_id=p;
        product_name=pn;
        category=c;
    }
    public static String getProduct(Product p){
        return p.product_id+" "+p.product_name+" ("+p.category+")";
    }
}