package assignment3.java;

import java.util.Comparator;
import java.util.TreeSet;
public class Question1_Person implements Comparable {
	double weight;
	String name;
	double height;
	
	public Question1_Person(double weight, String name, double height) {
		super();
		this.weight = weight;
		this.name = name;
		this.height = height;
	}

	@Override
	public String toString() {
		return "weight=" + weight + " name=" + name + " height=" + height + "\n";
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Question1_Person p1 = new Question1_Person(40,"Tarun",5.7);
		Question1_Person p2 = new Question1_Person(30,"Rahul",4.11);
		Question1_Person p3 = new Question1_Person(45,"Tina",5.4);
		Question1_Person p4 = new Question1_Person(65,"Ayushi",5.5);
		Question1_Person p5 = new Question1_Person(55,"Aman",6);
		Question1_Person p6 = new Question1_Person(55,"Somnath",5.2);
		
		TreeSet t = new TreeSet();
		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);
		t.add(p5);
		t.add(p6);
		System.out.println(t);

	}

	@Override
	public int compareTo(Object o) {
		double w1 = this.weight;
		double h1 = this.height;
		Question1_Person p = (Question1_Person)o;
		double w2 = p.weight;
		double h2 = p.height;
		if(w1<w2) {
			return -1;
		}
		else if(w1==w2) {
			if(h1<h2) {
				return -1;
			}else if(h1>h2){
				return 1;
			}else {
				return 0;
			}
		}else if(w1>w2) {
			return 1;
		}else {
			return 0;
		}
		
	}

}
