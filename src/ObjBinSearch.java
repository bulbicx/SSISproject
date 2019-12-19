
import java.util.Comparator;
import java.util.List;

/**
 *This class is used to perform a binary search between objects. It comes from Collections and
 * it use a list where it is needed to apply the search, the key to be searched and the comparator
 * to be used. It is used in GUISofa class to do a search based on price. The list must be sorted before implementing
 * BinarySearch.
 * 
 * (K)the class of the objects in the list.
 * (list) the list to be searched
 * (key) the key to be searched for
 * 
 * @author Marco Castellana
 * @author Simone Agus
 */
public class ObjBinSearch {
 
    public static <K> int binarySearch(List<? extends K> lis, K key, Comparator<? super K> comp){
        
        int low = 0;
        int high = lis.size()-1;

        while (low <= high)
        {
            int mid = (low + high)/2; //get mid point
            K midVal = lis.get(mid);
            int compPrice = comp.compare(midVal, key);// it goes to ComparePrice class
            
            if(compPrice < 0)
            {
                low = mid + 1;
            }
            else if(compPrice > 0)
            {
               high = mid - 1;
            }
            else 
                {   
                    return mid; // key found
                }
        } 
        return -1;
        
    }
}
