package assignment3.java;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Question3_ArrayList_ListIterator {

	public static void main(String[] args) {
		
		
		
        List<String> l = new ArrayList<>();
  
        l.add("O");
        l.add("L");
        l.add("L");
        l.add("E");
        l.add("H");
  
        ListIterator<String> List_Iterator
            = l.listIterator(l.size());
  
        System.out.println("Reversed String will be:");
  
        
        while (List_Iterator.hasPrevious()) {
        	
            System.out.println(List_Iterator.previous());
        }
	}

}
