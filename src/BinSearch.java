
import java.util.ArrayList;
/**
* This Binary search class can search a value from an arrayList
* If not found, return a value less than 0
* If found, return a value greater than or equals to 0
* Para@ name is an arrayList
* Para@ low first index of arrayList
* Para@ high is the last index of arrayList
* Para@ key is string to be searched from arrayList name.
* This class is used to perform binary search in GUISofa class based on category.
* 
* @author Marco Castellana
* @author Simone Agus
**/

public class BinSearch {
    
    public static int binarySearch(ArrayList<String> name, int low, int high, String key){

        if (low <= high)
        {
            int mid = (low + high)/2; //get mid point
            if (name.get(mid).equals(key))
            {
               return mid; 
            }
            else if ((key.compareTo(name.get(mid))) < 0)
            {
                return binarySearch(name, low, mid-1, key);
            } else 
                {
                return binarySearch(name, mid+1, high, key);
                }
        }
        else { 
            return -1;
        }
    }
}
