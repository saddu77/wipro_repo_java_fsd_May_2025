package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Alex");
		al.add("Bob");
		al.add("Clare");
		al.add("Daniel");
		al.add("John");
		
		Iterator<String> itrObj = al.iterator();
		while(itrObj.hasNext()) {
			System.out.println(itrObj.next());
		}
		
		
	}

}
