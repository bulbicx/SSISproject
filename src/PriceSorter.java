import java.util.Comparator;

/**
 *This class is used from PriceSearch method and it is used for sorting Objects in a list based on price.
 * It is used again after sorting for the binary search inside the same method. It compares price between one 
 * Object and another.
 * 
 * @author Marco Castellana
 * @author Simone Agus
 */
public class PriceSorter implements Comparator<SSinfo> {

    public PriceSorter() {
    }
    

    @Override
    public int compare(SSinfo o1, SSinfo o2){
        return o1.getPrice() - o2.getPrice();
    }

}
