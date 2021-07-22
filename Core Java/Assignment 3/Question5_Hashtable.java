package assignment3.java;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Employee{
	String name;
	int id;
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
		 return this.id;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj)
            return true;
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
        Employee emp = (Employee) obj;
        return (emp.name.equals(this.name)  && emp.id == this.id);
	}
	
	
}
public class Question5_Hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Employee, Integer> h = new Hashtable<>();
		Employee e1 = new Employee("Himani",5);
		Employee e2 = new Employee("Himani",5);
		Employee e3 = new Employee("Himani",5);
		Employee e4 = new Employee("Javed",8);
		Employee e5 = new Employee("Prachi",20);
		
		h.put(e1,47);
		h.put(e2,35);
		h.put(e3,44);
		h.put(e4,55);
		h.put(e5,25);
		
		for(Employee emp : h.keySet())
        {
            System.out.println(h.get(emp).toString());
        }
		
		/*Employee g1 = new Employee("aditya", 1);
		Employee g2 = new Employee("aditya", 1);
          
        Map<Employee, String> map = new HashMap<Employee, String>();
        map.put(g1, "CSE");
        map.put(g2, "IT");
          
        for(Employee emp : map.keySet())
        {
            System.out.println(map.get(emp).toString());
        }*/

	}

}
