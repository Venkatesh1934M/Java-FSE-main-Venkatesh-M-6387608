public  class LinearSearch {
    public static Product search(Product[] products,String name){
        int n=products.length;
        for(int i=0;i<n;i++){
            if(products[i].product_name.toLowerCase()==name.toLowerCase()){
                return products[i];
            }

        }
        return null;
    }
}
