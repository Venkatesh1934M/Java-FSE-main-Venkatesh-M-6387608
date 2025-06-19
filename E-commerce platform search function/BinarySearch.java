import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product bsearch(Product[] products,String name){
        Arrays.sort(products,Comparator.comparing(p->p.product_name.toLowerCase()));
        int l=0;
        int r=products.length-1;
        
        while(l<=r){
            int mid=(l+r)/2;
         int cm=products[mid].product_name.compareToIgnoreCase(name);
         if(cm==0)return products[mid];
         else if(cm<0){
            l=mid+1;
         }
         else{
            r=mid-1;
         }
        }
        return null;
    }
}
