package in.co.kavya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("my first program");
		
		Bike b1=new Bike();
		b1.canRun();
		
		Himalaya h1=new Himalaya();
		h1.canRun();
		
		Kavya k1=new Kavya();
		k1.canWrite();
		
		Sajjith s1=new Sajjith(2,"Bittu");
		
		
		Vector<Kavya> v1=new Vector<>();
		v1.add(k1);
		
		Kavya k2=new Kavya();
		v1.add(k2);
		
		
		List<Sajjith> r1=new ArrayList<>();
		r1.add(s1);
		
		
		HashMap<Integer, String> m1=new HashMap<>(); 
		m1.put(23, "sowmya");
		m1.put(34, "sravanthi");
		String name=m1.get(34); 
		System.out.println(name);
		
		
		
		
		
		
		int x;
		for(x=3; x<=5; x++) {
			System.out.println(x);
			
			if(x==4) 
			{
				break;
			}
		}
		
	}
	
	

}
