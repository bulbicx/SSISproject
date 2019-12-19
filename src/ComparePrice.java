import java.util.Comparator;

/**
 * This class is used in the BinSearch class as a comparator between 2 prices.
 * It is used exactly in line(27)
 * 
 * @author Marco Castellana
 * @author Simone Agus
 */
public class ComparePrice implements Comparator<SSinfo>{

    public ComparePrice() {
    }
    
    @Override
    public int compare(SSinfo s1, SSinfo s2){
        if(s1.getPrice() == s2.getPrice())
        {
            return 0;
        } else {
            return -1;
        }
    }
}
