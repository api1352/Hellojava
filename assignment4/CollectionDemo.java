package assignment4;
import java.util.*;

public class CollectionDemo {
	  
	    public static void main(String args[])
	    {
	        List<String> al = new ArrayList<>();
	        al.add("Robin");
	        al.add("Rohit");
	        al.add("Rahul");
	        System.out.println("The list contains: ");	        
	        for (String fruit : al)
	            System.out.println(fruit);
	        
	        Set<String> Set = new HashSet<String>(); 
	        Set.add("robin");
	        Set.add("rohit");
	        Set.add("rahul");
	        System.out.println("The Set contains: ");
	        System.out.println(Set);
	        
	        Map<Integer, String> myMap
            = new HashMap<Integer, String>();
  
            myMap.put(100, "Robin");
            myMap.put(101, "Rohit");
            myMap.put(102, "Rahul");
            System.out.println("The Map contains: ");
            for (Map.Entry m : myMap.entrySet()) {
        	  System.out.println(m.getKey() + " " + m.getValue());
	        }
	}
}