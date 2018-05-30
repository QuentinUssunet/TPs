package presentation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lanceur {
	
	public static void main(String[] args) {
		// déclarer et initialiser la collection
		Set hash = new HashSet();
		hash.add(12);
		hash.add("toto");
		hash.add(12.5);
		hash.add(-5.3);
		hash.add(12);
		
		// parcours avec for
		for (Object item : hash) {
			System.out.println(item);
		}
		System.out.println("-------");
		//parcours savec un iterator
		Iterator it = hash.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
