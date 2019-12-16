
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arkan
 */
public class checking {
    
    
    public static void main(String[] args){
      message();
    }
    public checking(){

    }
    public static void message()
    {
        String sofaId = "abcd";
        String sofaName = "mom";
        String categories = "lol";
        String colour = "black";
        double price = 100;
//        ArrayList<SSinfo> listDuplicates = new ArrayList<>();
        Set <SSinfo> set = new HashSet<>();
        if(set.size() <= 0){
            set.add(new SSinfo(sofaId, sofaName, categories, colour, price));    
        }else{
            boolean duplicates = false;
            for(SSinfo temp : set) {
                if(temp.getSofaId().equals(sofaId)){
                JOptionPane.showMessageDialog(null, "The item cannot be added as it does already exist");
                duplicates = true;
                break;
                } 
            }
            if(!duplicates){
                set.add(new SSinfo(sofaId, sofaName, categories, colour, price));
            }   
        }
        
    
        
       
//        for(SSinfo temp : listDuplicates) {
//            if(temp.getSofaId().equals(sofaId)){
//                System.out.println("no it cannot be add");
//               break;
//            } else {
//                listDuplicates.add(new SSinfo(sofaId, sofaName, categories, colour, price));
//            }
//            System.out.println(temp.getSofaId() + " name: " + temp.getSofaName());
//        } 
//        listDuplicates.add(sofaId,sofaName,categories,colour,price);
//        listDuplicates.add(new SSinfo(sofaId, sofaName, categories, colour, price)); 
        //set.add(listDuplicates);
        
      
//        set.addAll(listDuplicates);
//        if( listDuplicates.contains(new SSinfo("abc"))){
//            System.out.println("duplicate");
//        }
        //ArrayList<SSinfo> listWithoutDuplicates = new ArrayList<>(set);
        
        sofaId = "abcd";
        sofaName = "him";
        categories = "lol";
        colour = "black";
        price = 100;
        
        if(set.size() <= 0){
            set.add(new SSinfo(sofaId, sofaName, categories, colour, price));
        }else{
            boolean duplicates = false;
            for(SSinfo temp : set) {
                if(temp.getSofaId().equals(sofaId)){
                System.out.println("no it cannot be add");
                duplicates = true;
                break;
                } 
            }
            if(!duplicates){
                set.add(new SSinfo(sofaId, sofaName, categories, colour, price));
            }   
        }
        for(SSinfo temp : set) {
            System.out.println(temp.getSofaId() + " name: " + temp.getSofaName());
        }
        
//        listDuplicates.add(new SSinfo(sofaId, sofaName, categories, colour, price));
       // System.out.println(listDuplicates.size());
        System.out.println(set.size());
    }

}
